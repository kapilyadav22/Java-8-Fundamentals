package UserInput;

import java.util.Scanner;

public class UserInputMain {
    public UserInputMain(){

//        nextBoolean()	Reads a boolean value from the user
//        nextByte()	Reads a byte value from the user
//        nextDouble()	Reads a double value from the user
//        nextFloat()	Reads a float value from the user
//        nextInt()	    Reads a int value from the user
//        nextLine()	Reads a String value from the user
//        nextLong()	Reads a long value from the user
//        nextShort()	Reads a short value from the user

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("You entered " + number);

        System.out.println("Enter Your Name");
        String name = scanner.next();
        System.out.println("You entered " + name);

        System.out.println("Enter Your Age");
        double age = scanner.nextDouble();
        System.out.println("You entered " + age);


    }
}
