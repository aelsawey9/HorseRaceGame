import java.awt.*;

import javax.swing.*;

public class MainMenu extends JFrame {
    private static final long serialVersionUID = 1L;    //no clue what that is but it made the code work
    private JTextArea textArea; //space to write text for now
    private JButton button;

    public MainMenu() {
        super("Main Menu"); //frame/window titled Main Menu

        setLayout(new BorderLayout());  

        textArea = new JTextArea();
        button = new JButton("Dysfunctional...");

        add(textArea, BorderLayout.CENTER);
        add(button, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close the program using the x button
        setSize(800, 600);
        setLocationRelativeTo(null);    //center the frame
        setVisible(true);   //after all these modifications, make the frame visible
    }
}
