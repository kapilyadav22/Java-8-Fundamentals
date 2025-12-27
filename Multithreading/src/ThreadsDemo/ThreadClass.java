package ThreadsDemo;

import java.lang.Thread;


class MyThread extends Thread {

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Current Thread is :" + Thread.currentThread().getName() +" Current Value is : " + i);
        }
    }
}

public class ThreadClass {
    public static void main(String[] args) {
        //Using Thread Class
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }
}
