import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

//println is a method of PrintStream.class  
//out is a static variable and the object of PrintStream created in System class
//since out is static, so we can access it using System.out
//and using out, we can access println

class User_input {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Input");

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

        //bf.close();
    }    
}
