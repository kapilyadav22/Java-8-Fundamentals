class Human{
    private int age = 25;
    private String name= "Kapil Yadav";


    public void setAge(int a){
        age = a;
    }
    public void setName(String na){
        name  = na;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(20);
        human.setName("Kapil Yadav");
        human.getAge();
        human.getName();
        System.out.println(human.getAge() + " "+ human.getName());
    }
}
