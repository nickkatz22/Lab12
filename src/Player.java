/**
 * Created by nickk on 4/21/2017.
 */
public abstract class Player {
private String userWeapon;



    public abstract void getWeapon();
    public abstract void getResult();
    public abstract void decideWinner();


    public void run() {

        getWeapon();
        getResult();
        decideWinner();
    }
}
