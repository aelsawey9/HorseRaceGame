import java.awt.*;
import javax.swing.*;

class Tick extends Animal {
    public Tick(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
        super.icon = new ImageIcon(Visual.class.getResource("/images/tick.png"));
        super.image = icon.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
    }
    
    public Tick() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/tick.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
}