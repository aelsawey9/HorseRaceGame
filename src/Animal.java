import java.awt.Image;
import javax.swing.ImageIcon;

abstract class Animal {
    protected int xpos = 55; //x position to be used later in the animal's movement
    protected int ypos; //same as xpos except it will be assigned at the beginning and stay the same since the animals won't change lanes
    protected int strideLength; //essentially their speed, or the distance/pixels they can cover per turn
    //protected Bet bet;  //the bet object for every animal
    protected String animalName;
    protected int counter;  //counter to uniquely label the other unchosen animals with digits
    protected Image image;  //image object of the icons used to resize them 
    protected ImageIcon icon;   //the resized icons of the image objects
    protected boolean userSelected = false; //this will allow me to check which animal has the user selected in order to implement the betting on it

    public Animal() {
        this.xpos = 0;
        this.ypos = 0;
        this.strideLength = 70;
        //this.bet = new Bet();
        this.animalName = "Animal" + counter;
        this.counter++;
    }

    public Image getImage() {
        return this.image;
    }

    public String getName() {
        return this.animalName;
    }

}