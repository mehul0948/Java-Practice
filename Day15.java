// sum of float numbers in an array
/*
public class Day15 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        System.out.println("Here is the floats number for sum");
        float [] x =  new float [5];
        x[0]=5.0f;
        x[1]=5.0f;
        x[2]=7.0f;
        x[3]=12.0f;
        x[4]=20.0f;
        float sum=0.0f;
        for(int i=0;i<x.length;i++){
            sum+=x[i];
        }
        System.out.println(sum);
    }
}*/


// linear search
/*
import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []x={70,48,97,76,95};
        System.out.println("Enter the number for search the number in an array");
        int SearchNumber=sc.nextInt();
        for(int i=0;i<x.length;i++){
            if (x[i]==SearchNumber) {
                System.out.println("number was found at the position of "+i);
            }
        }
    }
}
    */

//for addition of 2 arrays 
/*
public class Day15 {

    public static void main(String[] args) {
        System.out.println("Here we are add to matrixes ");
        int [][]a={{23,34,45},
                   {56,87,52}};
        int [][]b={{55,63,85},
                   {52,96,67}};
        int [][]c=new int[2][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]);
                System.out.printf("\t");
            }
            System.out.println("");
        }
    }
}
*/

// For find maximum number in an array
/*
import java.util.Scanner;

public class Day15 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("here we find the maximum number in an array");
        int []x=new int[5];
        x[0]=45;
        x[1]=74;
        x[2]=67;
        x[3]=51;
        x[4]=75;
        System.out.println(" there are some number in which you can find the greatest : 45,74,67,51,75");
        System.out.println("enter the number to check if your number is greater then all elements of an array:::>> ");
        int a=sc.nextInt();
        for(int i=0;i<x.length;i++){
            if (a>x[i]) {
                System.out.println("your entered number is\" greater \" then the elements of that array");
                
            }
            else{
            
                System.out.println("ohh no");
            }
        }
      sc.close();  
    }
}
*/
