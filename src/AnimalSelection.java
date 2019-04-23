import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

class AnimalSelection extends JPanel implements ActionListener {
    private JButton horseImage;

    public AnimalSelection() {
        super();

        this.add(horseImage);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}