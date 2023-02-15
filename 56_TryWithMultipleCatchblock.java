/*  Exception Heirarchy 
 * Object -> Throwable -> Error, Exception -> Runtime, SQL, IO...
 * //Runtime exception -> Arithmetic, indexoutofbound,nullpointerexception - unchecked exception
 * 
 */

class TryWithMultipleCatchblock {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int num[] = new int[6];

        String str = null;

        try{
            j = 18/i;
            System.out.println(num[4]);
            System.out.println(str.length());
        }
        catch(NullPointerException  e){
            System.out.println("Null pointer exception");
        }
        catch(ArithmeticException e){
            System.out.println(" Cannot divide by zero.");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(" Index out of bound exception");
        }
        catch(Exception e)
         {
            System.out.println(" Something went wrong.");
        }
        System.out.println(" Came out of try catch block");
    }    
    }

