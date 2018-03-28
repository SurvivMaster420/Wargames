
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
}
