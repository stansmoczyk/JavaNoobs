import javax.swing.*;
import java.awt.*;
 
public class GUI {
    public GUI(){
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Welcome to the Noobs Search Engine");
        JTextField search = new JTextField("Type keyword");
        JLabel label5 = new JLabel("Search by:");
        JRadioButton label2 = new JRadioButton("and");
        JRadioButton label3 = new JRadioButton("or");
        JRadioButton label4 = new JRadioButton("phase");
        JButton button = new JButton("Search");
        JButton button1 = new JButton("Feeling lucky");
        JLabel label = new JLabel("Button clicks: 0");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(85, 150, 85, 150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label1);
        panel.add(search);
        panel.add(label5);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);
        panel.add(button);
        panel.add(button1);
        panel.add(label);




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
