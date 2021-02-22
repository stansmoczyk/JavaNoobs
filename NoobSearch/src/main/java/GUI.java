import javax.swing.*;
import java.awt.*;
 /*Having all the { (curve brackets) to one side helps me see them with my dyslexia.-JoshM.
 * ie
 * {
 * Code in the middle
 * }
 * */
public class GUI
{
    public GUI()
    {
        JFrame frame = new JFrame();
        JLabel label1 = new JLabel("Welcome to the Noobs Search Engine");
        JTextField search = new JTextField("Type keyword");
        JRadioButton label2 = new JRadioButton("and");
        JRadioButton label3 = new JRadioButton("or");
        JRadioButton label4 = new JRadioButton("phase");
        JButton button = new JButton("Search");
        JButton button1 = new JButton("Feeling lucky");
        JButton button2 = new JButton("About");
        JLabel label = new JLabel("Button clicks: 0");


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label1);
        panel.add(label2); //and search
        panel.add(label3);//or search
        panel.add(label4);//phase search
        panel.add(search);
        panel.add(button);//Adds Search button
        panel.add(button1);//Adds Feeling lucky button
        panel.add(button2);//Adds About button
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NoobSearch");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] arg)
    {
        new GUI();

    }
}
