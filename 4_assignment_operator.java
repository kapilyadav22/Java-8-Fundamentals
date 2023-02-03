class assignment_operator {
    public static void main(String[] args) {
        //assignment operator
        int num1 = 10;
        int num2 = 8;

        int addition = num1 + num2;
        int subtraction  = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1/num2;
        int modulus = num1 % num2;

        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(modulus);

        int num3 = 5;
        num3+=2;
        System.out.println(num3);
        num3-= 2;
        System.out.println(num3);
        num3*=2;
        System.out.println(num3);
        num3/=2;
        System.out.println(num3);


        num3++; 
        System.out.println(num3);
        num3--; System.out.println(num3); 
        --num3; System.out.println(num3);
        num3--; System.out.println(num3);
    } 
}
