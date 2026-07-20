import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        System.out.println("Enter the number for enable the while loop");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 1;
        while (a<=num) {
            System.out.println(a);
            a++;
        }
        sc.close();
    }

}
