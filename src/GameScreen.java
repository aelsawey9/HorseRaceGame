import java.awt.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class GameScreen extends JFrame implements WindowListener {

    private static final long serialVersionUID = 1L;
    public Visual actualTrack;
    private MainMenu main;
    private AnimalPanel animalPanel = new AnimalPanel();
    private int winCounter = 3; //counter to stop when 3 have won

    public GameScreen() {
        super("Race");

        this.addWindowListener(this);
        // this.main.makePlayer();
        this.animalPanel.setGameScreen(this);
        this.animalPanel.setButtonIcons();
        int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        this.setResizable(false);
        this.setSize(screenWidth, screenHeight);
        this.setLocationRelativeTo(this);

        setLayout(new BorderLayout());

        this.actualTrack = new Visual();
        actualTrack.setGameScreen(this);
        JPanel test = new JPanel();
        test.setPreferredSize(new Dimension(402, 1080));
        test.setBackground(Color.RED);
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(402, 1080));
        // east.setBackground(Color.BLACK);
        east.setOpaque(false);
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        north.setPreferredSize(new Dimension(1536, 170));
        // north.setBackground(Color.GRAY);
        north.setOpaque(false);
        south.setPreferredSize(new Dimension(1536, 170));
        south.setBackground(Color.WHITE);
        add(actualTrack, BorderLayout.CENTER);
        add(test, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(animalPanel, BorderLayout.NORTH);
        add(south, BorderLayout.SOUTH);
    }

    public void gameBackground() {
        if (this.main.getTheme() == true) {
            this.setBackground(Color.BLACK);
        }
        else {
            this.setBackground(Color.WHITE);
        }
        this.setVisible(true);
    }

    public void setMain(MainMenu tMain) {
        this.main = tMain;
    }

    public MainMenu getMain() {
        return this.main;
    }

    public AnimalPanel getAnimalPanel() {
        return this.animalPanel;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        this.main.setGameNumber(1);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //I don't care about these methods, only windowClosing()
    }

}