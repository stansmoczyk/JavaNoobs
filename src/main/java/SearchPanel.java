import javax.accessibility.Accessible;
import javax.swing.*;
//import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class SearchPanel {
//Team members: Joshua Moranville, Joshua Scott, Stan Smoczyk, Yadimar Torres
//Team name: JavaNoobs


/*Having all the { (curve brackets) to one side helps me see them with my dyslexia.-JoshM.
 * ie
 * {
 * Code in the middle
 * }
 * */
public class SearchPanel extends JComponent implements ActionListener, Accessible {
    //Condensed code labels and made private
    private JFrame frame;
    private JLabel welcomeLabel;
    private JTextField searchField;
    private JCheckBox andLabel, orLabel, phraseLabel;
    private JButton searchButton,/*loadFile,*/ aboutButton;
    private JPanel panel;
    private JButton adminPanel, admin;
    private JPanel mainPanel;
    private JPanel userViewPanel;


    public SearchPanel() {
        frame = new JFrame();
        mainPanel = new JPanel();
        userViewPanel = new JPanel();
        welcomeLabel = new JLabel("Welcome to the Noobs Search Engine");
        searchField = new JTextField("Type keyword");
        andLabel = new JCheckBox("and");
        orLabel = new JCheckBox("or");
        phraseLabel = new JCheckBox("phrase");
        searchButton = new JButton("Search");
       // loadFile = new JButton("Load File");
        aboutButton = new JButton("About");
        adminPanel = new JButton("Admin Panel");
        //final JFileChooser fc = new JFileChooser();





        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(adminPanel);// add admin
        panel.add(userViewPanel);
        panel.add(welcomeLabel);
        panel.add(andLabel); //and search
        panel.add(orLabel);//or search
        panel.add(phraseLabel);//phase search
        panel.add(searchField);
        panel.add(searchButton);//Adds Search button
        //panel.add(loadFile);//Adds Feeling lucky button
        panel.add(aboutButton);//Adds About button
        adminPanel.addActionListener(this);
       // loadFile.addActionListener(this); //adds action listener for loadFile button


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("NoobSearch");
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
        {
        if(e.getSource()==adminPanel){
            frame.dispose();
            AdminPanel adminPanel = new AdminPanel();
        }

    }
}
