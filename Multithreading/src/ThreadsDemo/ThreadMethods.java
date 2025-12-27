package ThreadsDemo;

//yield() -> give the thread scheduler hint to give resources to other threads
class MyThread4 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread4());
        thread.start();

        //join - wait the calling thread untill the called thread is executed completely
//        thread.join();
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName() + " is running");
        }
    }
}
