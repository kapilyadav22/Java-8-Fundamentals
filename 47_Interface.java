/* Interface extends Interface
    class extends class, class implements interface
    The interface in Java is a mechanism to achieve abstraction. 
    There can be only abstract methods in the Java interface
    By interface, we can support the functionality of multiple inheritance.
    It can be used to achieve loose coupling.
    By default, any method in interface is public abstract.
    We cannot instantiate interface, we instantiate class - thats why its static.
    It is compulsory to use all the methods of interface, if we implement it -
    like a pure virtual function in C++
    We can declare variables inside Interface, by default they are final and static
    final - so we need to initialize them
    static - means we don't need to create an object, 
    we can access variables using - Interface.variablename in calling function
    //in implements, it only implements methods not variables
    interface don't have its own memory in heap,if you don't have own memory.
    how you have non final variable...so its final
 */
abstract class Computer {
    public  abstract void code();
}
class Desktop extends Computer{
    public void code(){
        System.out.println("This is desktop");
    }
}

class laptop extends Computer{
    public void code(){
        System.out.println("This is Laptop ");
    }

}

class Developer{
    public void devApp(Computer C){
        C.code();
    }
}

class Interface {
    public static void main(String[] args) {
        Computer C = new Desktop();
        Computer lap = new laptop();

        Developer kapil = new Developer();
        kapil.devApp(lap);
    }    
}
