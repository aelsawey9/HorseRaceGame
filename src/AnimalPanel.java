import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class AnimalPanel extends JPanel implements ActionListener, ItemListener {

    private static final long serialVersionUID = 1L;
    private GameScreen gameScreen;
    private boolean selectedOneAnimal = false;

    public Cheetah cheetah = new Cheetah(); // public instances to access their images and use them in AnimalPanel for
                                            // the selection buttons
    public Horse horse = new Horse();
    public Rabbit rabbit = new Rabbit();
    public Turtle turtle = new Turtle();
    public Tick tick = new Tick();

    private JButton enterNames;
    private JLabel animalNameLabel;
    private JLabel playerNameLabel;
    private JTextField animalNameField;
    private JTextField playerNameField;
    private JToggleButton horseButton;
    private JToggleButton cheetahButton;
    private JToggleButton turtleButton;
    private JToggleButton rabbitButton;
    private GridBagConstraints gc = new GridBagConstraints();
    // private ToggleGroup animalButtons = new ToggleGroup();

    public AnimalPanel() {
        super(new GridBagLayout());

        this.setPreferredSize(new Dimension(1536, 170));
        this.setBackground(Color.WHITE);

        defaultAnimalPanel();

        ///////////// Selection buttons in other column /////////////

        setButtonIcons();

    }

    private void defaultAnimalPanel() {
        // set border inset
        this.setBorder(BorderFactory.createTitledBorder("Enter names and select animal to start: "));

        this.enterNames = new JButton("Let's go");
        enterNames.setBackground(Color.ORANGE);
        enterNames.addActionListener(this);
        enterNames.setFocusPainted(false);

        animalNameLabel = new JLabel("Animal Name: ", SwingConstants.RIGHT);
        animalNameLabel.setBackground(Color.PINK);
        animalNameLabel.setOpaque(true);
        animalNameLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        playerNameLabel = new JLabel("Player Name: ", SwingConstants.RIGHT);
        playerNameLabel.setBackground(Color.PINK);
        playerNameLabel.setOpaque(true);
        playerNameLabel.setFont(new Font("Verdana", Font.PLAIN, 15));

        animalNameField = new JTextField(20);
        playerNameField = new JTextField(20);

        ///////////////////// First Row /////////////////////

        gc.gridx = 0;
        gc.gridy = 0;
        gc.gridwidth = 1;
        gc.weightx = 0;
        gc.weighty = 1;
        gc.ipadx = 10;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;
        gc.insets = new Insets(25, 20, 5, 5);

        this.add(animalNameLabel, gc);

        gc.ipadx = 10;
        gc.gridx = 1;
        gc.gridy = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(25, 0, 5, 0);

        this.add(animalNameField, gc);

        ///////////////// Second Row /////////////////////

        gc.gridx = 0;
        gc.gridy = 1;
        gc.insets = new Insets(0, 20, 35, 5);
        gc.ipadx = 10;
        gc.anchor = GridBagConstraints.FIRST_LINE_END;

        this.add(playerNameLabel, gc);

        gc.gridx = 1;
        gc.gridy = 1;
        gc.ipady = 0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);

        this.add(playerNameField, gc);

        /////////////// Third Row ///////////////////

        gc.gridx = 1;
        gc.gridy = 2;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;

        this.add(enterNames, gc);
    }

    public void setButtonIcons() {
        this.horseButton = new JToggleButton(new ImageIcon(this.horse.getImage()));
        // horseButton.setIcon(new ImageIcon(this.horse.getImage()));
        horseButton.setBackground(Color.ORANGE);
        horseButton.addItemListener(this);
        horseButton.setFocusPainted(false);
        // horseButton.setActionCommand("Horse");
        this.turtleButton = new JToggleButton();
        turtleButton.setIcon(new ImageIcon(this.turtle.getImage()));
        turtleButton.setBackground(Color.ORANGE);
        turtleButton.addItemListener(this);
        turtleButton.setFocusPainted(false);
        this.rabbitButton = new JToggleButton();
        rabbitButton.setIcon(new ImageIcon(this.rabbit.getImage()));
        rabbitButton.setBackground(Color.ORANGE);
        rabbitButton.addItemListener(this);
        rabbitButton.setFocusPainted(false);
        this.cheetahButton = new JToggleButton();
        cheetahButton.setIcon(new ImageIcon(this.cheetah.getImage()));
        cheetahButton.setBackground(Color.ORANGE);
        cheetahButton.addItemListener(this);
        cheetahButton.setFocusPainted(false);
        cheetahButton.setActionCommand("Cheetah");

        gc.gridx = 2;
        gc.gridy = 1;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        gc.insets = new Insets(0, 150, 0, 30);

        this.add(horseButton, gc);

        gc.insets = new Insets(0, 30, 0, 30);
        gc.gridx = 3;

        this.add(cheetahButton, gc);

        gc.insets = new Insets(0, 30, 0, 30);
        gc.gridx = 4;

        this.add(turtleButton, gc);

        gc.insets = new Insets(0, 30, 0, 30);
        gc.gridx = 5;

        this.add(rabbitButton, gc);
    }

    /*
     * @Override public boolean equals(Object o) { String s = (String)o; return
     * true; }
     */

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.enterNames) {
            if (!this.animalNameField.getText().equals(new String(""))
                    && !this.playerNameField.getText().equals(new String("")) && selectedOneAnimal == true) {
                System.out.println(new String(animalNameField.getText())); // this isn't working
                JOptionPane.showMessageDialog(null,
                        "The player and animal names have been submitted; make sure to select an animal to start the game",
                        "Names Submitted", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Please enter an animal name, player name and select an animal to proceed", "Data Entry Error",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }

    public void setGameScreen(GameScreen g) {
        this.gameScreen = g;
    }

    private void toggleStateChanged(ChangeEvent e) {
        AbstractButton absButton = (AbstractButton) e.getSource();
        if (absButton.isSelected()) {
            System.out.println("Horse toggle selected");
            selectedOneAnimal = true;
            horseButton.setBackground(Color.GREEN);
            this.gameScreen.actualTrack.animalSelectedToPaint(this.horse.getImage());
            animalSelectedPanel();
        } else if (cheetahButton.isSelected()) {
            selectedOneAnimal = true;
            this.gameScreen.actualTrack.animalSelectedToPaint(this.cheetah.getImage());
            animalSelectedPanel();
        } else if (rabbitButton.isSelected()) {
            selectedOneAnimal = true;
            this.gameScreen.actualTrack.animalSelectedToPaint(this.rabbit.getImage());
            animalSelectedPanel();
        } else if (turtleButton.isSelected()) {
            selectedOneAnimal = true;
            this.gameScreen.actualTrack.animalSelectedToPaint(this.turtle.getImage());
            animalSelectedPanel();
        } else {
            selectedOneAnimal = false;
        }
        System.out.println("toggleStateChanged() method");
    }

    private void animalSelectedPanel() {

        JLabel animalSelected = new JLabel("Proceed to play below");
        animalSelected.setFont(new Font("Verdana", Font.BOLD, 35));

        if (selectedOneAnimal == true && !this.animalNameField.getText().equals("")
                && !this.playerNameField.getText().equals("")) {
            gc.gridx = 0;
            gc.gridy = 0;
            gc.anchor = GridBagConstraints.CENTER;
            this.remove(animalNameField);
            this.remove(animalNameLabel);
            this.remove(playerNameField);
            this.remove(playerNameLabel);
            this.add(animalSelected, gc);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        System.out.println("a toggle button has been messed with");
        if (e.getSource() == horseButton) {
            System.out.println("Horse toggle was messed with");
            if (e.getStateChange() == ItemEvent.SELECTED) {
                System.out.println("Horse toggle selected");
                selectedOneAnimal = true;
                horseButton.setBackground(Color.GREEN);
                this.gameScreen.actualTrack.animalSelectedToPaint(this.horse.getImage());
                animalSelectedPanel();
            }
            else if (e.getStateChange() == ItemEvent.DESELECTED) {
                System.out.println("Horse toggle deselected");
            }
        }
    }
}
