package Semaphore_Problems;

//using wait and notify
//class ABCPrinter {
//    private int state = 0;
//
//    public synchronized void printA() throws InterruptedException {
//        while (state % 3 != 0) wait();
//        System.out.print("A");
//        state++;
//        notifyAll();
//    }
//
//    public synchronized void printB() throws InterruptedException {
//        while (state % 3 != 1) wait();
//        System.out.print("B");
//        state++;
//        notifyAll();
//    }
//
//    public synchronized void printC() throws InterruptedException {
//        while (state % 3 != 2) wait();
//        System.out.print("C ");
//        state++;
//        notifyAll();
//    }
//}


import java.util.concurrent.Semaphore;

//using semaphore
class ABCPrinter{

    private final Semaphore aSemaphore;
    private final Semaphore bSemaphore;
    private final Semaphore cSemaphore;
    private final int n;

    ABCPrinter(int n){
        this.n = n;
        aSemaphore = new Semaphore(1);
        bSemaphore = new Semaphore(0);
        cSemaphore = new Semaphore(0);
    }

    public  void printA() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            aSemaphore.acquire();
            System.out.print("A");
            bSemaphore.release();
        }
    }

    public  void printB() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            bSemaphore.acquire();
            System.out.print("B");
            cSemaphore.release();
        }
    }

    public  void printC() throws InterruptedException {
        for (int i = 0; i < n; i++){
            cSemaphore.acquire();
            System.out.println("C");
            aSemaphore.release();
        }
    }
}

public class PrintABC {
    public static void main(String[] args) {
        int n = 5;
        ABCPrinter p = new ABCPrinter(n);
        new Thread(() -> {
            try {  p.printA(); } catch (InterruptedException _) {}
        }).start();

        new Thread(() -> {
            try { p.printB(); } catch (InterruptedException _) {}
        }).start();

        new Thread(() -> {
            try {  p.printC(); } catch (InterruptedException _) {}
        }).start();
    }
}
