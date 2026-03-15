package Synchronization;

class SavingsAccount {
    static double money = 100;
     synchronized void withdraw(double amount, String Name) {
        System.out.println(Name + ": withdrawing Rs " + amount + " ");
        money-=amount;
        System.out.println("Money remaining is " + getBalance());
    }
    double getBalance() {
        return money;
    }
}

class MyAccountThread extends Thread {
    SavingsAccount savingsAccount;
    String Name="";
    double money;
    MyAccountThread(SavingsAccount savingsAccount, String Name,double money) {
        this.savingsAccount = savingsAccount;
        this.Name = Name;
        this.money = money;
    }
    @Override
    public void run() {
        savingsAccount.withdraw(money, Name);
    }
}

public class SynchonizationDemo3 {
    public static void main(String[] args) throws InterruptedException {
        SavingsAccount savingsAccount = new SavingsAccount();
        MyAccountThread myAccountThread = new MyAccountThread(savingsAccount, "Husband",10);
        MyAccountThread myAccountThread2 = new MyAccountThread(savingsAccount, "Wife",15);
        myAccountThread.start();
        myAccountThread2.start();
    }
}
