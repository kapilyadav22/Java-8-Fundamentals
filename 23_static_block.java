class Mobile{
    //instance variables
    //variables created inside methods are called local variables

    //static variables are shared by different objects
    static String Brand; 
    int price;
    String Name;


    //static block calls before than constructor
    //class loader - class will load from library, and it happens only once.
    //Everytime you load the class,it will call static block.
    //since class loading happens first, thats why static will call first,
    // and then constructor

    /*if we don't create any object, it will not call the constructor as 
        well as don't call static block.
    */
    static{
        Brand = "Nokia";
        System.out.println(" In static Block");
    } 

    public Mobile(){
        Name = "";  
        price = 1000;
        System.out.println("IN Constructor");
    }

    

    public void show(){
        //static variables can be access from non static methods
        System.out.println(Brand + ": " + price + ": "+ Name );
    }
}

class static_block {
    public static void main(String[] args) throws ClassNotFoundException {
        
        // To load the class without creating object
        //static block will called
        Class.forName("Mobile");

        // Mobile mobile = new Mobile();
        //static variables should be called from class name not from object name
        // Mobile.Brand  = "NOKIA";
        // mobile.price = 12999;
        // mobile.Name = "N72";

        // Mobile mobile2 = new Mobile();
        // mobile2.price = 25999;
        // mobile2.Name = "M31";

        // mobile.show();
        // mobile2.show();
    }
}
