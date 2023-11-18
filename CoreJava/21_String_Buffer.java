class String_Buffer {
    public static void main(String[] args) {
        //to make string mutable

        //Stringbuffer is threadsafe
        //stringbuilder is not threadsafe
        StringBuffer sb = new StringBuffer("Kapil");
        System.out.println(sb.capacity()); //21
        System.out.println(sb.length());  //5
        sb.append("Yadav");
        //String str = sb.toString();
        sb.deleteCharAt(1);
        sb.insert(0, "0");


    }
}
