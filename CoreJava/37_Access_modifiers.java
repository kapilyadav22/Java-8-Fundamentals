import Tools.A;

class C extends A{
    //subclass can access marks outside the package when protected is used
    public void abc(){
        System.out.println(marks);
    }
}
 
class Access_modifiers {
    //Public - 
    //Private - Access from same class
    //default - Access in same package
    //protected 
    public static void main(String[] args) {
        A obj = new A();
        //cannot access marks outside the package, when protected is used
        //System.out.println(obj.marks);
        obj.show();
    }
}
