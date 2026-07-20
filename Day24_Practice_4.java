// Problem 1
/*

class Cylinder{
    private float radius;
    private float height;
  //  public void setRadius(float radius){
   //     this.radius=radius;
   // }
    //public void setHeight(float height){
   //     this.height=height;
   // }
    //
    public Cylinder(int radius,int height) {
        this.radius=radius;
        this.height=height;
  
    }
    public void getDeatils(){
        System.out.println("Radius = "+radius);
        System.out.println("Height = "+height);
    }
    public void volume(){
        double volume = Math.PI*radius*radius*height;
        System.out.println("Volume of this cylinder is "+volume);
    }
    public void surfaceArea(){
        double a= 2*(Math.PI*radius*height)+2*(Math.PI*radius*radius);
        System.out.println(a);
    }

}
public class Day24_Practice_4 {
    public static void main(String[] args) {
        Cylinder a1 = new Cylinder(50,70);
        a1.getDeatils();
        a1.surfaceArea();
        a1.volume();
    }
    
}
*/
// problem 2

class Animal {
    
    public void makeSound(){
        System.out.println("Making Sound...");
    }
    public void walking(){
        System.out.println("Walking...");
    }  
}
class Dog extends Animal{
    public void goingToPoop(){
        System.out.println("Poop...");
    }
}

public class Day24_Practice_4 {
    public static void main(String[] args) {
        Dog kutta = new Dog();
        kutta.makeSound();
        kutta.walking();
        kutta.goingToPoop();
    }
    
}
