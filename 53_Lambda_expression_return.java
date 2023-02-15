//functional interface have only one method
@FunctionalInterface
interface A{
    int add(int i,int j);
}

class Lambda_expression_return {
    public static void main(String[] args) {
        /*A a = new A(){
            public int add(int i, int j){
                return i+j;
            }
        };
        */
        //Lambda Expression only works with functional interface
        A a = (int i,int j) ->  i+j;
        int result = a.add(6, 5);
        System.out.println("Addition of two Numbers is :"+result);
    }    
}
