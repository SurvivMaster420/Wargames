
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero extends Character //extends character so it can share methods with robot class
{
  private int x; //private necessary so it differs from other characters
  private int y;
  int hp; //amount of health of hero
  int ammo; //amount of bullets hero can shoot
  
  public Hero(int newX, int newY){ //initializes variables for hero. Gives specified amount of hp and ammo
      super(newX, newY);
      hp = 5;
      ammo = 8;
    
  }
  public int getX(){ //return row number that hero is in
    return x;
    }
  public int getY(){ //return column number that hero is in
    return y;
    }
  public void attack(Character aChar){ //shoots a bullet towards specified target
      
  }
}
