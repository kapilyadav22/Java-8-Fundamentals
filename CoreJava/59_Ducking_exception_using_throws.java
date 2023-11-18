//use throws to pass the exception to calling function, and handle 
//the exception using try catch in called function

class A{
    public void show() throws ClassNotFoundException{
       Class.forName("Calc"); 
    }
}

class Ducking_exception_using_throws {

    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){

        }
    }
}
