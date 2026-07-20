//*****Que-1. WAP to sum three numbers******
//public class Day3_Practice_1{
//    public static void main(String[] args) {
//        int a=5;
//        int b=5;
//        int c=5;
//        int sum=a+b+c;
//        System.out.println(sum);            
//    } 
//}

//import java.util.Scanner;

/******Que-2. Wap to calculate cgpa for marks of three subjects 

import java.util.Scanner;

public class Day3_Practice_1{

    public static void main(String[] args) {
        System.out.println("enter the marks of three subjects for calculate CGPA ::>>");
        Scanner s1 = new Scanner(System.in);
        int eng= s1.nextInt();
        int Hindi= s1.nextInt();
        int math= s1.nextInt();
        float percentage= (eng+Hindi+math)/3.0f;
        System.out.println("there is your percentage of three subjects::");
        System.out.println(percentage);
        float CGPA= percentage/9.5f;
        System.out.println("there is your CGPA of three subjects::");
        System.out.println(CGPA);


        }
} */ 



// *****Que-3. Wap to greet the user by taking user input*****
/*public class Day3_Practice_1 {

    public static void main(String[] args) {
        System.out.println("enter your name cutie  :) ");
        Scanner s2 = new Scanner(System.in);
        String name= s2.nextLine();
        System.out.println("hello buddy, i know you name is " + name +" nice to meet you  ");
    }
}  */

// *****Que-4. Wap to calcuate KM into MILES*****
/* 
public class Day3_Practice_1 {

    public static void main(String[] args) {
        System.out.println("enter the KM(s) to convert into miles");
        Scanner s1 = new Scanner(System.in);
        int KM= s1.nextInt();
        float miles = KM*0.62f;
        System.out.println(miles);
    
    }
} 
*/


//*****Que-5. WAP to check the number is integer or not which is given by user*****
/* 
public class Day3_Practice_1 {

    public static void main(String[] args) {
        System.out.println("enter the number for checking ");
        Scanner s1 = new Scanner(System.in);
        boolean check= s1.hasNextInt();
        System.out.println("We check the input which is given by you is integer or not ( True / false )");
        System.out.println("the answer is ( "+check+" )");
    }
} 
*/