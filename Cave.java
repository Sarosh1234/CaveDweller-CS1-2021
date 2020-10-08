package cavedweller;

/**
 *
 * @author 808652
 */
public class Cave {
    //encapsulation
    private int size;
    private Caveman caveman;
    private Food food1;
    private Food food2;
    private Bat bat1;
    private Bat bat2;
    private Door door;
    private Key key;
    
    public Cave() {
        this.size = (int)(Math.random()*9) + 8;
        //instantiate
        this.caveman = new Caveman("Unga",(int)(Math.random() * size), (int) (Math.random() * size));
        this.food1 = new Food("banana",(int)(Math.random() * size), (int) (Math.random() * size));
        //2. Instantiate bat1, bat2
        this.bat1 = new Bat((int)(Math.random() * size), (int) (Math.random() * size));
        this.bat2 = new Bat((int)(Math.random() * size), (int) (Math.random() * size));
        this.door = new Door((int)(Math.random() * size), (int) (Math.random() * size));
        this.key = new Key((int)(Math.random() * size), (int) (Math.random() * size));
        
    }
    
    public String toString() {
        return "size: "+size;
    }
    
    public void cavemanVsFood(Food food) {
        if (caveman.getY() == food.getY() &&
            caveman.getX() == food.getX()) {
            caveman.eat(food);
        }
    }
    public void cavemanVsDoor(Door door) {
        if (caveman.getY() == door.getY() &&
            caveman.getX() == door.getX()) {
            caveman.open(door);
        }
    }
    public void cavemanVsKey(Key key) {
        if (caveman.getY() == key.getY() &&
            caveman.getX() == key.getX()) {
            caveman.pickUp(key);
        }
    }
    public void cavemanVsBat(Bat bat) {
        if (caveman.getY() == bat.getY() &&
            caveman.getX() == bat.getX()) {
            bat.bite(caveman);
        }
    }
    
    public void handleInput(String input) {
        if (input.trim().equalsIgnoreCase("up")) {
            caveman.moveUp();
        }
        else if (input.trim().equalsIgnoreCase("down")) {
            caveman.moveDown();
        }
        else if (input.trim().equalsIgnoreCase("left")) {
            caveman.moveLeft();
        }
        else if (input.trim().equalsIgnoreCase("right")) {
            caveman.moveRight();
        }
        else if (input.trim().equalsIgnoreCase("close")) {
            System.exit(0);
        }
        else {
            System.out.println("(invalid command)");
        }
        
        System.out.println(caveman.toString());
        cavemanVsFood(food1);
        cavemanVsBat(bat1);
        cavemanVsKey(key);
        cavemanVsDoor(door);
    }
}