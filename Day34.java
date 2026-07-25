// Constructor in threads



class Mythr1 extends Thread {
   Mythr1(String name){
    super(name);
   }
   @Override
   public void run(){
    int i=0;
    while (i<10) {
        System.out.println("Hey sir");
        i++;
    }
   }
}
class Mythr2 implements Runnable{
    Mythr2(String name){

    }
    @Override
    public void run(){
        int j=0;
        while (j<=10) {
            System.out.println("hey sir Runnable");
            j++;
        }
    }
}

public class Day34 {
    public static void main(String[] args) {
        Mythr1 m1 = new Mythr1("Mehul");
        m1.start();
        System.out.println(m1.getName());
        
        Mythr2 m2 = new Mythr2("Mridul");
        Thread t1 = new Thread(m2);
        t1.start();

    }
}
