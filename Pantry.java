public class Pantry implements Comparable <Pantry> 
{
    // instance variables 
    private SodaCan newSoda;
    private int numberOfChips;
    /**
     * Constructor for objects of class Pantry
     */
    public Pantry(SodaCan s, int ch)
    {
        // initialise instance variables
        this.newSoda = s;
        this.numberOfChips = ch;
    }
    // setter for new soda can
    public void setSoda(SodaCan other){
        newSoda = other;
    }
    
    public SodaCan getSoda() {
        return newSoda;
    }
    // setter for type of chips in the pantry
    public void setChips(int chips){
        this.numberOfChips = chips;
    }
    // getter for type of chips
    public int getChipType(){
        return this.numberOfChips;
    }
    // toString method to print instance data
    public String toString(){
        return "There's " + numberOfChips + " chips in the pantry";
    }
    // comparable method to compare two types of chips
    public int compareTo(Pantry other){
        if(this.numberOfChips > other.numberOfChips)
            return 1;
        else if (this.numberOfChips < other.numberOfChips)
            return -1;
        else
            return 0;
    }
}
