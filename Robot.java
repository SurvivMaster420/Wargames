
/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot extends Character
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    /**
     * Constructor for objects of class Robot
     */
    public Robot()
    {
        // initialise instance variables
        String name = "Mr. Destructoid";
        int hp = 5;
        int ammo = 2;
        int x = 9;
        int y = 9;
    } 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
