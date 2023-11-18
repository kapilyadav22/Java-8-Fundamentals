class logical_operator {
    public static void main(String[] args) {
        //logical statements
        int num1 = 8;
        int num2 = 9;

        double num3 = 9.8;
        double num4 = 10.6;


        boolean result = num1==num2 && num3<num4; 
        System.out.println(result);
        result = num1>num2 || num3<num4;
        System.out.println(result);
        result = !(num1<=num2);
        System.out.println(result);
        result = num1>=num2;
        System.out.println(result);
}
}
