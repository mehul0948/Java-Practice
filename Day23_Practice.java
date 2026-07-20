// Guess The Number Game

import java.util.Random;
import java.util.Scanner;
class Game{
    private int systemNumber;
    private int userNumber;
    private int noOfGuesses=0;
    public Game(){
        Random rand = new Random();
        this.systemNumber = rand.nextInt(100)+1;
    }
    public void takeUserInput(int x){
        userNumber=x;
        noOfGuesses++;
    }
    public boolean isCorrectNumber(){
        if (systemNumber==userNumber) {
            System.out.println("Oho bete u did it ");
            System.out.println("tumne ye "+noOfGuesses+ " times me pura kiya hai") ;
            return true;
        }
        else if(systemNumber<userNumber){
            System.out.println("too high! thoda chota socho");
        }
        else{
            System.out.println("too low! thoda bada socho");
        }
        return false;
    }

}

public class Day23_Practice {
    public static void main(String[] args) {
        System.out.println("this is the gusseing game");
        System.out.println("gusse  the number between 1 to 100");
        Scanner sc=new Scanner(System.in);
        Game x=new Game();
        boolean haswon=false;

        while (!haswon) {
            System.out.println("Apna number gusse kro");
            int i = sc.nextInt();
            x.takeUserInput(i);
            haswon=x.isCorrectNumber();
        }
        sc.close();
    }
}
