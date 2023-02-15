class Aa{
    public void show(){
        System.out.println("Inside the show method.");
    }
}

class Anonymous_inner_class {
    public static void main(String[] args) {
        Aa obj = new Aa(){  
            public void show(){
                System.out.println("Inside the New show method.");
            }
        };
        obj.show();
    }
}
