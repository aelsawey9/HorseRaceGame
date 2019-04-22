import java.awt.*;
import javax.swing.*;

class Turtle extends Animal {
    public Turtle(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
    }
    
    public Turtle() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/turtle2.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
}