import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice
        String trash = "";
        String playAgain = "";
        boolean done = false;
        do {
            do {
                if (crapsRoll = 7 || crapsRoll = 11) {
                    System.out.println("You got a natural with a sum of " + crapsRoll + ". You win!");
                    done = true;
                }
            } while (!done);
            do{
                System.out.print("Do you want to play again? [YN] ");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y")) {
                    done = false;
                    repeat = false;
                } else if (playAgain.equalsIgnoreCase("N")) {
                    System.out.println("Thanks for playing!");
                    done = true;
                    repeat = false;
                } else {
                    trash = playAgain;
                    System.out.println(trash + " is not a valid response.");
                    done = false;
                    repeat = true;
                }
            } while(!done && repeat);
        } while(!done);

    }
}