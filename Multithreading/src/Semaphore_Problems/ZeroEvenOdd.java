package Semaphore_Problems;


import java.util.concurrent.Semaphore;

class ZeroEvenOddPrinter {
    private int n;
    private final Semaphore zeroSemaphore;
    private final Semaphore evenSemaphore;
    private final Semaphore oddSemaphore;


    public ZeroEvenOddPrinter(int n) {
        this.n = n;
        zeroSemaphore  = new Semaphore(1);
        evenSemaphore  = new Semaphore(0);
        oddSemaphore  = new Semaphore(0);
    }

    public void zero() throws InterruptedException {
        boolean isOdd = true;
        for(int i=1;i<=n;i++){
            zeroSemaphore.acquire();
            System.out.print("0");
            if(isOdd){
                oddSemaphore.release();
            } else {
                evenSemaphore.release();
            }
            isOdd=!isOdd;
        }
    }

    public void even() throws InterruptedException {
        for(int i=2;i<=n;i+=2){
            evenSemaphore.acquire();
            System.out.print(i);
            zeroSemaphore.release();
        }
    }

    public void odd() throws InterruptedException {
        for(int i=1;i<=n;i+=2){
            oddSemaphore.acquire();
            System.out.print(i);
            zeroSemaphore.release();
        }
    }
}

public class ZeroEvenOdd {
    public static void main(String[] args) {
        int n = 5;
        ZeroEvenOddPrinter p = new ZeroEvenOddPrinter(n);
        new Thread(() -> {
            try {  p.zero(); } catch (InterruptedException _) {}
        }).start();

        new Thread(() -> {
            try { p.even(); } catch (InterruptedException _) {}
        }).start();

        new Thread(() -> {
            try {  p.odd(); } catch (InterruptedException _) {}
        }).start();
    }
}
