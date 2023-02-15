@FunctionalInterface
interface A{
    //functional interface
    void show(int i);
}


class Lambda_expression {
    public static void main(String[] args) {
        A obj = (i) ->  System.out.println("In Anonymous show "+i);
        //A obj = i ->  System.out.println("In Anonymous show "+i); will also work
        obj.show(6);
    }
}
