import java.util.*;

public class Pond extends Observable implements Observer {
    private ArrayList<Duck> ducks;
    private int duckNumber;
    private LinkedList<Bread> breadList;

    // creates the pond and ducks and player
    public Pond(){
        breadList = new LinkedList<>();
        duckNumber = 0; // milliseconds
        ducks = new ArrayList(); // all the ducks
        for(int i=0; i<4;i++){
            ducks.add(new Duck(duckNumber++));
        }

        for(Duck duck : ducks){
            addObserver(duck);
        }
    }

    // observes the human and updates when bread is thrown
    public void update(Observable obs, Object obj) {
        breadList.add(new Bread());
        setChanged();
        notifyObservers(breadList);

        int breadNumber = 0;
        for(Bread bread: breadList)
            breadNumber++;
        System.out.println("number of bread in pond " + breadNumber);
    }
}
