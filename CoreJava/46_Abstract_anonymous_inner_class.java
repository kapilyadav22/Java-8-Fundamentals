abstract class A{
     public abstract void show();
}

class Abstract_anonymous_inner_class {
    public static void main(String[] args) {
        A obj = new A(){
            public void show() {
                System.out.println(" Inside the new class ");
            }
        };
        obj.show();
    }
}
