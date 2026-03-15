package ThreadsBasics;

//By default main thread priority is 5 (1:lowest - 10:highest )

/*
Thread.MIN_PRIORITY
Thread.MAX_PRIORITY
Thread.NORM_PRIORITY
*/

class MyThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() +  " Thread is running");
        }
    }
}

public class ThreadPriorityDemo {
  public static void main(String[] args) {
      Thread t3 = new Thread(new MyThread3(), "Kapil");
      Thread t4 = new Thread(new MyThread3(), "Rahul");

      System.out.println("t3 priority is " + t3.getPriority());
      System.out.println("t4 priority is " + t4.getPriority());
      t3.setPriority(Thread.MAX_PRIORITY);
      t4.setPriority(Thread.MIN_PRIORITY);
      System.out.println("t3 priority is " + t3.getPriority());
      System.out.println("t4 priority is " + t4.getPriority());
      t3.start();
      t4.start();
  }
}
