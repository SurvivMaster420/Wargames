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
   public Ammopack(int newX, int newY, String newName, int newHp, int newAmmo){
       super(newX, newY, newName, newHp, newAmmo); //initializes position to put ammo pack in
       int ammo = 1; 
   }
   public void refillAmmo(Character aChar, Grid grid){
       //adds 1 ammo to a character that touches the ammo pack
       aChar.addAmmo();
       grid.setSpot(this.getX(), this.getY(), -1);
   }
   public String getGridIcon(){
       return "\u25A4";//horizontal-striped box
   }
   public String toString(){
       String out = "";
       out += "An Ammopack " + getGridIcon() + "\n";
       out += "Coordinates: ("+getX()+", "+getY()+")\n";
       return out;
   }
}
