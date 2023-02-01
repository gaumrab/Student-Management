import javax.swing.*;

public class AddStudent extends JFrame {

    ImageIcon image;
    JLabel backgroundLabel;
    HeadingLabel headingLabel;
    AddStudent(){


        //background Label
        backgroundLabel = new JLabel();
        image =  new ImageIcon("/home/avinashkumar/IdeaProjects/StudentManagementSystem/src/backdround.jpg");
        backgroundLabel.setIcon(image);
        headingLabel = new HeadingLabel();
        backgroundLabel.add(headingLabel);

        //for frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(backgroundLabel);


        this.pack();

        this.setVisible(true);
    }
}
