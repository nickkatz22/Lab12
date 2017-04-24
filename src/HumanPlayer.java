import java.util.Scanner;

/**
 * Created by nickk on 4/21/2017.
 */
public class HumanPlayer extends Player {
    String userOpp;
    private Scanner nScan = new Scanner(System.in);
    private String name;
    private String opp;
    private String weapon;




    public void promptName() {
        System.out.println("What is your name?");
        name = nScan.nextLine();
    }

    public String getName() {
        return name;
    }
    public void welcomePrompt() {
        System.out.println("Welcome to our game of Rock, Paper, Scissors, " + getName() + "!");
        System.out.println();
    }

    public void promptOpp() {
        System.out.println("Choose your opponent: AI Player 'A' or The Rock 'R'.");
        opp = nScan.nextLine();
    }
    public String getUserOpp() {
        return opp;
    }
    public void promptWeapon() {
        System.out.println("Now it's time to choose Rock 'R', Paper 'P', or Scissors 'S'.");
        weapon = nScan.nextLine();
    }
    public String getUserWeapon() {
        return weapon;
    }

    @Override
    public void getWeapon() {

    }

    @Override
    public void getResult() {

    }

    @Override
    public void decideWinner() {

    }
}
