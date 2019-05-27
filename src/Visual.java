import java.awt.*;

import javax.swing.*;

class Visual extends JPanel {

    private ImageIcon track = new ImageIcon(Visual.class.getResource("/images/track.png"));
    private GameScreen gameScreen;
    private Graphics graphics;
    private Image image;
    //private ImageIcon horseImage = gameScreen.getAnimalPanel().horse.getImageIcon();


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
        this.graphics = g;
        track.paintIcon(this, g, 0, 0);
        if (this.image != null) {
            try {
                g.drawImage(this.image, 55,50, null);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void setGameScreen(GameScreen g) {
        this.gameScreen = g;
    }

    public Graphics getGraphics() {
        return this.graphics;
    }

    public void animalSelectedToPaint(Image i) {
        this.image = i;
        repaint();
        this.image = null;
    }

}