class typeconversion_and_typecasting {
public static void main(String[] args) {
    byte a = 127;
    int b = 440; 
    a = (byte)b;  //type casting
    b = a; //implicit type conversion
    System.out.println(a);

    float val = 5.6f;
    int val2 = (int) val;
    System.out.println(val2);


    //type promotion
    byte num1 = 30;
    byte num2 = 40;
    int result = num1 * num2; //type promotion
    System.out.println(result);
}    
}
