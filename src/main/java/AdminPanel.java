//Team members: Joshua Moranville, Joshua Scott, Stan Smoczyk, Yadimar Torres
//Team name: JavaNoobs


import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class AdminPanel implements ActionListener {
    //This will be the admin access panel. We can add a button on the main page to open this one.
        //Condensed code labels and made private
        private final JFrame frame;
        private final JLabel welcomeLabel;
        private final JTextField searchField;
        private final JButton addButton, removeButton, ReturnSearchButton;
        private final JPanel panel;
        private final JPanel mainPanel;
        private final JPanel userViewPanel;


        public AdminPanel() {
            frame = new JFrame();
            mainPanel = new JPanel();
            userViewPanel = new JPanel();
            welcomeLabel = new JLabel("Welcome to the Noobs Search Engine Admin Panel");
            searchField = new JTextField("Type keyword");
            addButton = new JButton("Add File");
            removeButton = new JButton("Remove File");
            ReturnSearchButton = new JButton("Search Panel");
            ReturnSearchButton.addActionListener((ActionListener) this);




            panel = new JPanel();
            panel.setBorder(BorderFactory.createEmptyBorder(80, 150, 20, 150));
            panel.setLayout(new GridLayout(0, 1));

            panel.add(userViewPanel);
            panel.add(welcomeLabel);



            panel.add(searchField);
            panel.add(addButton);//Adds add button
            panel.add(removeButton);//Adds remove button
            panel.add(ReturnSearchButton);//Adds About button
            addButton.addActionListener(this); //adds action listener for addButton button

            frame.add(panel, BorderLayout.CENTER);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setTitle("Admin Panel");
            frame.pack();
            frame.setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e)
        {
        if(e.getSource()==ReturnSearchButton) {
            frame.dispose();
            SearchPanel searchPanel = new SearchPanel();
        }
        if(e.getSource()==addButton){ //open file load dialog box
        final JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT & HTML files", "txt","html");
        fc.setFileFilter(filter);
        Component parent = null;
        int returnVal = fc.showOpenDialog(parent);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            try{
                FileWriter fileWriter = new FileWriter(fc.getSelectedFile()+".txt");
                //Get the file to save just not how it should.
                fileWriter.close();


            }catch (Exception ex) {
                ex.printStackTrace();
            }
            System.out.println("You chose to open this file: " + fc.getSelectedFile().getName());
            //This is a test to make sure it gets here.
        }
    }

    }
}
