//make a simple calculator

import java.util.Scanner;

public class Day2_ex1 {
    public static void main(String[] args) {
        System.out.println("there is a calculator for students for convert marks into percentage ::: ");
        System.out.println("***MARKS SCHOULD BE BETWEEN IN 100****");
        System.out.println("You must give 5 subjects MARKS");
        System.out.println("*******************");
        System.out.println("THE FIVE SUBJECTS ARE >>> HINDI , ENG, MATH, SCIENCE, SST");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the marks of Hindi.....");
        int marks1 = sc.nextInt();
        System.out.println("Enter the marks of English...");
        int marks2 = sc.nextInt();
        System.out.println("Enter the marks of Math......");
        int marks3 = sc.nextInt();
        System.out.println("Enter the marks of Science...");
        int marks4 = sc.nextInt();
        System.out.println("Enter the marks of Sst.......");
        int marks5 = sc.nextInt();
        System.out.println("THE PERCENTAGE OF YOUR SUBJECTS IS :>>>>>>>>");
        double percentage1 = (marks1+marks2+marks3+marks4+marks5)/5.0;
        System.out.println(percentage1);
    }
    
}
