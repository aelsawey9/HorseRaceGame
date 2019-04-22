import java.awt.*;

import javax.swing.*;

class Visual extends JPanel {

    private ImageIcon track = new ImageIcon(Visual.class.getResource("/images/track.png"));
    private ImageIcon horse = new ImageIcon(Visual.class.getResource("/images/horse.png"));
    private Image sizedHorse = horse.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    private ImageIcon sizedHorseIcon = new ImageIcon(sizedHorse);
    private ImageIcon rabbit = new ImageIcon(Visual.class.getResource("/images/rabbit2.png"));
    private Image sizedRabbit = rabbit.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);

    public Visual() {
        super();
        setPreferredSize(new Dimension(900, 700));
    }

    @Override 
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        track.paintIcon(this, g, 0, 0);
        g.drawImage(sizedRabbit, 645, 400, this);
        g.drawImage(sizedHorse, 55,50, this);
        //rabbit.paintIcon(this, g, 20, 20);
        //sizedHorseIcon.paintIcon(this, g, 645, 40);
    }
}