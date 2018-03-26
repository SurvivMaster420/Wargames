
/**
 * Write a description of class HealthPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ammopack extends Character
{
   private int x;
   private int y;
   public Ammopack(int newX, int newY, String newName, int newHp){
       super(newX, newY, newName, newHp);
       int ammo = 1;
   }
   public int getX(){
    return x;
    }
   public int getY(){
    return y;
    }
   public void refillAmmo(Character aChar, Grid grid){
       aChar.ammo++;
       
   }
}
