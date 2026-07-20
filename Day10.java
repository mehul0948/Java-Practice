//do while loop
/* 
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        System.out.print("enter the number for where we start the do while loop till 100 : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do{
            System.out.println(num);
            num++;
        }while(num<=100);
    }
}
*/


// for loop 

import java.util.Scanner;

public class Day10 {

    public static void main(String[] args) {
        System.out.println("enter the amount of numbers to print the even numbers ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for(int a=0;a<=i;a++){
           System.out.println(2*a); 
        }
        sc.close();
    }
}