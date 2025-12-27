package StringDemo;
import java.lang.String;

public class StringBasics {

    public StringBasics(){

    //String literal
    //s1 will be created in string constant pool inside heap, first it will check whether Kapil is there
    //in scp or not, if not then only it will create a string Kapil
    String s1 = "Kapil";

    //s2 will be create a string in heap  as well as in scp;
    String s2 = new String("Kapil");

    //s3 will create an another string in heap,but since Kapil is already there in scp, so no kapil string will be created in scp.
    String s3 = new String("Kapil");

    //== compares the memory address
     System.out.println(s1==s3);
    //compares two strings
     System.out.println(s1.equals(s3));
     //hashcode
    // Two objects with the same value have the same hashcodes.
    // Objects with different values usually have different hashcodes.
    // Hashcodes of the same object, must remain the same when computed more than once.
     System.out.println(s1.hashCode());
     System.out.println(s2.hashCode());
    }
}
