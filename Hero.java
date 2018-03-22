
/**
 * Write a description of class Hero here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hero extends Character
{
  private int x;
  private int y;
  int hp;
  int ammo;
  public Hero(){
      int x = 0;
      int y = 0;
      int hp = 5;
      int ammo = 8;
  }
  public int getX(){
    return x;
    }
  public int getY(){
    return y;
    }
  public void attack(Character aChar){
      
  }
}
