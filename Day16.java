// Methods (fuctions in c)
/*
import java.util.Scanner;

public class Day16 {
    static int sum(int x, int y){
        int z=x+y;
        return z;   
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Here we additon of both the entered numbers");
        System.out.println("Enter the number for frist value");
        a = sc.nextInt();
        System.out.println("Enter the number for second value");
        b = sc.nextInt();
        c=sum(a,b);
        System.out.printf("Here is the answer ::\nAnswer=>%d ",c);
        sc.close();
    }
}
*/

// Methods overloading 

import java.util.Scanner;

public class Day16 {
    static int calculateArea(int a){
        int b = a*a;
        return b;
    }
    static int calculateArea(int a, int b){
        int c = a*b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Here we calculate first area ");
        System.out.println("enter the value to find tha area of square : ");
        int x=sc.nextInt();
        int i=calculateArea(x);
        System.out.println(i);
        System.out.println("Here we calculate the second area " );
        System.out.println("enter the first value to find tha area : ");
        int y=sc.nextInt();
        System.out.println("enter the second value to find tha area : ");
        int z=sc.nextInt();
        int m=calculateArea(y,z);
        System.out.println(m);
        System.out.println();
        sc.close();
    }
}