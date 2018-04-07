/**
 * Write a description of class Robot here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Robot extends Character
{
    /**
     * Constructor for objects of class Robot
     */
    public Robot(int newX, int newY, String newName, int newHp, int newAmmo){
        super(newX, newY, newName, newHp, newAmmo);
    }
    public String getGridIcon(){
        return "\u25A2";//rounded square
    }
    public String toString(){
        String out = "";
        out += "Name: " + getName() + " " + getGridIcon()+"\n";
        out += "Class: Robot\n";
        out += "HP: " + getHp() + "\n";
        out += "Ammo: " + getAmmo() + "\n";
        out += "Coordinates: ("+getX()+", "+getY()+")\n";
        return out;
    }
}
