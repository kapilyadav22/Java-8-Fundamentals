class Super {
    public void show1() {
        System.out.println(" Inside class Super");
    }
}

class Sub extends Super{
    public void show2() {
        System.out.println(" Inside class Sub");
    }
}

class Upcasting_and_downcasting {
    public static void main(String[] args) {
     
    // double a = 5.6;
    // int b = (int) a;
    //System.out.println("Print b :"+b);   

    //upcasting 
    Super obj = (Super) new Sub();
    obj.show1();
        
    Sub obj1 = (Sub) obj;
    obj1.show2();
    }
}
