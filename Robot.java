
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
    private int hp;
    private int ammo;
    /**
     * Constructor for objects of class Robot
     */
    public Robot(int newX, int newY)
    {
        super(newX, newY);
    } 
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
