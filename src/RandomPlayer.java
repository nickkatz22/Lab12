import java.util.Random;

/**
 * Created by nickk on 4/21/2017.
 */
public class RandomPlayer extends Player {


      Random rand = new Random();
    @Override
    public void getWeapon() {
    }

    @Override
    public void getResult() {

    }


//    public int getResult1(int n) {
//         n = rand.nextInt(3) + 1;
//        if (n == 1) {
//            System.out.println("AI chose: Rock!");
//            System.out.println();
//        } else if (n == 2) {
//            System.out.println("AI chose: Paper!");
//            System.out.println();
//        } else if (n == 3) {
//            System.out.println("AI chose: Scissors!");
//            System.out.println();
//        }
//        return n;
//    }

    @Override
    public void decideWinner() {

    }
}