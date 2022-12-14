package createGUI.lib;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.CardLayout;

public class GUI {
    
    //Information variables
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static CardLayout cl = new CardLayout();

    //Window variables
    private JFrame guieditor = new JFrame("CreateGUI");
    private JPanel guiframe = new JPanel();
    
    //Main editor card
    private JPanel editor = new JPanel();

    //View card
    private JPanel view = new JPanel();
    

    public GUI() {

        //Set up window to be fullscreen undecorated
        guieditor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guieditor.setSize(screenSize);
        guieditor.setUndecorated(true);

        


        //Create card
        guiframe.setLayout(cl);

        guiframe.add(editor, "editor");
        guiframe.add(view, "view");

        guieditor.getContentPane().add(guiframe);
        guieditor.setVisible(true);
    }

}