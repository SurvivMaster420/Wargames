/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero extends Character //all methods are taken from Character
{
  public Hero(int newX, int newY, String newName, int newHp, int newAmmo){
     super(newX, newY, newName, newHp, newAmmo); //constructor inherits all from character
  }
  public String getGridIcon(){
     return "\u25A3";//black square in white square
  }
  public String toString(){
     String out = "";
     out += "Name: " + getName() + " " + getGridIcon()+"\n";
     out += "Class: Hero\n";
     out += "HP: " + getHp() + "\n";
     out += "Ammo: " + getAmmo() + "\n";
     out += "Coordinates: ("+getX()+", "+getY()+")\n";
     return out;
  }
}
