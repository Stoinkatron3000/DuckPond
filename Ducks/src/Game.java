public class Game {
    private Pond pond;
    private Human human;
    private HumanInterface humanInterface;

    public Game(){
        pond = new Pond();
        human = new Human();
        humanInterface = new HumanInterface(human);
        human.addObserver(pond);
    }
}
