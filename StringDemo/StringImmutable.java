package StringDemo;

public class StringImmutable {

  public StringImmutable(){
      //why string immutable (unchangable) in java
      String string1 = "Kapil";
      String string2 = string1;
      String string3 = string2;
      string1 = "Rahul";
      //string2, string3  points to string literal Kapil, which is created in string constant pool, we don't want to change it to rahul.
      //that's why string is immutable.
      //string1 will point to Rahul now, so rahul string will created in string constant pool, but kapil will also be there in scp;

  }

}
