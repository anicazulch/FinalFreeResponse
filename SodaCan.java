public class SodaCan implements Comparable <SodaCan>
{
    // instance variables
    public String sodaFlavor;
    public int expirationDate;
    public static int totalNumOfCans;
    
    /**
     * Constructor for objects of class SodaCan
     */
    public SodaCan(String flv, int dt)
    {
        // initialise instance variables
        this.sodaFlavor = flv;
        this.expirationDate = dt;
        totalNumOfCans++;
    }
    // setter to update soda flavor
    public void setFlavor(String flavor){
        this.sodaFlavor = flavor;
    }
    // setter to update expiration date
    public void setDate(int date){
        this.expirationDate = date;
    }
    // getter to get soda flavor
    public String getFlavor(){
        return this.sodaFlavor;
    }
    // getter to get expiration date
    public int getExpirationDate(){
        return this.expirationDate;
    }
    // additional method -- pour the soda can
    public void pourSoda(){
    }
    // toString method so the memory location is not printed
    public String toString(){
        return "flavor: " + this.sodaFlavor + " date: " + this.expirationDate;
    }
    // compareTo method that return -1 if value of this date is greater than other, 1 if it's less, and 0 is they're equal
    public int compareTo(SodaCan other) {
        if(this.expirationDate > other.expirationDate)
            return 1;
        else if (this.expirationDate < other.expirationDate)
            return -1;
        else
            return 0;
    }
    // static method for number of soda cans
    public static int getNumOfCans(){
        return totalNumOfCans;
    }
}
