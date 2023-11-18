class Calculator{
    public int add(int num1, int num2){
        int r = num1 + num2;
        return r;        
    }

}

class class_and_objects {
    public static void main(String[] args) {
        //main is the method, which starts the execution
        int num1 = 5;
        int num2 = 10;

        Calculator calculator = new Calculator();
        int result = calculator.add(num1, num2);
        System.out.println(result);
    }
}
