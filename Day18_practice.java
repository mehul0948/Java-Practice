// que 1
// Print 1 to N Using Recursion
public class Day18_practice {
    static int print_numbers(int n){
        if (n==0) {
            return 1;
        }
        return (n-1);
    }

    public static void main(String[] args) {
        int x=5;
        System.out.println(print_numbers(x));
    }
}
