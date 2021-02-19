import javax.swing.*;
import java.awt.*;

public class GUI {
    public GUI(){
        /*
         *This code needs more comments to explain what is happening.
         */

        JFrame frame = new JFrame(); //Makes new frame Object

        JButton button = new JButton("Label goes here"); //Adds button object
        JLabel label = new JLabel("Button clicks: 0"); //Adds label object


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button); //Adds button to frame
        panel.add(label); //Adds label to frame

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
