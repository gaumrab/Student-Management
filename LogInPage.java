import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/* I Have added MouseLister if any user will enter in
passwordField or userName both the fields will change colour and font size will also
increase */


class LogInPage extends JFrame implements MouseListener {

    //    JPanel backgroundOfPage1; // back - ground1 for welcome
//    JPanel backgroundOfPage2 ; // back - ground2 for login
    JLabel logInContainer;  // label for Name
    JLabel passwordContainer; // label for password
    JLabel LoginL; // label for print Log - In
    JTextField userName; // text - field for name
    JPasswordField passwordField; // password - field for password
    JButton submit; // Button for submission
    JLabel img;

    LogInPage() {

        // label work for Log - In is Here:
        LoginL = new JLabel("Log-In");
        LoginL.setFont(new Font("Small caps ", Font.BOLD, 49));
        LoginL.setForeground(Color.BLACK);

        // username and password textField --> work Here: (Note: Adding MouseListener in Both of text-field)
        userName = new JTextField();
        userName.setFont(new Font("Small caps ", Font.BOLD, 15));
        userName.addMouseListener(this);
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Small caps ", Font.BOLD, 14));
        passwordField.addMouseListener(this);


        // label work for  password is Here(Note :-->  Adding  textFields in label is here);
        passwordContainer = new JLabel();
        passwordContainer.setText("Password  ");
        passwordContainer.setFont(new Font("Small caps ", Font.BOLD, 20));
        passwordContainer.setForeground(Color.BLACK);
        passwordContainer.add(passwordField);
        passwordField.setFont(new Font("Small caps ", Font.BOLD, 14));
        // label work for  name is Here(Note :-->  Adding  textFields in label is here);
        logInContainer = new JLabel();
        logInContainer.setText("Name");
        logInContainer.setOpaque(false);
        logInContainer.setForeground(Color.BLACK);
        logInContainer.add(userName);
        logInContainer.setFont(new Font("Small caps ", Font.BOLD, 20));

        submit = new JButton("SUBMIT");
        submit.setFocusable(false);
        submit.setForeground(Color.white);
        submit.setBackground(Color.black);
        // Location for all the components on Layout is here:
        LoginL.setBounds(540, 20, 200, 200);          // log-In label
        logInContainer.setBounds(540, 220, 400, 50);      // label
        userName.setBounds(650, 240, 200, 20);             // textField
        passwordContainer.setBounds(540, 290, 400, 50);  // label
        passwordField.setBounds(650, 310, 200, 20);    // passwordField
        submit.setBounds(600, 400, 200, 30);

        // image work Here:

        img = new JLabel();
        img.setIcon(new ImageIcon("C:\\Users\\gaura\\Pictures\\student.jpg"));
        img.setBounds(10, 10, 590, 600);


        // JFrame - Work is Here:
        this.add(userName);
        this.add(passwordField);
        this.add(logInContainer);
        this.add(passwordContainer);
        this.add(LoginL);
        this.add(submit);
        this.add(img);
        this.getContentPane().setBackground(Color.white);
        this.setLayout(null);
        this.setSize(900, 650);
        this.setLocation(100, 20);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
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

}
