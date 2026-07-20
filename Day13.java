// Array

import java.util.Scanner;

public class Day13 {

    public static void main(String[] args) {
      
     String [] name = new String[5];
     Scanner sc=new Scanner(System.in);  
     System.out.println("enter your friends name here: ");
     for(int i=0;i<name.length;i++){
        String x= sc.nextLine();
        name[i]=x;
       } 
     /*for(int j=0;j<name.length;j++){
        System.out.println(name[j]);

       }*/
     for (String ohh : name) {
      System.out.println(ohh);
      
     }
     sc.close();
    
    }


}