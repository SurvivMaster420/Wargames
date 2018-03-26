
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
  private int hp;
  private int ammo;
  public Hero(int newX, int newY, String newName, int newHp){
      super(newX, newY, newName, newHp);
      ammo = 8;
  }
  public int getX(){
    return x;
    }
  public int getY(){
    return y;
    }

