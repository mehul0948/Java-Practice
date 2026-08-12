// Netsed Try catch block in Java

import java.util.*;

public class Day37 {
    public static void main(String[] args) {
        int [] arr = new int[3];
        arr[0] = 10;
        arr[1] = 15;
        arr[2] = 20;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the index number for Print the value");
        int n = sc.nextInt();
        System.out.println("Enter the value for divide the value");
        int m = sc.nextInt();
        try {
            System.out.println("the entered index number's value is "+arr[n]);
            try {
                System.out.println("Divide the value of "+arr[n]+" by "+m+" is "+arr[n]/m);
            } 
            catch (Exception e) {
               System.out.println("Exception occurs : ");
               System.out.println(e); 
            }
        }
        catch (Exception e) {
            System.out.println("Exception occurs");
            System.out.println(e);
        }
    }
}
