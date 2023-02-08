//Multilevel inheritance 
// Inheritance -> Adv_calc -> Calc
import Tools.Adv_calc;

class Inheritance extends Adv_calc{
    public static void main(String[] args) {
         Adv_calc obj = new Adv_calc();
         int r1 = obj.add(5, 5);
         int r2 = obj.sub(10, 6);
         int r3 = obj.multi(10,20);
         int r4 = obj.div(15, 3);
         System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
/* Multiple Inheritance does not work in java,
   if both parent class have same methods, 
   there will be ambiguity
 */
