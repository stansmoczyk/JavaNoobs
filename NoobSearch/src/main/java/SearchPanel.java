import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class SearchPanel {

    /*Having all the { (curve brackets) to one side helps me see them with my dyslexia.-JoshM.
     * ie
     * {
     * Code in the middle
     * }
     * */
    public class SearchPanel implements ActionListener {
        //Condensed code labels and made private
        private final JFrame frame;
        private final JLabel welcomeLabel;
        private final JTextField searchField;
        private final JRadioButton andLabel, orLabel, phraseLabel;
        private final JButton searchButton, luckyButton, aboutButton, adminButton;
        private final JPanel panel, mainPanel, userViewPanel;


        public SearchPanel() {
            frame = new JFrame();
            mainPanel = new JPanel();
            userViewPanel = new JPanel();
            welcomeLabel = new JLabel("Welcome to the Noobs Search Engine");
            searchField = new JTextField("Type keyword");
            andLabel = new JRadioButton("and");
            orLabel = new JRadioButton("or");
            phraseLabel = new JRadioButton("phrase");
            searchButton = new JButton("Search");
            luckyButton = new JButton("Feeling lucky");
            aboutButton = new JButton("About");
            adminButton = new JButton("Maintenance");


            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
            panel.setLayout(new GridLayout(0, 1));
            panel.add(adminButton);// add admin
            panel.add(userViewPanel);
            panel.add(welcomeLabel);
            panel.add(andLabel); //and search
            panel.add(orLabel);//or search
            panel.add(phraseLabel);//phase search
            panel.add(searchField);
            panel.add(searchButton);//Adds Search button
            panel.add(luckyButton);//Adds Feeling lucky button
            panel.add(aboutButton);//Adds About button
            adminButton.addActionListener(this);


            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("NoobSearch");
            frame.pack();
            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==adminButton){
                frame.dispose();
                AdminPanel adminPanel = new AdminPanel();
            }
        }
    }
