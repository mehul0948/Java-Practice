// super keyword 
/*
class Worker{
    private String name;
    private int baseSalary;
    
    public Worker(String name,int baseSalary ){
        this.name=name;
        this.baseSalary=baseSalary;
    }
    public String getName() {
        return name;
    }
    public int getBaseSalary() {
        return baseSalary;
    }

}

class Manager extends Worker{
    int bonus;
    public Manager(String name, int baseSalary,int bonus) {
        super(name, baseSalary);
        this.bonus=bonus;
    }
    public void displaySalaryStructure(){
        System.out.println("Worker's name is "+ getName());
        System.out.println("Your base salary is "+ getBaseSalary());
        System.out.println("Your bonus is "+ bonus);
        System.out.println("Your total salary is "+ (getBaseSalary() + bonus));
    }
    


    
}

public class Day25_practice {
    public static void main(String[] args) {
        Manager M1 = new Manager("Mehul" ,86000, 10000);
        M1.getBaseSalary();
        M1.getName();
        M1.displaySalaryStructure();
    }
}
*/
class Base{
    Base(){
        System.out.println("hey base ");
    }
    Base(int x){
        System.out.println("I am a constructor of base and value of X is "+x);
    }
}
class Derived extends Base{
    Derived(){
        System.out.println("Hey derived");
    }
    Derived(int x , int y){
        super(x);
        System.out.println("I am a constructor of derived and value of  y is "+y);
    }
}
class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("hey child of derived");
    }
    ChildOfDerived(int x,int y,int z){
        super(x,y);
        System.out.println("I am a constructor of ChildOfDerived and value of  z is "+z);
    }
    public void showDetails(){
        System.out.println();
    }
}
public class Day25_practice {
    public static void main(String[] args) {
        ChildOfDerived a1= new ChildOfDerived(5,6,7);
        a1.showDetails();
    }
    
}