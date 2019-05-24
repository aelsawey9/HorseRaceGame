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
    public Tick tick = new Tick();

    private JButton enterNames;
    private JLabel animalNameLabel; 
    private JLabel playerNameLabel;
    private JTextField animalNameField;
    private JTextField playerNameField;
    private JToggleButton horseButton;
    private JButton cheetahButton;
    private JButton turtleButton;
    private JButton rabbitButton;
    private GridBagConstraints gc = new GridBagConstraints();
    //private ToggleGroup animalButtons = new ToggleGroup();

    public AnimalPanel() {
        super(new GridBagLayout());

        this.setPreferredSize(new Dimension(1536, 170));
        this.setBackground(Color.WHITE);
        //set border inset
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

        ///////////// Selection buttons in other column /////////////

        setButtonIcons();

    }

    public void setButtonIcons() {
        this.horseButton = new JToggleButton(new ImageIcon(this.horse.getImage()));
        //horseButton.setIcon(new ImageIcon(this.horse.getImage()));
        horseButton.setBackground(Color.ORANGE);
        horseButton.addItemListener(this);
        horseButton.setFocusPainted(false);
        //horseButton.setActionCommand("Horse");
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

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == this.enterNames) {
            if ( !this.animalNameField.getText().equals("") && !this.playerNameField.getText().equals("") && selectedOneAnimal == true) {
                JOptionPane.showMessageDialog(null, "The player and animal names have been submitted; make sure to select an animal to start the game", "Names Submitted", JOptionPane.INFORMATION_MESSAGE);
            }
            else if (horseButton.isSelected()) {
                //horseButton.setIcon(new ImageIcon(this.makeScaledImage("/images/tick.png", 45, 45)));
                System.out.println("Item event is working for horse");  //this is not working, we can't tell that horse button is the one selected
                horseButton.setIcon(new ImageIcon(this.tick.getImage()));
                this.selectedOneAnimal = true;
                System.out.println("horse");
            }
            else {
                JOptionPane.showMessageDialog(null, "Please enter an animal name, player name and select an animal to proceed", "Data Entry Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } 
        else if (e.getActionCommand().equals("Cheetah")) {
            this.setVisible(false);
            this.gameScreen.getMain().getMap().put(animalNameField.getText(), new Cheetah(animalNameField.getText()));
            horseButton.setIcon(new ImageIcon(this.tick.getImage()));
            this.selectedOneAnimal = true;
            //this.(new ImageIcon(cheetah.image));
            //new ImageIcon(gameScreen.getAnimalPanel().cheetah.getImage()).paintIcon(this.gameScreen.actualTrack, this.gameScreen.actualTrack.getGraphics(),55, 50);
            this.gameScreen.actualTrack.animalSelectedToPaint(this.gameScreen.getAnimalPanel().cheetah.getImage());
            System.out.println("cheetah action");
            this.setVisible(true);
            //Once selected maybe add a message up top saying play or something and set the panel to be invisible
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
            if (horseButton.isSelected()) {
                //horseButton.setIcon(new ImageIcon(this.makeScaledImage("/images/tick.png", 45, 45)));
                System.out.println("Item event is working for horse");  //this is not working, we can't tell that horse button is the one selected
                horseButton.setIcon(new ImageIcon(this.tick.getImage()));
                this.selectedOneAnimal = true;
                System.out.println("horse");
            }
            else if (e.getItemSelectable() == cheetahButton) {
                cheetahButton.setIcon(new ImageIcon(this.makeScaledImage("/images/tick.png", 45, 45)));
                this.selectedOneAnimal = true;
                System.out.println("cheetah");
            }
        }
    }
}
