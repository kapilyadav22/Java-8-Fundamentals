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
        //parametered will called in the super class constructors 
        //if declare parameter in super(n)
        super(n);
        System.out.println("In para B");
    }
}

class This_and_super { 
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
