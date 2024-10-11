
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;



public class Calculator implements ActionListener {

    JFrame frame;
    JTextField textField;
    JButton[] numbeButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton,subButton,multButton,divButton,decButton,equButton,clearButton;

    Font myFont = new Font("Ink Free",Font.BOLD,30);
    double num1=0,num2=0,result=0;
    char operator;

    public Calculator() {
    }

    

    public static void main(String[] args) {

        Calculator calc = new Calculator();
        
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}