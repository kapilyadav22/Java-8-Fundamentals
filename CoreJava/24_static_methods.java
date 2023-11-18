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

    //we cannot use non-static variables using static method Directly.
    /*Static method is called using class name, but if we access non-static variables
     using static method, it will confuse which object, we are referring to.
     because non - static variables are called using object name.
    */

    /*to access non-static using static methods, we can pass object name,
        while calling static method using class name        
    */
    public static void show1(Mobile mobile){
        System.out.println("In static Method.");
    }
}

class static_methods {

    /*Why main is static */
    /* if we dont make main static, then if we want to call main, we have to 
    first create the object of class in which main is present, that means we can
    not call main without the object of "static_methods".
    But we all know that main is starting point of execution. If the execution has
    not started, how can we create an object of a class.
     It's a deadlock here.
    */
    public static void main(String[] args) {
        Mobile mobile = new Mobile();
        //static variables should be called from class name not from object name
        Mobile.Brand  = "NOKIA";
        mobile.price = 12999;
        mobile.Name = "N72";

        Mobile mobile2 = new Mobile();
        mobile2.price = 25999;
        mobile2.Name = "M31";

        //we cannot call non static method using class name
        mobile.show();
        mobile2.show();

        //we can call static method using class name
        //Mobile.show1();

        
        /*to access non-static using static methods, we can pass object name,
        while calling static method using class name */
        Mobile.show1(mobile);
    }
}
