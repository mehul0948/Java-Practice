    
class Vehicle{
    int speed ;
   
    public void displaySpeed(){
        System.out.println("Your Vehicle speed is "+speed);
    } 
}
    class car extends Vehicle{
    String model;
    public void displayModel(){
        System.out.println("Car model is "+model);
    }
}


public class Day25_Inheritence {

    public static void main(String[] args) {
        car a1 = new car();
        a1.model= "BMW";
        a1.speed= 180;
        a1.displayModel();
        a1.displaySpeed(); 
    }
}
