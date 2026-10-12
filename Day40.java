// Collection framework

import java.util.ArrayList;
import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an arraylist ");
        int x = sc.nextInt();
        sc.nextLine();
        ArrayList <String> fruits = new ArrayList<>();
        for(int i=0;i<x;i++){
            System.out.println("Enter the name of Fruit");
            String m = sc.nextLine();
            fruits.add(m);
        }
        System.out.println(fruits);
            
    }
    
}