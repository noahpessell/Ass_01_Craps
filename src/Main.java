import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int point = 0;
        final String DIE1 = "Die1";
        final String DIE2 = "Die2";
        final String SUM = "Sum";
        String trash = "";
        String playAgain = "";
        boolean done = false;
        boolean repeat = false;
        do {
            int currentRoll = 0;
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2; // Gaussian range from 2 to 12 as in rolling two dice

                if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                    System.out.printf("%6s %6s %6s\n", DIE1, DIE2, SUM);
                    System.out.printf("%6d %6d %6d\n", die1, die2, crapsRoll);
                    System.out.println("You crapped out with a sum of " + crapsRoll + ". You lose.");
                }
                else if (crapsRoll == 7 || crapsRoll == 11) {
                    System.out.printf("%-6s %-6s %-6s\n", DIE1, DIE2, SUM);
                    System.out.printf("%-6d %-6d %-6d\n", die1, die2, crapsRoll);
                    System.out.println("You got a natural with a sum of " + crapsRoll + ". You win!");
                }
                else {
                    System.out.printf("%-6s %-6s %-6s\n", DIE1, DIE2, SUM);
                    System.out.printf("%-6d %-6d %-6d\n", die1, die2, crapsRoll);
                    point = crapsRoll;
                    System.out.println("The point to try to match is: " + point);
                    while (currentRoll != point && currentRoll != 7) {
                        System.out.println("Trying for point!");
                        die1 = rnd.nextInt(6) + 1;
                        die2 = rnd.nextInt(6) + 1;
                        currentRoll = die1 + die2;
                        System.out.printf("%-6s %-6s %-6s\n", DIE1, DIE2, SUM);
                        System.out.printf("%-6d %-6d %-6d\n", die1, die2, currentRoll);
                    }
                    if (currentRoll == 7) {
                        System.out.println("Oh no! You rolled a " + currentRoll + " before the point: " + point + ". You Lose.");
                    }
                    else {
                        System.out.println("You matched the point: " + crapsRoll + ". You Win!");
                    }
                }
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