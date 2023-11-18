//functional interface have only one method


@FunctionalInterface
interface A{
    //functional interface
    void show();
}
// class  B implements A{
//     public void show(){
//         System.out.println("In show B");
//     }
// }

class Functional_interface_new{
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("In Anonymous show ");
            }
        };
        obj.show();
    }
}