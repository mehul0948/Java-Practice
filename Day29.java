// Interfaces
interface Horn {
    void playHorn();
}
interface Brake {
    void braking();  
}
class Vehicle{
    public void start(){
        System.out.println("Starting...");
    }
}
class Bmw extends Vehicle implements Horn ,Brake{
    @Override
    public void playHorn(){
        System.out.println("Playing Horn...");
    }
    @Override
    public void braking(){
        System.out.println("Braking......!");
    }
    @Override
    public void start(){
        System.out.println("Starting the Bmw");
    }
}

public class Day29 {
    public static void main(String[] args) {
        Bmw m5 = new Bmw();
        m5.start();
        m5.playHorn();
        m5.braking();
    }
}
