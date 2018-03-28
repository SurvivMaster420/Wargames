public class Character
{ 
 //Initializes the position of the characters
 private int x = 0;
 private int y = 0;
 private String name;
 private int hp;
 private int ammo;
 
 public Character(int newX, int newY, String newName, int newHp, int newAmmo){
   x = newX;
   y = newY;
   name = newName;
   hp = newHp;
   ammo = newAmmo;
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
 
 public int getHp(){
    return hp;
 }
 
 public double getDistance(Character aChar){
      double distance = 0.0; //uses distance formula to find double value between two characters
      distance = Math.sqrt(((x-aChar.getX())^2) + ((y-aChar.getY())^2));
      return distance; //return distance between two characters
 }
 
 public void attack(Character aChar){// function for attack, uses parameter aChar
    if((Math.random() * 16) >= this.getDistance(aChar)){
         aChar.hp = aChar.hp - 1;
         System.out.println(aChar.name + "loses 1 HP"+ "\n Current HP: " + aChar.hp);
    }
 }
 
 public void addAmmo(){
     ammo++;
 }
 
 public void heal(){
     hp++;
 }
    
 public void moveUp(Grid grid){
    if(grid.isSpotEmpty(getX(), getY()-1)){
        y -= 1;
        grid.setSpot(getX(), getY(), grid.getSpot(getX(), getY()+1));
        grid.setSpot(getX(), getY()+1, -1);
    }
 }
 public void moveDown(Grid grid){
    if(grid.isSpotEmpty(getX(), getY()-1)){
        y += 1;
        grid.setSpot(getX(), getY(), grid.getSpot(getX(), getY()-1));
        grid.setSpot(getX(), getY()-1, -1);
    } 
 }
 public void moveLeft(Grid grid){
    if(grid.isSpotEmpty(getX(), getY()-1)){
        x += 1;
        grid.setSpot(getX(), getY(), grid.getSpot(getX()-1, getY()));
        grid.setSpot(getX()+1, getY(), -1);
    } 
 }
 public void moveRight(Grid grid){
    if(grid.isSpotEmpty(getX(), getY()-1)){
        x -= 1;
        grid.setSpot(getX(), getY(), grid.getSpot(getX()+1, getY()));
        grid.setSpot(getX()+1, getY(), -1);
    }
 }
}
