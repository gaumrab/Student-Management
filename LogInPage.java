import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/* I Have added MouseLister if any user will enter in
passwordField or userName both the fields will change colour and font size will also
increase */


public class Main extends JFrame implements MouseListener {

    JPanel backgroundOfPage1; // back - ground1 for welcome
    JPanel backgroundOfPage2 ; // back - ground2 for login
    JLabel logInContainer;  // label for Name
    JLabel passwordContainer; // label for password
    JLabel LoginL; // label for print Log - In
    JTextField userName; // text - field for name
    JPasswordField passwordField; // password - field for password
    JButton submit; // Button for submission

    Main(){

        // label work for Log - In is Here:
         LoginL = new JLabel("Log-In");
        LoginL.setFont(new Font("Small caps ", Font.BOLD, 49));
        LoginL.setForeground(Color.lightGray);

        // username and password textField --> work Here: (Note: Adding MouseListener in Both of text-field)
        userName = new JTextField();
        userName.setFont(new Font("Small caps ",Font.BOLD,15));
        userName.addMouseListener(this);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Small caps ",Font.BOLD,14));
        passwordField.addMouseListener(this);


      // label work for  password is Here(Note :-->  Adding  textFields in label is here);
        passwordContainer = new JLabel();
        passwordContainer.setText("Password  ");
        passwordContainer.setFont(new Font("Small caps ",Font.BOLD,20));
        passwordContainer.setForeground(Color.lightGray);
        passwordContainer.add(passwordField);
        passwordField.setFont(new Font("Small caps ",Font.BOLD,14));
        // label work for  name is Here(Note :-->  Adding  textFields in label is here);
        logInContainer = new JLabel();
        logInContainer.setText("Name");
        logInContainer.setOpaque(false);
        logInContainer.setForeground(Color.lightGray);
        logInContainer.add(userName);
        logInContainer.setFont(new Font("Small caps ",Font.BOLD,20));

        submit = new JButton("SUBMIT");
        submit.setFocusable(false);
        submit.setForeground(Color.lightGray);
        submit.setBackground(Color.black);
       // Location for all the components on Layout is here:
        LoginL.setBounds(470,80,200,200);          // log-In label
        userName.setBounds(600,320,200,20);             // textField
        logInContainer.setBounds(470,300,400,50);      // label
        passwordContainer.setBounds(470,400,400,50);  // label
        passwordField.setBounds(600,420,200,20);    // passwordField
        submit.setBounds(600,500,100,30);

        // background-1 work Here:
        backgroundOfPage1 = new JPanel();
        backgroundOfPage1.setSize(420,700);
        backgroundOfPage1.setBackground(new Color(10, 50, 6  ));
        backgroundOfPage1.setLayout(null);


        // background-2 work Here:
        backgroundOfPage2 = new JPanel();
        backgroundOfPage2.setSize(900,700);
        backgroundOfPage2.setBackground(new Color(24, 24, 0    ));
        backgroundOfPage2.add(userName);
        backgroundOfPage2.add(passwordField);
        backgroundOfPage2.add(logInContainer);
        backgroundOfPage2.add(passwordContainer);
        backgroundOfPage2.add(LoginL);
        backgroundOfPage2.add(submit);
        backgroundOfPage2.setLayout(null);


        // JFrame - Work is Here:
        this.setSize(900,700);
        this.setLocation(100,20);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(backgroundOfPage1);
        this.add(backgroundOfPage2);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        userName.setBackground(Color.lightGray);
        passwordField.setBackground(Color.lightGray);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        userName.setBackground(Color.WHITE);
        passwordField.setBackground(Color.WHITE);
    }
