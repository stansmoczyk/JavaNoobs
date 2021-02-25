import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel implements ActionListener {
    //This will be the admin access panel. We can add a button on the main page to open this one.
        //Condensed code labels and made private
        private JFrame frame;
        private JLabel welcomeLabel;
        private JTextField searchField;
        private JButton searchButton, luckyButton, ReturnSearchButton;
        private JPanel panel;
        private JPanel mainPanel;
        private JPanel userViewPanel;


        public AdminPanel() {
            frame = new JFrame();
            mainPanel = new JPanel();
            userViewPanel = new JPanel();
            welcomeLabel = new JLabel("Welcome to the Noobs Search Engine Admin Panel");
            searchField = new JTextField("Type keyword");
            searchButton = new JButton("Add File");
            luckyButton = new JButton("Remove File");
            ReturnSearchButton = new JButton("Search Panel");
            ReturnSearchButton.addActionListener((ActionListener) this);



            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(userViewPanel);
            panel.add(welcomeLabel);



            panel.add(searchField);
            panel.add(searchButton);//Adds Search button
            panel.add(luckyButton);//Adds Feeling lucky button
            panel.add(ReturnSearchButton);//Adds About button



            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Admin Panel");
            frame.pack();
            frame.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ReturnSearchButton){
            frame.dispose();
            SearchPanel searchPanel = new SearchPanel();
        }
    }
}
