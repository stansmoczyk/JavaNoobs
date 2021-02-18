import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        JFrame frame = new JFrame();

        JButton button = new JButton("Label goes here");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NoobSearch");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] arg){
        new GUI();
    }
}
