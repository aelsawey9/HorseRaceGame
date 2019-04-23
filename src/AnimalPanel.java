import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

class AnimalPanel extends JPanel implements ActionListener, ItemListener {

    private static final long serialVersionUID = 1L;
    private GameScreen gameScreen;
    private boolean selectedOneAnimal = false;

    public Cheetah cheetah = new Cheetah(); // public instances to access their images and use them in AnimalPanel for
                                            // the selection buttons
    public Horse horse = new Horse();
    public Rabbit rabbit = new Rabbit();
    public Turtle turtle = new Turtle();

    private JButton enterNames;
    private JLabel animalNameLabel;
    private JLabel playerNameLabel;
    private JTextField animalNameField;
    private JTextField playerNameField;
    private JButton horseButton;
    private JButton cheetahButton;
    private JButton turtleButton;
    private JButton rabbitButton;
    private boolean animalSelected;
    private GridBagConstraints gc = new GridBagConstraints();

    public AnimalPanel() {
        super(new GridBagLayout());

        this.setPreferredSize(new Dimension(1536, 170));
        this.setBackground(Color.WHITE);
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

        // GridBagConstraints gc = new GridBagConstraints();

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
        // gc.insets = new Insets(0, 0, 40, 0);

        this.add(enterNames, gc);

        ///////////// Selection buttons in other column /////////////

        setButtonIcons();

    }

    public void setButtonIcons() {
        this.horseButton = new JButton();//new ImageIcon(((new ImageIcon("/images/cheetah.png")).getImage()).getScaledInstance(45, 45, Image.SCALE_DEFAULT)));
        horseButton.setIcon(new ImageIcon(this.horse.getImage()));
        horseButton.setBackground(Color.ORANGE);
        horseButton.addActionListener(this);
        horseButton.setFocusPainted(false);
        horseButton.setActionCommand("Horse");
        this.turtleButton = new JButton();
        turtleButton.setIcon(new ImageIcon(this.turtle.getImage()));
        turtleButton.setBackground(Color.ORANGE);
        turtleButton.addActionListener(this);
        turtleButton.setFocusPainted(false);
        this.rabbitButton = new JButton();
        rabbitButton.setIcon(new ImageIcon(this.rabbit.getImage()));
        rabbitButton.setBackground(Color.ORANGE);
        rabbitButton.addActionListener(this);
        rabbitButton.setFocusPainted(false);
        this.cheetahButton = new JButton();
        cheetahButton.setIcon(new ImageIcon(this.cheetah.getImage()));
        cheetahButton.setBackground(Color.ORANGE);
        cheetahButton.addActionListener(this);
        cheetahButton.setFocusPainted(false);

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

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.enterNames) {
            if (this.animalNameField.getText() != "0" && this.playerNameField.getText() != "0") {
                System.out.println("Aloha");
                JFrame popup = new JFrame("Well done");
                JLabel warning = new JLabel("Thank you now select an animal if you haven't already", SwingConstants.CENTER);
                popup.setBackground(Color.BLACK);
                warning.setFont(new Font("Verdana", Font.BOLD, 25));
                warning.setBackground(Color.GREEN);
                warning.setOpaque(true);
                popup.add(warning);
                popup.setSize(1200, 400);
                popup.setLocationRelativeTo(null);
                popup.setVisible(true); 
                this.gameScreen.getMain().printHash();
            }
            else {
                this.selectedOneAnimal = false;
                JFrame popup = new JFrame("Alert");
                JLabel warning = new JLabel("Please enter an animal name, player name and select an animal to proceed", SwingConstants.CENTER);
                popup.setBackground(Color.BLACK);
                warning.setFont(new Font("Verdana", Font.BOLD, 25));
                warning.setBackground(Color.RED);
                warning.setOpaque(true);
                popup.add(warning);
                popup.setSize(1200, 400);
                popup.setLocationRelativeTo(null);
                popup.setVisible(true);
            }
        } else if (e.getActionCommand().equals("Horse")) {
            this.setVisible(false);
            this.gameScreen.getMain().getMap().put(animalNameField.getText(), new Horse(animalNameField.getText()));
            horseButton.setIcon(new ImageIcon(makeScaledImage("/images/turtle2.png", 20, 25)));
            System.out.println("Aloha");
            this.selectedOneAnimal = true;
            this.setVisible(true);
            return;
        }
        else if (e.getSource() == this.cheetahButton) {
            this.setVisible(false);
            this.gameScreen.getMain().getMap().put(animalNameField.getText(), new Cheetah(animalNameField.getText()));
            horseButton.setIcon(new ImageIcon(makeScaledImage("/images/tick.png", 45, 45)));
            this.selectedOneAnimal = true;
            System.out.println("Aloha");
            this.setVisible(true);
            return;
        }

    }

    public void setGameScreen(GameScreen g) {
        this.gameScreen = g;
    }

    public Image makeScaledImage(String src, int width, int height) {
        ImageIcon tIcon = new ImageIcon(Visual.class.getResource(src));
        Image img = tIcon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT);
        return img;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            if (e.getItemSelectable() == horseButton) {
                horseButton.setSelectedIcon(new ImageIcon(this.makeScaledImage("/images/tick.ong", 45, 45)));
                this.selectedOneAnimal = true;
                System.out.println("Aloha");
            }
            else if (e.getItemSelectable() == cheetahButton) {
                cheetahButton.setSelectedIcon(new ImageIcon(this.makeScaledImage("/images/tick.ong", 45, 45)));
                this.selectedOneAnimal = true;
                System.out.println("Aloha");
            }
        }
    }
}