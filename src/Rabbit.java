import java.awt.*;
import javax.swing.*;

class Rabbit extends Animal {
    public Rabbit(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
    }
    
    public Rabbit() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/rabbit2.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
}