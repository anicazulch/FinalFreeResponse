public class Shoe
{
    // instance variables - replace the example below with your own
    private String hatType;
    private boolean onHead;
    private int height;
    /**
     * Constructor for objects of class Pet
     */
    public Shoe()
    {
        // initialise instance variables
        
    }
    public Shoe(String nm, boolean on, int sh) {
        this.hatType = nm; // the this is optional but it helps make it more obvious
        this.onHead = on;
        this.height = sh;
    }
    //getter to get hat type
    public int getHeight() {
        return this.height;
    }
    //setter so you can update it 
    public void setOn(boolean on){
        this.onHead = on;
    }
    //override method inherited by object class so it doesn't print memory location
    public String toString(){
        return "The type of hat is: " + this.hatType;
        // when you print a variable, it references that to the string method
    }
}
