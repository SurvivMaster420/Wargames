
/**
 * Write a description of class HealthPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Healthpack extends Character //extends character so it can interact with hero and robot class
{
   private int x;
   private int y;
   public Healthpack(int newX, int newY, String newName, int newHp){
       super(newX, newY, newName, newHp, newAmmo); //initializes x and y values of health pack
   }
   public int getX(){ //returns column position
    return x;
    }
   public int getY(){ //returns row position
    return y;
    }
   public void healChar(Character aChar, Grid grid){
       aChar.hp++; //heals character for one health point when touched
       
   }
}
