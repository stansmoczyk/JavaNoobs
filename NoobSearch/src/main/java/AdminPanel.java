import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminPanel implements ActionListener {
    //This will be the admin access panel. We can add a button on the main page to open this one.
        //Condensed code labels and made private
        private JFrame frame;
        private JLabel adminWelcomeLabel;
        private JTextField fileField;
        private JButton addFileButton, removeFileButton, ReturnSearchButton;
        private JPanel panel;
        private JPanel mainPanel;
        private JPanel userViewPanel;


        public AdminPanel() {
            frame = new JFrame();
            mainPanel = new JPanel();
            userViewPanel = new JPanel();
            adminWelcomeLabel = new JLabel("Welcome to the Noobs Search Engine Admin Panel");
            fileField = new JTextField("Enter File");
            addFileButton = new JButton("Add File");
            removeFileButton = new JButton("Remove File");
            ReturnSearchButton = new JButton("Search Panel");
            ReturnSearchButton.addActionListener(this);



            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(userViewPanel);
            panel.add(adminWelcomeLabel);



            panel.add(fileField);
            panel.add(addFileButton);//Adds add file button
            panel.add(removeFileButton);//Adds remove file button
            panel.add(ReturnSearchButton);//Adds return to search button



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
