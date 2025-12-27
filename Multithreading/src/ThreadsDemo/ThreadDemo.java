package ThreadsDemo;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("MyThread" + i+  " is running");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i=0; i<10; i++){
            System.out.println(Thread.currentThread().getName()+" :"+i);
        }
    }
}
