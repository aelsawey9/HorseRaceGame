import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OptionsPanel extends JPanel implements ActionListener, ItemListener {

    /**
     *
     */

    private static final long serialVersionUID = 1L;
    // Assign fixed button sizes for those buttons
    private JButton play;
    private JToggleButton toggle; // to switch from light to dark theme, at least for the main menu
    private MainMenu main;

    public OptionsPanel() {
        super(new GridBagLayout());

        this.setBackground(Color.BLACK);

        play = new JButton("Play");
        play.setBackground(Color.GREEN);
        play.setFont(new Font("Arial", Font.BOLD, 16));
        play.setFocusPainted(false);
        toggle = new JToggleButton("Press to change theme");
        toggle.setBackground(Color.CYAN);
        toggle.setFont(new Font("Verdana", Font.BOLD, 12));
        toggle.setFocusPainted(false);

        play.addActionListener(this);
        toggle.addItemListener(this);

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 2;
        gc.weighty = 0.5;
        gc.ipadx = 10;
        gc.ipady = 10;
        gc.anchor = GridBagConstraints.CENTER;

        this.add(play, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 2;
        gc.weighty = 0.5;
        gc.ipadx = 50;
        gc.ipady = 5;
        gc.anchor = GridBagConstraints.CENTER;
        // gc.fill = GridBagConstraints.HORIZONTAL;

        this.add(toggle, gc);
    }

    // allows me to call the play function of that menu/controller
    public void setMain(MainMenu mainMenu) {
        this.main = mainMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.play) {
            this.main.makeGameScreen();
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                toggle.setBackground(Color.ORANGE);
                this.setBackground(Color.WHITE);
                this.main.whiteTheme();
                this.main.setTheme(false);
            }
            else if (e.getStateChange() == ItemEvent.DESELECTED) {
                toggle.setBackground(Color.CYAN);
                this.setBackground(Color.BLACK);
                this.main.darkTheme();
                this.main.setTheme(true);
            }
        
    }
}
