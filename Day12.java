/*

import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        System.out.print("enter a number to see the table : ");
        Scanner sc=new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("here is the table of your entered number >> ");
        for(int i=1;i<11;i++) {
            int n=m*i;
            System.out.println(m+" X "+i+" = "+n); 
        }
        sc.close();
    }
}
*/

// for print stars

public class Day12 {

    public static void main(String[] args) {
        int n=4;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}