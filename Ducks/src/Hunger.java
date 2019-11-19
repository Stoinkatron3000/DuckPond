import java.util.TimerTask;

public class Hunger extends TimerTask {
    private int hunger = 0;
    private int duckNumber;

    public Hunger(int duckNumber){
        this.duckNumber = duckNumber;
    }

    // runs
    public void run(){
        if (hunger > 0)
            System.out.println("Duck No " + duckNumber + ", Hunger level:" + ++hunger);
        else
            hunger++;
    }

    //gets hunger level
    public int getHunger(){
        return hunger;
    }

    public void zeroHunger(){
        hunger = 0;
    }

    /**
     * decrease hunger by 10
     */
    public void decreaseHunger(){
        if (hunger < 10)
            hunger = 0;
        else
            hunger = hunger - 10;
    }
}
