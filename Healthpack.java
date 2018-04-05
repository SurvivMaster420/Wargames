
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
   private boolean isOnBoard;
   public Healthpack(int newX, int newY, String newName, int newHp, int newAmmo){
       super(newX, newY, newName, newHp, newAmmo); //initializes x and y values of health pack
   }
   public void healChar(Character aChar, Grid grid){
       aChar.heal();//heals character for one health point when touched
       grid.setSpot(this.getX(), this.getY(), -1);
   }
   public String getGridIcon(){
       return "\u25A5";//vertical-striped box
   }
   public String toString(){
       String out = "";
       out += "A Healthpack " + getGridIcon() + "\n";
       out += "Coordinates: ("+getX()+", "+getY()+")\n";
       return out;
   }
}
