//final - variable, class, method

//final variable - no one change the value of the variable
//final class - No one can extend the class
//final method - No one can override the final method
class Cal{
    //final class, so that no one will override it
     public final void show(){
        System.out.println("By Kapil Yadav");
     }
     public void add(int a, int b){
        System.out.println(a+b);
     }
}

class Advcalc extends Cal{
    /* cannot override the final method
        public void show(){
            System.out.println("By Aman verma");
     }
     */
}

class Final_Keyword {
    public static void main(String[] args) {
        //It is same as const in c++
        final float pie = 3.14f;
        System.out.println(" Value of pie is : "+ pie);

        Advcalc c = new Advcalc();
        c.show();
        c.add(10, 20);
    }    
}
