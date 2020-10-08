package cavedweller;

/**
 *
 * @author 808652
 */
public class Food {
    //Fields
    private String name;
    private int x, y, nourishment;
    private boolean eaten;
    //Constructor
    public Food(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.nourishment = 5;
        this.eaten = false;
    }
    //Methods
    
    //Accessors

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getNourishment() {
        return nourishment;
    }

    public boolean isEaten() {
        return eaten;
    }

    public void setEaten(boolean eaten) {
        this.eaten = eaten;
    }

    
    
}