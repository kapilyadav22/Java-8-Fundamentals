class Computer{
    public void playMusic(){
        System.out.println("Music Is PLaying..");
    }
    public String getmeapen(int cost){
        if(cost>=10)
            return "Pen";
        return "Nothing";
    }
}

class Methods {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.playMusic();
        String pen = computer.getmeapen(10);
        System.out.println(pen);
    }
}
