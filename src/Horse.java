import java.awt.*;
import javax.swing.*;

class Horse extends Animal {
    public Horse(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
        super.icon = new ImageIcon(Visual.class.getResource("/images/horse.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
    
    public Horse() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/horse.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
}