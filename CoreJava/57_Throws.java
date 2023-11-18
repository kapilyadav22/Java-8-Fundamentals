

class Throws {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try{
            j = 18/i;
            if(j==0){
                //pass the message in constructor
                throw new ArithmeticException(" I dont want to print zero");
            }
        }
        
        catch(ArithmeticException e){
            j = 18/1; 
            System.out.println(e);
        }
        
        catch(Exception e){
            System.out.println(" Something went wrong.");
        }
        System.out.println(" Came out of try catch block");
    }    
    }    
