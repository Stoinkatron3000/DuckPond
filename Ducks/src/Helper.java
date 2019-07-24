import java.util.TimerTask;


/**
 * is a task that timer updates
 */
public class Helper extends TimerTask {
    public int hunger = 0;

    public void run(){
        System.out.println("Hunger level:"+ hunger++);
    }

}
