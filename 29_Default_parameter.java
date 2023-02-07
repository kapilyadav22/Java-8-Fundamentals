import java.net.Socket;

class Human{
    private int age;
    private String name;

    //default constructor
    public Human(){
        age = 12;
        name = "Kapil Yadav";
   }
   //parameterised construtor
   public Human(int age, String name){
        this.age = age;
        this.name = name;
   }

    //getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}

class Default_parameter {
    public static void main(String[] args) {
        Human human = new Human();   
        Human human2 = new Human(25,"Kapil"); 
        System.out.println("Age : "+ human.getAge() + "  Name : "+human.getName());
        System.out.println("Age : "+ human2.getAge() + "  Name : "+human2.getName());
    }
   
}
