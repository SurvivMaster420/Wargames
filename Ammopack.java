
/**
 * Write a description of class HealthPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ammopack extends Character //Extends character so it can interact with hero and robot
{
   private int x;
   private int y;
   public Ammopack(int newX, int newY, String newName, int newHp){
       super(newX, newY, newName, newHp); //initializes position to put ammo pack in
       int ammo = 1; 
   }
   public int getX(){ //returns column position
    return x;
    }
   public int getY(){ //returns row position
    return y;
    }
   public void refillAmmo(Character aChar, Grid grid){
       aChar.ammo++; //adds 1 ammo to a character that touches the ammo pack
       
   }
}
