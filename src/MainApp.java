
import java.util.Random;
import java.util.Scanner;

/**
 * Created by nickk on 4/21/2017.
 */
public class MainApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int p = 0;
        boolean loopMe = true;
        boolean loopMe1 = true;
        HumanPlayer humanPlayer = new HumanPlayer();
        String contPrompt;
        RandomPlayer aiPlayer = new RandomPlayer();
        RockPlayer rockPlayer = new RockPlayer();
        humanPlayer.promptName();
        humanPlayer.getName();
        do {
            humanPlayer.welcomePrompt();
            // while (loopMe == true) {
            humanPlayer.promptOpp();
            humanPlayer.getUserOpp();

            if (humanPlayer.getUserOpp().equalsIgnoreCase("A")) {
                System.out.println("You chose the AI Player!");
                // loopMe = false;
            } else if (humanPlayer.getUserOpp().equalsIgnoreCase("R")) {
                System.out.println("You chose The Rock!");
                // loopMe = false;

            } else {
                System.out.println("You didn't choose a player!");
            }
            // }
            humanPlayer.promptWeapon();
            humanPlayer.getUserWeapon();

            {

                if (humanPlayer.getUserWeapon().equalsIgnoreCase("R")) {
                    System.out.println("You chose Rock!");
                    p = 1;
                    // loopMe1 = false;
                } else if (humanPlayer.getUserWeapon().equalsIgnoreCase("P")) {
                    System.out.println("You chose Paper!");
                    p = 2;
                    //  loopMe1 = false;
                } else if (humanPlayer.getUserWeapon().equalsIgnoreCase("S")) {
                    System.out.println("You chose Scissors!");
                    p = 3;
                    // loopMe1 = false;
                } else {
                    System.out.println("You didnt choose Rock, Paper, or Scissors! Please Try again!");
                }
                System.out.println();
            }
            if (humanPlayer.getUserOpp().equalsIgnoreCase("A")) {
                int n = rand.nextInt(3) + 1;
                if (n == 1) {
                    System.out.println("AI chose: Rock");
                    System.out.println();
                }
                if (n == 1 && p == 2) {
                    System.out.println(humanPlayer.getName() + " Wins!");
                } else if (n == 1 && p == 3) {
                    System.out.println(humanPlayer.getName() + " Loses!");
                } else if (n == 1 && p == 1) {
                    System.out.println("Draw!");
                }
                if (n == 2) {
                    System.out.println("AI chose: Paper");
                    System.out.println();
                }
                if (n == 2 && p == 1) {
                    System.out.println(humanPlayer.getName() + " Loses!");
                } else if (n == 2 && p == 3) {
                    System.out.println(humanPlayer.getName() + " Wins!");
                } else if (n == 2 && p == 2) {
                    System.out.println("Draw!");
                }
                if (n == 3) {
                    System.out.println("Ai chose: Scissors");
                    System.out.println();
                }
                if (n == 3 && p == 1) {
                    System.out.println(humanPlayer.getName() + " Wins!");
                } else if (n == 3 && p == 2) {
                    System.out.println(humanPlayer.getName() + " Loses!");
                } else if (n == 3 && p == 3) {
                    System.out.println("Draw!");
                }

            } else if (humanPlayer.getUserOpp().equalsIgnoreCase("R")) {
                rockPlayer.getWeapon();
                System.out.println();
                if (p == 1) {
                    System.out.println("Draw!");
                } else if (p == 2) {
                    System.out.println(humanPlayer.getName() + " Wins!");
                } else if (p == 3) {
                    System.out.println(humanPlayer.getName() + " Loses!");
                }
            }
            System.out.println("Would you like to play again? y/n");
            contPrompt = scan.nextLine();
        } while (contPrompt.equalsIgnoreCase("Y"));
        System.out.println("Bye");

    }
}
