// default keyword in interface
// >>>>> Interface ke andar tum kisi bhi method ke aage default keyword lagakar use poori body (logic) de sakte ho!
//  Iska fayda? Puraani child classes bina kisi error ke perfectly chalti rahengi, aur unhe yeh naya method muft me (automatically) mil jayega.
//  Agar kisi child class ko lagta hai ki use apna custom logic likhna hai, toh wo use override bhi kar sakti hai.

interface Camera {
    void takingSnap();
    // after all work done if we want to add new method in interface after long time then we use default keyword 
    private void Opencamera(){
        System.out.println("Opening Camera... in Your Phone :");
    }
    default void recordingIn4k(){
        Opencamera();
        System.out.println("Recording in 4k Quality");
    }  
    default void recordingInHD(){
        Opencamera();
        System.out.println("REcording in HD Quality");
    }
}
interface Gps{
    void location();
}
interface Wifi{
    void network();
}

class CellPhone{
    CellPhone(String phoneNumber){
        System.out.println("Calling..." +phoneNumber);
    }
}
class redmi extends CellPhone implements Camera,Gps,Wifi{
    redmi(){
        super("7048977695");  
    }
    @Override
    public void takingSnap(){
        System.out.println("Taking Snap...");
    }
    @Override
    public void location(){
        System.out.println("Checking Your location");
    }
    @Override
    public void network(){
        System.out.println("Wifi list : ");
        System.out.print("Mehul 5g\nMehul 4g\nExcitel 3g\n");
    }

}

public class Day30 {
    public static void main(String[] args) {
       redmi note12 = new redmi();
       note12.location();
       note12.network();
       note12.takingSnap();
       note12.recordingIn4k();
       note12.recordingInHD();
    }

}
