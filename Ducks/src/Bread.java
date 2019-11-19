import java.util.HashMap;

public class Bread {
     private int x = 0, y = 0;

    /**
     *  moves this breads position
     * @param xCoord is the horizontal value starting from the left
     * @param yCoord is the vertical value starting from the bottom
     */
    public void moveBread(int xCoord, int yCoord){
         x = xCoord;
         y = yCoord;
    }

    public HashMap getBreadCoords() {
        HashMap coords = new HashMap();
        coords.put("x",x);
        coords.put("y",y);
        return coords;
    }
}
