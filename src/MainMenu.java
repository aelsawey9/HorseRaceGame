import java.awt.*;
import java.util.HashMap;

import javax.swing.*;

public class MainMenu extends JFrame {
    private static final long serialVersionUID = 1L; // no clue what that is but it made the code work
    private JLabel gameName = new JLabel("Animal Race", SwingConstants.CENTER);
    private OptionsPanel options;
    private GameScreen game;
    private boolean darkTheme = true;
    private int oneGameOnly = 1;
    private Visual actualTrack;
    private HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

    public MainMenu() {
        
        super("Main Menu"); // frame/window titled Main Menu

        this.getContentPane().setBackground(Color.BLACK);

        //PLay with the font to make it a proper header
        Font f = new Font("Verdana", Font.BOLD, 45);
        gameName.setVerticalAlignment(SwingConstants.TOP);
        gameName.setFont(f);
        gameName.setOpaque(true);
        gameName.setBackground(Color.BLACK);
        gameName.setForeground(Color.WHITE);

        setLayout(new BorderLayout());
        this.options = new OptionsPanel();
        this.options.setMain(this);
        add(options, BorderLayout.CENTER);

        this.add(gameName, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the program using the x button
        this.setResizable(false);
        setSize(800, 600);
        setLocationRelativeTo(null); // center the frame
        setVisible(true); // after all these modifications, make the frame visible
    }

	public void whiteTheme() {

        setVisible(false);

        this.setBackground(Color.WHITE);
        gameName.setBackground(Color.WHITE);
        gameName.setForeground(Color.MAGENTA);
        gameName.setOpaque(true);

        setVisible(true); // after all these modifications, make the frame visible
        
    }
    
    public void darkTheme() {

        setVisible(false);

        this.setBackground(Color.BLACK);
        gameName.setBackground(Color.BLACK);
        gameName.setForeground(Color.WHITE);
        gameName.setOpaque(true);

        setVisible(true); // after all these modifications, make the frame visible
       
    }

    public boolean getTheme() {
        return this.darkTheme;
    }

	public void setTheme(boolean b) {
        this.darkTheme = b;
    }
    
    public void makeGameScreen() {
        if (oneGameOnly > 0) {
            this.game = new GameScreen();
            this.game.setMain(this);
            this.game.gameBackground();
            this.oneGameOnly--;
        }
    }

}