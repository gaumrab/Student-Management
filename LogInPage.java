import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/* I Have added MouseLister if any user will enter in
passwordField or userName both the fields will change colour and font size will also 
increase */


public class LogInPage extends JFrame implements MouseListener {
    JPanel backgroundOfPage;
    JLabel logInContainer;
    JLabel passwordContainer;
    JTextField userName;
    JPasswordField passwordField;
    String name;
    char password[] = new char[8];
    LogInPage(){
        userName = new JTextField();
     userName.setBounds(100,19,200,20);
     userName.setFont(new Font("MV Boli",Font.BOLD,8));
       name =  userName.getText();
       userName.addMouseListener(this);


       passwordField = new JPasswordField();
       password = passwordField.getPassword();
        passwordField  = new JPasswordField();
        passwordField.setBounds(117,20,200,20);
        passwordField.addMouseListener(this);


        passwordContainer = new JLabel();
        passwordContainer.setText("Password  ");
        passwordContainer.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
        passwordContainer.setBounds(200,250,400,50);
        passwordContainer.add(passwordField);
        passwordField.setFont(new Font("MV Boli",Font.BOLD,8));

        logInContainer = new JLabel();
        logInContainer.setText("Name");
        logInContainer.setBackground(new Color(108,108,108,108));
       logInContainer.setOpaque(false);
        logInContainer.setBounds(200,200,400,50);
        logInContainer.add(userName);
        logInContainer.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));




        backgroundOfPage = new JPanel();
        backgroundOfPage.setSize(500,500);
        backgroundOfPage.setBackground(Color.cyan);backgroundOfPage.setLayout(null);
        backgroundOfPage.add(logInContainer);
        backgroundOfPage.add(passwordContainer);


        this.setSize(1000,720);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.add(backgroundOfPage,BorderLayout.CENTER);
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
        userName.setFont(new Font("MV Boli",Font.BOLD,15));
     passwordField.setFont(new Font("MV Boli",Font.BOLD,15));
    }

    @Override
    public void mouseExited(MouseEvent e) {
       userName.setBackground(Color.WHITE);
        passwordField.setBackground(Color.WHITE);
        userName.setFont(new Font("MV Boli",Font.BOLD,8));
        passwordField.setFont(new Font("MV Boli",Font.BOLD,8));
    }
}
