// OOPS concept >> Class and object
/*
class smartPhone {
    String brand;
    String model;
    int price;
     public void getDetails(){
        System.out.println("My brand name is "+brand);
        System.out.println("My model name is "+model);
        System.out.println("My phone price is "+price);
    }
}
public class Day20 {

    public static void main(String[] args) {
        System.out.println("Hey :) ");
        smartPhone myPhone = new smartPhone();
        smartPhone myPhone2 = new smartPhone();
        // First phone
        myPhone.brand="Apple";
        myPhone.model="iphone 16";
        myPhone.price=75000;
        // Second phone
        myPhone2.brand="Redmi";
        myPhone2.model="Redmi note 12 5g";
        myPhone2.price=16500;
        // Print details
        myPhone.getDetails();
        myPhone2.getDetails();
    }
}
*/

// Question no 1
/*
class Employee {
    int id;
    String name;
    int salary;
    public void RaiseSalary(int percentage){
        salary=salary+(salary*percentage/100);
    }
    public void DisplayDetails(){
        System.out.println("Your id is "+id);
        System.out.println("Your name is "+name);
        System.out.println("Your salary is "+salary);
    }
}
public class Day20 {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        // emp 1 details
        emp1.id=52;
        emp1.name="Mehul";
        emp1.salary=82000;
        // emp 2 details
        emp2.id=2;
        emp2.name="Sarthak";
        emp2.salary=15000;
        System.out.println("----Here is the details of 1st employee----");
        emp1.DisplayDetails();
        System.out.println("----Here is the details of 2nd employee----");
        emp2.DisplayDetails();     
        emp1.RaiseSalary(10);
        emp2.RaiseSalary(5);
        System.out.println("-----Here is the Updated Salary details of 1st employee-----");
        emp1.DisplayDetails();
        System.out.println("-----Here is the Updated Salary details of 2nd employee-----");
        emp2.DisplayDetails();
        
    }
*/
 
// Question no 3

import java.util.Scanner;

class bankAccount{
    String accountHolder;
    int balance;
    public void displayDetails(){
        System.out.println("Your name is "+accountHolder);
        System.out.println("Your current balance in your account is "+balance);
    }
    public void deposite(int amount){
        balance+=amount;
        System.out.println("Amount was  deposite succesfully ");
    }
    public void withdraw(int amount){
        if(amount<=balance) {
        balance-=amount;
        }
        System.out.println("Amount was  Withdraw  succesfully ");
    }
    public void checkBalance(){
        System.out.println("Your current Balance in your account is "+balance);
    }
}
public class Day20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bankAccount account1=new bankAccount();
        account1.accountHolder="Mehul Thakur";
        account1.balance=100000;
        account1.displayDetails();
        System.out.println("---Enter the amount Which you want to deposite---");
        int depAmt = sc.nextInt();
        account1.deposite(depAmt);
        account1.checkBalance();
        System.out.println();
        System.out.println("---Enter the amount Which you want to withdraw---");
        int withAmt = sc.nextInt();
        account1.withdraw(withAmt);
        account1.checkBalance(); 
        sc.close();
    }
}