// Abstract class or methods
abstract class Smartphone1{
    public void ringing(){
        System.out.println("ringing...");
    }
    abstract public void bootAnimation();
}
class Mi extends Smartphone1{
    @Override
    public void bootAnimation(){
        System.out.println("Animation..........!");
    }

}
public class Day28 {
    public static void main(String[] args) {
    //Smartphone1 s1 = new Smartphone1();
    Mi m1 = new Mi();
    m1.bootAnimation();
    m1.ringing();
    }
    
}