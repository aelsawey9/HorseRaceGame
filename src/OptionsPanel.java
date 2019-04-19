import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class OptionsPanel extends JPanel implements ActionListener {

    private static final long serialVersionUID = 1L;
    //Assign fixed button sizes for those buttons
    private JButton play;
    private JToggleButton toggle;   //to switch from light to dark theme, at least for the main menu
    private MainMenu main;

    public OptionsPanel() {
        super(new GridBagLayout());

        play = new JButton("Play");
        toggle = new JToggleButton("Light/Dark theme");
        play.addActionListener(this);
        toggle.addActionListener(this);

        GridBagConstraints gc = new GridBagConstraints();

        gc.gridx = 0;
        gc.gridy = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.ipady = 2;
        gc.anchor = GridBagConstraints.CENTER;

        this.add(play, gc);

        gc.gridx = 0;
        gc.gridy = 1;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.ipady = 2;
        gc.anchor = GridBagConstraints.CENTER;

        this.add(toggle, gc);
    }

    //allows me to call the play function of that menu/controller
    public void setMain(MainMenu mainMenu) {
        this.main = mainMenu;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}