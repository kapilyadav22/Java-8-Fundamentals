package ThreadsBasics;

class MyThread1 implements Runnable{

    @Override
    public void run() {

        try {
            System.out.println(Thread.currentThread().getName() + " is running...");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

public class ThreadUsingRunnableInterface {
    public static void main(String[] args) {
//        MyThread1 myThread1 = new MyThread1();
//        Thread t1 = new Thread(myThread1);
         Thread t1 = new Thread(new MyThread1());

         //get Thread Name
        String ThreadName = t1.getName();
        System.out.println(ThreadName + " is running...");

        //set Thread Name
        t1.setName("Kapil");
        ThreadName = t1.getName();
        System.out.println(ThreadName + " is running...");

        t1.start();

         Runnable r1 = new MyThread1();
         Thread t2 = new Thread(r1);
         t2.start();
    }
}
