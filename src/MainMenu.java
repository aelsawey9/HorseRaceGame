import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame {
    private static final long serialVersionUID = 1L; // no clue what that is but it made the code work
    private JLabel gameName = new JLabel("Animal Race", SwingConstants.CENTER);
    private OptionsPanel options;

    public MainMenu() {

        super("Main Menu"); // frame/window titled Main Menu
        this.getContentPane().setBackground(Color.black);

        //PLay with the font to make it a proper header
        Font f = new Font("Verdana", Font.BOLD, 32);
        gameName.setVerticalAlignment(SwingConstants.TOP);
        gameName.setFont(f);
        gameName.setForeground(Color.WHITE);

        setLayout(new BorderLayout());
        this.options = new OptionsPanel();
        add(options, BorderLayout.CENTER);

        /*

        GridBagLayout or just GridLayout is better to use?

        */

        this.add(gameName, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program using the x button
        this.setResizable(false);
        setSize(800, 600);
        setLocationRelativeTo(null); // center the frame
        setVisible(true); // after all these modifications, make the frame visible
    }

}