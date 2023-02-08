class Calc{
    public int add(int n1, int n2){
        return n1 + n2;
    }
}
class AdCalc extends Calc{
    public int add(int n1, int n2){
        return n1 + n2+1;
    }
}

class Method_overriding {
   public static void main(String[] args) {
        AdCalc obj = new AdCalc();
        int result = obj.add(2, 5);
        System.out.println(result);
   } 
}
