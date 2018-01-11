public class SodaCanDriver
{
    public static void main(String[] args){
        // instantiating two objects of class SodaCan
        SodaCan soda1 = new SodaCan("Sprite", 2018);
        SodaCan soda2 = new SodaCan("CocaCola", 2023);
        // print toString on first two objects before changeIt
        System.out.println("Soda 1 before– " + soda1);
        System.out.println("Soda 2 before– " + soda2);
        // call on changeIt method
        changeIt(soda1, soda2);
        // print toString after changeIt again
        System.out.println("Soda 1 after– " + soda1);
        System.out.println("Soda 2 after– " + soda2);
    }
    // static method that takes SodaCan class as parameters
    public static void changeIt(SodaCan s1, SodaCan s2){
        // setter method on soda1
        s1.setFlavor("Fanta");
        // new object of SodaCan class
        SodaCan soda3 = new SodaCan("RootBeer", 2019);
        // set soda2 to soda3
        s2 = soda3;
        // setter on soda2
        s2.setFlavor("DrPepper");
        // print static variable
        System.out.println("The total number of cans is: " + SodaCan.totalNumOfCans);
        // print toString after changeIt
        System.out.println("S1– " + s1);
        System.out.println("S2– " + s2);
        System.out.println("Soda3– " + soda3);
    }
}
