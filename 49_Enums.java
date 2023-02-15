//enum is a class 
enum Status{
    //named constants
    //in java, it starts from 0,1,2...
    Running, Failed, Pending, Success;
}

class Enums {
    public static void main(String[] args) {
        /*  Status s = Status.Running;
            System.out.println(s); 
            System.out.println(s.ordinal());
        */

        /*  Status[] status = Status.values();
        
            for(Status s : status){
             System.out.println(s + " "+s.ordinal() );
            }
        */
        Status s = Status.Pending;
        
        switch(s){
            case Running : System.out.println("Running"); break;
            case Success : System.out.println("done"); break;
            case Failed : System.out.println("Try Again"); break;
            default : System.out.println("Please wait"); break;
            
        }

      /*  if(s==Status.Success){
            System.out.println("done");
        }
        else if(s==Status.Failed){  
            System.out.println("Try Again");
        }
        else if(s==Status.Pending){
                System.out.println("Please wait");
        } else 
        System.out.println("Running");
        */
    }
}
