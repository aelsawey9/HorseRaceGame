abstract class Animal {
    protected int position;
    protected int strideLength;
    protected Bet bet;
    protected String animalName;
    protected int counter;

    public Animal() {
        this.position = 0;
        this.strideLength = 1;
        this.bet = new Bet();
        this.animalName = "Animal" + counter;
        counter++;
    }

}