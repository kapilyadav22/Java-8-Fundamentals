class Calculator{
    
    public int add(int n1, int n2, int n3){
        int res = n1 + n2 + n3;
        return res;
    }
    public int add(int n1, int n2){
        int res = n1 + n2;
        return res;
    } 
}

class Method_overloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int r1 = calculator.add(1,2,3);
        System.out.println(r1);
    }
}
