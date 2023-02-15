//enum in java extend Enum class    

enum Laptop{
    Macbook(100000), vivobook(50000), Dell(378000), Hp(37480);

    private int price;
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    
}

class Enum2 {
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap);
        // System.out.println(lap.getPrice());

        for(Laptop lap : Laptop.values()){
            System.out.println(lap+" "+lap.getPrice());
        }
    }    
}
