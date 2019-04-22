import java.awt.*;
import javax.swing.*;

class Cheetah extends Animal {
    public Cheetah(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
    }
    
    public Cheetah() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/cheetah2.png"));
        super.image = icon.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT);
    }
}