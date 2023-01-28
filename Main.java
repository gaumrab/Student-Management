package com.company;
import javax.swing.*;
import java.awt.*;

public class Main {
    Main(){
        JFrame j = new JFrame("Log-In-->page");
        JLabel l = new JLabel("LOGIN");// label for LoGIN

        JLabel name = new JLabel("Name"); // label for display a name
        JLabel password = new JLabel("Password");// Label for display a password

        JTextField t = new JTextField();// --> for name & roll_Number & Id
        JPasswordField p = new JPasswordField();// --> for password only

        // LogIn Label work Here:
        l.setBounds(480,50,700,50);
        l.setBackground(Color.lightGray);
        l.setForeground(Color.white);

        // Name , Password--> label work Here:
        name.setBounds(250,190,700,50);
        name.setForeground(Color.WHITE);
        password.setBounds(250,300,700,50);
        password.setForeground(Color.WHITE);

       // name and password textField work here:
        t.setBounds(320,190,400,50);
        t.getPreferredSize();
        p.setBounds(320,300,400,50);


        // LOGIN Page Work Here:
        j.getContentPane().setBackground(new Color(29, 157, 70));
        j.add(l);
        j.add(t);
        j.add(p);
        j.add(name);
        j.add(password);
        j.setLocation(100,50);
        j.setSize(1000,600);
        j.setLayout(null);
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
	// write your code here
       Main obj = new Main();
    }
}
