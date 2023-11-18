interface Computer {
   void code();
}

interface Mac{
    void imac();
}

class Desktop implements Computer{
    public void code(){
        System.out.println("This is desktop");
    }
} 

class laptop implements Computer, Mac {
    public void code(){
        System.out.println("This is Laptop ");
    }
    //implemented mac interface
    public void imac() {
        System.out.println("Additional mac is given");    
        }
}

class Developer {
    public void devApp(Computer C){
        C.code();
    }    
}

class Interface2{
    public static void main(String[] args) {
        Computer C = new Desktop();
        Computer lap = new laptop();
        Developer kapil = new Developer();
        kapil.devApp(lap);
        // Mac mac = new laptop();
        // mac.imac();
    }    
}
