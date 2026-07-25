
class Myth1 extends Thread {
    Myth1(String name){
        super(name);
    }
    int i=0;
    @Override
    public void run(){
        while (i<10) {
            System.out.println("Hey sir"+this.getName());
            i++;
        }
    }
}


public class Day35 {
    public static void main(String[] args) {
        Myth1 n1 = new Myth1("Mehul");
        Myth1 n2 = new Myth1("Mridul");
        Myth1 n3 = new Myth1("Rani");
        Myth1 n4 = new Myth1("Dushyant");
        n1.setPriority(10);
        n2.setPriority(Thread.MIN_PRIORITY);
        n3.setPriority(Thread.NORM_PRIORITY);
        n4.setPriority(Thread.NORM_PRIORITY);
        n1.start();
        n2.start();
        n3.start();
        n4.start();
    }
}
