import javax.swing.*;
import java.awt.*;

public class HeadingLabel extends JLabel {
    Image image;
    HeadingLabel(){
        image = new ImageIcon("/home/avinashkumar/IdeaProjects/StudentManagementSystem/src/bg2.jpg").getImage();
        this.setBounds(0,0,10,10);
        this.setSize(2000,100);

    }
    public void paint(Graphics g){
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image,0,0,null);
        g2D.setFont(new Font(Font.SANS_SERIF,Font.BOLD,45));
        g2D.setPaint(Color.RED);
        g2D.drawString("Welcome",230,65);

    }
}
