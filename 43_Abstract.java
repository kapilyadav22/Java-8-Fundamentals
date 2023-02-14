
//abstract method will be stored in abstract class only
//We cannot create object of an abstract class
//we need to define the abstract method in sub class
//It is not compulsory to have abstract method in abstract class
//abstract class can have normal methods also

 
abstract class Car{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Play Music ");
    } 
}

class WagnoR extends Car{
    public void drive(){
        System.out.println(" Wagnor is Driving");
    }
}


class Abstract {
    public static void main(String[] args) {
       Car car = new WagnoR();
       car.drive();
    }
}
