package ThreadsDemo;

class MyRunnable implements  Runnable{

    @Override
    public void run() {
            for(int i=0;i<5;i++){
                System.out.println("Current Thread is :" + Thread.currentThread().getName() +" Current Value is : " + i);
            }
    }

}
public class RunnableInterface {
    public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();
    Thread t1 = new Thread(myRunnable);
    Thread t2 = new Thread(myRunnable);

    t1.start();
    t2.start();
    }
}
