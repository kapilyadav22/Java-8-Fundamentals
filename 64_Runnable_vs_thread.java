//Thread implements Runnable
//In Runnable, we have run method

//Runnable is a functional interface (Having one method only)
//We can convert it in Lambda expression by calling Runnable in main
class A implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hiiii");
        }
    }
}

class B implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Hello");
        }
    }
}

class Runnable_vs_thread {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B(); 

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        t2.start();
    }
}
