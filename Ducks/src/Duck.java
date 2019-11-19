import java.util.*;


public class Duck implements Observer {
    private int duckNumber;
    private Hunger hunger;
    private Timer timer;
    private int xCoord,yCoord,speed;
    private int hungerTime; // time for ticks between hungerticks
    private int hungerLevelWillEat = 3; // hunger level duck will start eating

    /**
     * creates a Duck
     * @param duckNumber
     */

    public Duck(int duckNumber){
        this.duckNumber = duckNumber;
        hunger = new Hunger(duckNumber);
        timer = new Timer();
        hungerTime = 4000;
        timer.schedule(hunger,0,hungerTime);
        xCoord = 0; yCoord = 0; speed = 10;
    }

    // Duck swims
    public void swim(){
        System.out.println("Splish Splash");
    }

    /**
     * Duck removes 1 bread from list
     * @param bread
     */
    private void eat(LinkedList bread) {
        if (!bread.isEmpty()) {
            if(hungry()) { // set when duck will eat bread
                bread.removeFirst();
                System.out.println(" Nom");
                hunger.zeroHunger();
            }
            else {
                System.out.println(" not hungry");
                return;
            }
        }
        else {
            System.out.print(" *Annoyed* ");
            quack();
        }
    }

    private boolean hungry(){
        if(hunger.getHunger() >= hungerLevelWillEat)
            return true;
        return false;
    }

    //duck quacks
    public void quack(){
        System.out.println("Quack");
    }

    /**
     * observes human, eats bread when it is thrown
     * @param bread
     * @param obj
     */
    public void update(Observable bread, Object obj){
        System.out.print("Duck No "+duckNumber);
        eat((LinkedList)obj);
    }
}
