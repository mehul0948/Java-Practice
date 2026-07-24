// Runnable Threads


class MyRunnableClass1 implements Runnable {
    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            System.out.println("I am Runnable thread 1");
        }
    }
}
class MyRunnableClass2 implements Runnable{
    @Override
    public void run(){
        for(int j=0;j<=100;j++){
            System.out.println("I am Runnable thread 2");
        }
    }
}

public class Day33 {
   public static void main(String[] args) {
    MyRunnableClass1 t1 = new MyRunnableClass1();
    MyRunnableClass2 t2 = new MyRunnableClass2();
    Thread a1 = new Thread(t1);
    Thread a2 = new Thread(t2);
    a1.start();
    a2.start();

   } 
}
