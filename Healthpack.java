
/**
 * Write a description of class HealthPack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Healthpack extends Character
{
   private int x;
   private int y;
   public Healthpack(int newX, int newY, String newName, int newHp){
       super(newX, newY, newName, newHp, newAmmo);
   }
   public int getX(){
    return x;
    }
   public int getY(){
    return y;
    }
   public void healChar(Character aChar, Grid grid){
       aChar.hp++;
       
   }
}
