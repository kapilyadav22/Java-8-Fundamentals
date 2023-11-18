class Human{
    private int age = 25;
    private String name= "Kapil Yadav";

    //getters and setters
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        /* */
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
}
class This_keyword {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(20);
        human.setName("Kapil Yadav");
        human.getAge();
        human.getName();
        System.out.println(human.getAge() + " "+ human.getName());
    }
}
