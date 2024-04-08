package RegisterNew;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.*;

public class NewRegister extends JFrame {

JLabel jLabelUname = new JLabel("username:");
JTextField jTxtUname = new JTextField(8);


JLabel jLabelGender = new JLabel("Gender");

JLabel JLabelEmail = new JLabel("Email");
JTextField jTxtEmail = new JTextField(8);

JRadioButton jLabelMale = new JRadioButton("Male");
JRadioButton jLabelFemale = new JRadioButton("Female");

JLabel jLabelCourse = new JLabel("select course:");
String course[] = {"BCA", "BSCIT", "BIT", "BIM", "BEC"};


JLabel jLabelAge = new JLabel("Select your age");
JSlider AgeSlider = new JSlider( 0, 50, 25);


    NewRegister() {
        setTitle("Register for New Account");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        jTxtUname.setBounds(50, 50, 150, 20);
        jTxtEmail.setBounds(50, 50, 150, 20);
        RegisterUser();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }



    public static void main(String[] args) {

        new NewRegister();
    }

    void RegisterUser() {
        Container window = getContentPane();
        window.setLayout(new GridLayout(10, 10));
        window.add(jLabelUname);
        window.add(jTxtUname);

        window.add(JLabelEmail);
        window.add(jTxtEmail);


        window.add(jLabelGender);
        window.add(jLabelMale);
        window.add(jLabelFemale);

window.add(jLabelAge);
window.add(AgeSlider);

    }
}

