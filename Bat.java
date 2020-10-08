package cavedweller;

/**
 *
 * @author 808652
 */
public class Bat {
   //1.a.Fields - instance variables
    private int x, y, damage;
    private boolean alive;
    //1.b.Constructor
    public Bat (int x, int y) {
        this.x = x;
        this.y = y;
        this.damage = 5; 
        this.alive = true;
    }
    //1.c. Methods
    public void bite(Caveman caveman) {
        int newHP = caveman.getHp() - damage;
        caveman.setHp(newHP);
    }
    public String toString() {
        return "x: "+x+", y: "+y;
    }
     public void moveUp () {
        y = y - 1;
    }
    public void moveDown () {
        y = y + 1;
    }
    public void moveRight () {
        x = x + 1;
    }
    public void moveLeft () {
        x = x - 1;
    }
    //1.d. Accessors
     public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public int getDamage() {
        return damage;
    }
    
    public boolean isAlive() {
        return alive;
    }
    
}