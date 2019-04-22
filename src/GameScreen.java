import java.awt.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class GameScreen extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JButton enterName;
    private Visual actualTrack;
    private MainMenu main;


    public GameScreen() {
        super("Race");

        int screenHeight = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int screenWidth = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();

        this.setResizable(false);
        this.setSize(screenWidth, screenHeight);
        this.setLocationRelativeTo(this);

        setLayout(new BorderLayout());

        this.actualTrack = new Visual();
        JPanel test = new JPanel();
        test.setPreferredSize(new Dimension(402, 1080));
        test.setBackground(Color.RED);
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(402, 1080));
        east.setBackground(Color.BLACK);
        JPanel north = new JPanel();
        JPanel south = new JPanel();
        north.setPreferredSize(new Dimension(1536, 170));
        north.setBackground(Color.GRAY);
        south.setPreferredSize(new Dimension(1536, 170));
        south.setBackground(Color.WHITE);
        add(this.actualTrack, BorderLayout.CENTER);
        add(test, BorderLayout.WEST);
        add(east, BorderLayout.EAST);
        add(north, BorderLayout.NORTH);
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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void setMain(MainMenu tMain) {
        this.main = tMain;
    }

}