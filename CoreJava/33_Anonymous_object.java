class A{
    public A(){
        System.out.println("Object Created.");
    }
    public void show(){
        System.out.println("in a show");
    }
}

class Anonymous_object {
    public static void main(String[] args) {
   
    //new A() is object creation, which will be stored in heap.
    //obj is a reference variable,stored in a stack refering to some address of show()
    //so obj refers from stack to heap.
        
    /*
    A obj;
    obj = new A();
    */
    
    //show() is the object.
    //obj.show();  
    
    new A().show(); //It is an anonymous object
    //we cannot reuse the object again.
    }
}
