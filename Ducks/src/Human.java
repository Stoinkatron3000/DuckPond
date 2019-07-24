import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

public class Human extends Observable implements ActionListener {


    public Human(){

    }

    // player throws bread
    public void throwBread(){
        System.out.println("1 more Bread in pond");
        setChanged();
        notifyObservers();
    }

    // player throws rock
    public void throwRock(){
        System.out.println("Rock");
    }

    public void actionPerformed(ActionEvent e){
        throwBread();
    }
}
