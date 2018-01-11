public class Pantry 
{
    // instance variables 
    private SodaCan newSoda;
    private String typeOfChips;
    /**
     * Constructor for objects of class Pantry
     */
    public Pantry(SodaCan s, String ch)
    {
        // initialise instance variables
        this.newSoda = s;
        this.typeOfChips = ch;
    }
    // setter for new soda can
    public SodaCan anotherSoda(SodaCan other){
        SodaCan moreSoda = new SodaCan(other.sodaFlavor, other.expirationDate);
        return moreSoda;
    }
    // setter for type of chips in the pantry
    public void setChips(String chips){
        this.typeOfChips = chips;
    }
    // getter for type of chips
    public String getChipType(){
        return this.typeOfChips;
    }
    // toString method to print instance data
    public String toString(){
        return "There's " + typeOfChips + " in the pantry";
    }
    // comparable method to compare two types of chips
    public String compareTo(Pantry other){
        if(this.typeOfChips == other.typeOfChips)
            return "They're the same";
        else
            return "They're different";
    }
}
