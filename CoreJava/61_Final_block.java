import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//finally block is used to close the resources
class Final_block {
    public static void main(String[] args) throws NumberFormatException, IOException {
        int num = 0;
        // BufferedReader br = null;
        // try{
        //     InputStreamReader in = new InputStreamReader(System.in);
        //     br = new BufferedReader(in);
        //     num = Integer.parseInt(br.readLine());
        //     System.out.println(num);
        // }  
        // finally{
        //     br.close();
        // }  

        //updated code 
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }    
}
