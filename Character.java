
/**
 * Write a description of class Character here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Character
{ //Initializes the position of the characters
 int x = 0;
 int y = 0;
 String name;
 
 public Character(int newX, int newY, String newName){
   x = newX;
   y = newY;
   name = newName;
 }
 
 public int getX(){ //calls x position
    return x;
 }
 
 public int getY(){ //calls y position
    return y;
 }
 
 public String getName(){//calls Character's name
    return name;
 }
 
 public double getDistance(Character aChar){
      double distance = 0.0; //uses distance formula to find double value between two characters
      distance = Math.sqrt(((x-aChar.getX())^2) + ((y-aChar.getY())^2));
      return distance; //return distance between two characters
 }
public void attack(Character aChar){// function for attack, uses parameter aChar
        aChar.hp = aChar.hp - 1;
        System.out.println(aChar.name + "loses 1 HP"+ "\n Current HP: " + aChar.hp);
    }
}
