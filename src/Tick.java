import java.awt.*;
import javax.swing.*;

class Tick extends Animal {

    ImageIcon updatedIcon;

    public Tick(String tAnimalName) {
        super();
        super.animalName = tAnimalName;
        super.icon = new ImageIcon(Visual.class.getResource("/images/tick.png"));
        super.image = icon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
    }
    
    public Tick() {
        super();
        super.icon = new ImageIcon(Visual.class.getResource("/images/tick.png"));
        super.image = icon.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
        this.updatedIcon = new ImageIcon(super.image);
    }

    public ImageIcon getUpdatedIcon() {
        return this.updatedIcon;
    }
}