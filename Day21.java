//problem no 1
/*
class Employee{
    String name;
    int salary;

    public String getname(){
        return name;
    }
    public void setname(String i){
        name = i;
    }
    public int getsalary(){
        return salary;

    }
    public void setsalary(int n){
    if (n<=0){
        System.out.println("ERROR : Salary can't be zero or negative");
        return;
    }
       salary=n;
    }
}

public class Day21 {
    public static void main(String[] args) {
        Employee emp1=new Employee();
        emp1.setname("Mehul");
        System.out.println(emp1.getname());
        emp1.setsalary(50000);
        System.out.println(emp1.getsalary());


    }
}
*/

// Problem no 2
/*
class Rectangle {
    int length;
    int width;
    public int areaOfRectangle(){
        return length*width;
    }
    public int perimeterOfRectangle(){
        return 2*(length+width);
    }

    
}
public class Day21 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.length=5;
        rectangle.width=10;
        System.out.println(rectangle.areaOfRectangle());
        System.out.println(rectangle.perimeterOfRectangle());
    }
}
    */

// Problem 3
/*
class Tommy{
    public void hit(){
        System.out.println("Hitting...!");
    }
    public void run(){
        System.out.println("Running...!");
    }
    public void fire(){
        System.out.println("Firing...!");
    }
}

public class Day21 {

    public static void main(String[] args) {
        Tommy playerTommy = new Tommy();
        playerTommy.run();
        playerTommy.fire();
        playerTommy.hit();
    }
}
    */