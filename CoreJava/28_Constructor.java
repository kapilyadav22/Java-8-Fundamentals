class Human{
    private int age;
    private String name;

    public Human(){
        age = 12;
        name = "Kapil Yadav";
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

class Constructor {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println("Age : "+ human.getAge() + "Name : "+human.getName());
    }
}
