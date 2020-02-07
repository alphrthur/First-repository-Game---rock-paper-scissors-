//libraries
import java.awt.GridLayout;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;


public class Janela extends JFrame{


    //The sector of variables.
    int index;
    String aux;
    String aux2;
    //
    //Buttons in using.
    JButton rock = new JButton("Rock.");
    JButton paper = new JButton("Paper.");
    JButton scissors = new JButton("Scissors.");
    JButton start = new JButton("Run forest, run!.");
    //the text camp 
    //show the (random method) result.
    JTextField exit = new JTextField();
    //
    public Janela(){
        
        //Layout 
        //layout manager creation (in case.. the gridlayout).   
        setLayout(new GridLayout(1,2));
        //
        //adding the buttons and text camp.
        add (rock);
        add (paper);
        add (scissors);
        add (exit);
        add (start);
        // 
       
    //is action when i click in "start"   
    start.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        //this is a method what generate a aleatory number.
            Random resultgerador = new Random();
            resultgerador.nextInt(3);
        //
        //to prove it, this will display the number generated by the method (obs..: at the terminal).
            System.out.println(resultgerador.nextInt(3));
        //
        //(index) this is a auxiliar variable what armazenate the number generate.
            index = resultgerador.nextInt(3);
        //and exibition..(obs..: once again in terminal).
            System.out.println(index);
        //
        //this "if" structure is used to transform the number generated between 0 and 2 into stone, paper or scissors
            if (index == 0){
                aux = ("rock");
                exit.setText(aux);
                switch (aux2){
                    case ("paper") :
                        JOptionPane.showMessageDialog(null, "Winner. !!");
                        break;
                    case ("scissors") :
                        JOptionPane.showMessageDialog(null, "loser like me...");
                        break;
                    default :
                        JOptionPane.showMessageDialog(null, "...a tie.");
                }
            } else if(index == 1){
                aux = ("paper");
                exit.setText(aux); 
                switch (aux2){
                    case ("scissors") :
                        JOptionPane.showMessageDialog(null, "Winner. !!");
                        break;
                    case ("rock") :
                        JOptionPane.showMessageDialog(null, "loser like me...");
                        break;
                    default :
                        JOptionPane.showMessageDialog(null, "...a tie.");
                }
            } else if(index == 2){
                aux = ("scissors");
                exit.setText(aux);
                switch (aux2){
                    case ("rock") :
                        JOptionPane.showMessageDialog(null, "Winner. !!");
                        break;
                    case ("paper") :
                        JOptionPane.showMessageDialog(null, "loser like me...");
                        break;
                    default :
                        JOptionPane.showMessageDialog(null, "...a tie.");
                }
            }
        //
        }
    });
    //this is a action to buttons: rock, paper and scissors.
    rock.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
           aux2 = ("rock");
           JOptionPane.showMessageDialog(null, "The rock is selected.");
       }
    });
    paper.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            aux2 = ("paper");
            JOptionPane.showMessageDialog(null, "The paper is selected.");
        }
    });
    scissors.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        aux2 = ("scissors");
        JOptionPane.showMessageDialog(null, "The scissors is selected.");
        }
    });
    //
    //the title for the container in grid.
        setTitle("Welcome to the game.");
    //the size of the container
        setSize(500,120);
    //toggle for exibition
        setVisible(true);
    } 
}
