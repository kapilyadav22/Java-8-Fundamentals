class KapilException extends Exception{

    public KapilException(String string) {
            //to pass the message of your exception
            super(string);
    }
}

class Custom_exception {
    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try{
            j = 18/i;
            if(j==0){
                //pass the message in constructor
                throw new KapilException(" I dont want to print zero");
            }
        }
        
        catch(KapilException e){
            j = 18/1; 
            System.out.println(e);
        }
        
        catch(Exception e){
            System.out.println(" Something went wrong.");
        }
        System.out.println(" Came out of try catch block");
    }        
}