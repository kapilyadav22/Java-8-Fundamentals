class A{
    public A(){
        super();
        System.out.println("In A ");
    }
    public A(int n){
        super();
        System.out.println("In Para A ");
    }
}

class B extends A{
    //super method is always there, when a constructor is called
    //super means call the default constructor of super class 

    //to call parametered constructor, use super(n);
    public B(){
        super();
        System.out.println("In B");
    }
    public B(int n){
        //this will exceute the default constructor of same class
        this();
        System.out.println("In para B");
    }
}

class This { 
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
