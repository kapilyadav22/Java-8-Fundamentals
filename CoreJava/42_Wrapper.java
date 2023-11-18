

class Wrapper{
    //The wrapper class in Java provides the mechanism 
    //to convert primitive into object and object into primitive.
    public static void main(String[] args) {
        int num = 5;
        Integer num1 = num; //autoboxing

        int num2 = num1.intValue(); //unboxing
        int num3 = num1; //auto - unboxing 
        System.out.println(num2);

        String str = "123";
        int num4 = Integer.parseInt(str);
        System.out.println(num4);
    }
}