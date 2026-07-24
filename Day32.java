class mehul extends Thread {
    int i=0;
    @Override
    public void run(){
        while(i<=100){
            System.out.println("hey i am thread 1");
            i++;
        }
    }
}
class mridul extends Thread{
    int i=0;
    @Override
    public void run(){
        while(i<=100){
            System.out.println("hey i am thread 2");
            i++;
        }
    }
}

public class Day32 {
    public static void main(String[] args) {
        mehul mehul1 = new mehul();
        mridul mridul2 = new mridul();
        mehul1.start();
        mridul2.start();

    }
}
