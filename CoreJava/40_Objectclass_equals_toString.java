class Laptop{
    String model;
    int price;

    //Override toString() method
    public String toString(){
        return model+ " : "+price;
    }

     //Override equals method
    //equals compare using hashcode, but we want to compare objects using values.

    //in java, equals means equal values and equal hashcode.
    //Don't define equal by yourself.
    //Use it from ide
    /*public boolean equals(Laptop that){
        return this.model.equals(that.model) && this.price == that.price;          
    }
    */


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }   
}


class Objectclass_equals_toString {
    public static void main(String[] args) {
            Laptop laptop = new Laptop();
            laptop.model = "Dell Inspiron";
            laptop.price = 80000;
            System.out.println(laptop); 
            //Output : Laptop@2a139a55;
            System.out.println(laptop.toString());
            //Output : Laptop@2a139a55;
            /*
              public String toString() {
                return getClass().getName() + "@" + Integer.toHexString(hashCode()); 
                }
             */
            Laptop laptop2= new Laptop();
            laptop2.model = "Dell Inspiron1";
            laptop2.price = 80000;

            boolean result = laptop.equals(laptop2);
            System.out.println(result);
            
    }    
}
