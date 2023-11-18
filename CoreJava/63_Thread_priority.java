//priorities assigned from 1 to 10
//1 is lowest
//10 is highest


class A extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hiiii");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
    }
}
class Priority_Threads { 
 public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        //System.out.println(obj1.getPriority());
        //setting a priority doesnt confirm the priority
        //it just suggest the scheduler to schedule priority
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();
        obj2.start();
 }   
}


