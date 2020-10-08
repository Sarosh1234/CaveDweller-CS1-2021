/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cavedweller;

/**
 *
 * @author 808652
 */
public class Door {
    private int x, y;
    
    //3.a. Constructor
    public Door (int x, int y) {
        this.x = x;
        this.y = y;
    }
    //3.b. Accessors

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
