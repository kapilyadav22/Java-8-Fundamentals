class Computer{
        public void show(){
            System.out.println("In class Computer .");
        }
}
class Laptop extends Computer{
    public void show(){
        System.out.println("In class Laptop.");
    }
} 

//Runtime Polymorphism
class Dynamic_Method_dispatch {
    public static void main(String[] args) {
       //creating a reference object of Adyn with the implementation of type Bdyn

       //Take a Reference of Super class and object of Sub class
        Computer lp = new Laptop();
        lp.show();
    }    
}
