import javax.swing.*;
import java.awt.*;

public class AdminPanel
{

    //Condensed code labels and made private
    private JFrame frame;
    private JLabel label1;
    private JTextField search;
    private JRadioButton label2, label3, label4;
    private JButton button, button1, button2, button3, button4, button5;
    private JPanel panel;

    public AdminPanel()
    {
        frame = new JFrame();
        label1 = new JLabel("Welcome to the Noobs Search Engine");
        search = new JTextField("Type keyword");
        label2 = new JRadioButton("and");
        label3 = new JRadioButton("or");
        label4 = new JRadioButton("phase");
        button = new JButton("Search");
        button1 = new JButton("Feeling lucky");
        button2 = new JButton("About");
        button3 = new JButton("Upload");
        button4 = new JButton("Delete");
        button5 = new JButton("Refresh");


        panel = new JPanel();
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
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);



        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NoobSearch");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String []arg)
    {
        new AdminPanel();
    }

}