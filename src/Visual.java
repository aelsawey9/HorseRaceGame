import java.awt.*;

import javax.swing.*;

class Visual extends JPanel {

    private ImageIcon track = new ImageIcon(Visual.class.getResource("/images/track.png"));
    private GameScreen gameScreen;


    /*
    Animal wins when they reach pixel 645
    Difference of 65 pixels between each lane
    Lane 1 located at (55, 50)
    Lane 7 located at (645, 400)
    */


    public Visual() {
        super();
        this.setPreferredSize(new Dimension(900, 700));
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        track.paintIcon(this, g, 0, 0);
        g.drawImage(this.gameScreen.getAnimalPanel().makeScaledImage("/images/horse.png", 55, 50), 500,100, this);

    }

    public void setGameScreen(GameScreen g) {
        this.gameScreen = g;
    }


}