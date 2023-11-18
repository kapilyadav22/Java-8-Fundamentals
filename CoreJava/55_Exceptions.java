/*
 Types of Error - 
 1. Compile time error
 2. Run time error
 3. Logical Error
 */

 //We can use multiple try catch block
 //try block can have non critical statements also, but it's better to use 
 //critical statements in try block

class Exceptions {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        try{
            j = 18/i;
        }
        catch(Exception e)
         {
            System.out.println(" Something went wrong.");
        }
        System.out.println(" Came out of try catch block");
    }    
}
