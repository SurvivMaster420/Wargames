
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
 
 public Character( int newX, int newY){
   x = newX;
   y = newY;
 }
 
 public int getX(){ //calls x position
    return x;
 }
 
 public int getY(){ //calls y position
    return y;
 }
 
 public double getDistance(Character aChar){
      double distance = 0.0; //uses distance formula to find double value between two characters
      distance = Math.sqrt(((x-aChar.getX())^2) + ((y-aChar.getY())^2));
      return distance; //return distance between two characters
 }
 public void attack(Character aChar){ //Shoots a bullet towards a character based on their distance
    
 }
}
