class A1{
    int age;

    public void show(){ 
        System.out.println(" In show ");
    }
    //inner class can be static
    class B1{
        public void config(){
            System.out.println(" In config");
        }
    }
}

class Inner_class {
    //class inside class 
    public static void main(String[] args) {
        A1 a = new A1();
        a.show();
        A1.B1 b = a.new B1();
        //if inner class made static then we can call
        // A1.B1 b = new A1.B1();
        b.config();


    }    
}
