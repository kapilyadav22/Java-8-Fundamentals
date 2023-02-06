class Mobile{
    //instance variables
    //variables created inside methods are called local variables

    //static variables are shared by different objects
    static String Brand; 
    int price;
    String Name;

    public void show(){
        //static variables can be access from non static methods
        System.out.println(Brand + ": " + price + ": "+ Name );
    }
}

class Statickeyword {
    public static void main(String[] args) {

        Mobile mobile = new Mobile();
        //static variables should be called from class name not from object name
        Mobile.Brand  = "NOKIA";
        mobile.price = 12999;
        mobile.Name = "N72";

        Mobile mobile2 = new Mobile();
        mobile2.price = 25999;
        mobile2.Name = "M31";

        mobile.show();
        mobile2.show();
    }
}
