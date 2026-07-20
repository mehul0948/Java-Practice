// import java.util.Scanner;
/*
public class Day9_ex2 {
    public static void main(String[] args) {
        // Question 1:
        System.out.println("The eligiblity createria for passing is 40% of total percentage and minimum 33% of per subject percentage");
        System.out.println("Enter the marks of three subjects ");
        Scanner sc = new Scanner(System.in);
        int English = sc.nextInt();
        int Hindi = sc.nextInt();
        int Math = sc.nextInt();
        float percentage_English = English/1.0f;
        float percentage_Hindi = Hindi/1.0f;
        float percentage_Math = Math/1.0f;    
        float Total_percentage = (English+Hindi+Math)/3.0f;
        System.out.println("Your total percentage is "+Total_percentage );
        if (Total_percentage>=40.0 && percentage_English>=33.0 && percentage_Hindi>=33.0 && percentage_Math>=33.0) {
            System.out.println("Veryy Good , \"You are Passed\" ");
        }
        else{
            System.out.println("ohh noo , \"You are failed\" Beacause your total percenatge OR per subject percetage can't meet the passing Eligiblity");
        }
        sc.close();
    } 
}
*/

// Question 2 :
/* public class Day9_ex2 {

    public static void main(String[] args) {
        System.out.println("Here we calculate the income tax accorrding to your income");
        System.out.println("\nEnter Your net Income");
        Scanner sc = new Scanner(System.in);
        long income = sc.nextLong();
        if (income<400000) {
            System.out.println("No need to pay the Income tax");
        }
        else if (income>=400000 && income<800000){
        float tax = income*0.05f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        else if (income>=800000 && income<1200000){
        float tax = income*0.1f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        else if (income>=1200000 && income<1600000){
        float tax = income*0.15f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        else if (income>=1600000 && income<2000000){
        float tax = income*0.2f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        else if (income>=2000000 && income<2400000){
        float tax = income*0.25f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        else if (income>=2400000){
        float tax = income*0.3f;
        System.out.println("your income is "+income+" and you need to pay the income tax of Rs "+tax);
        }
        sc.close();
    } 

}*/

// 