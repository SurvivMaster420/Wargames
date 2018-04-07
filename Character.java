import java.util.Random;
public class Character
{ 
     
 //Initializes the position of the characters
 private int x = 0;
 private int y = 0;
 private String name;
 private int hp;
 private int ammo;
 private boolean isOnBoard;
 private boolean isAlive;
 
 Random rand = new Random();
 public final double MAX_DISTANCE = Math.sqrt(162);
 
 public Character(int newX, int newY, String newName, int newHp, int newAmmo){
     x = newX;
     y = newY;
     name = newName;
     hp = newHp;
     ammo = newAmmo;
     isOnBoard = false;
     isAlive = getIsAlive();
 }
 
 public int getX(){return x;}
 public int getY(){return y;}
 public String getName(){return name;}
 public int getHp(){return hp;}
 public int getAmmo(){return ammo;}
 public boolean getIsOnBoard(){return isOnBoard;}
 public boolean getIsAlive(){
    if(hp > 0){
        return true;
    } else {
        return false;
    }
 }
 public double getDistance(Character aChar){
     double distance = 0.0; //uses distance formula to find double value between two characters
     distance = Math.sqrt(((aChar.getX()-this.getX())*(aChar.getX()-this.getX()))+((aChar.getY()-this.getY())*(aChar.getY()-this.getY())));
     return distance; //return distance between two characters
 }
 public String getGridIcon(){
     return "\u25A0";//black square
 }
 
 public void updateIsOnBoard(){isOnBoard = !isOnBoard;}
 public void updateCoords(int xn, int yn){
     this.x = xn;
     this.y = yn;
 }
 
 public void attack(Character aChar){// function for attack, uses parameter aChar
     double rate = rand.nextDouble();
     if(ammo <= 0){
         System.out.println("Out of Ammo");
     } else {
         if((rate * MAX_DISTANCE) >= this.getDistance(aChar)){
             aChar.hp = aChar.hp - 2;
             ammo--;
             System.out.println("Hit!\n");
         } else{
             ammo--;
             System.out.println("Miss!\n");
         }
     }
 }
 
 public void addAmmo(){
     ammo++;
 }
 
 public void heal(){
     hp++;
 }
    
 public void moveChar(Grid g, String d){
     if(d == "Up"){
         if(this.getY() == 0){
             System.out.println("Error: At Upper Bound");
         } else if((g.getCharAtLocation(this.getX(),this.getY()-1).getClass() == Hero.class) 
                || (g.getCharAtLocation(this.getX(),this.getY()-1).getClass() == Robot.class) 
                || (g.getCharAtLocation(this.getX(),this.getY()-1).getClass() == Obstacle.class)) {
             System.out.println("Error: There's Something Blocking the Path");
         } else {
             if((g.getCharAtLocation(this.getX(),this.getY()-1).getClass() == Ammopack.class)){
                 ((Ammopack)g.getCharAtLocation(this.getX(),this.getY()-1)).refillAmmo(this,g);
                 y -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()+1));
                 g.setSpot(this.getX(), this.getY()+1, -1);
             } else if((g.getCharAtLocation(this.getX(),this.getY()-1).getClass() == Healthpack.class)){
                 ((Healthpack)g.getCharAtLocation(this.getX(),this.getY()-1)).healChar(this,g);
                 y -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()+1));
                 g.setSpot(this.getX(), this.getY()+1, -1);
             } else {
                 y -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()+1));
                 g.setSpot(this.getX(), this.getY()+1, -1);
             }
         }
     } else if(d == "Down"){
         if(this.getY() == g.getMaxY()){
             System.out.println("Error: At Lower Bound");
         } else if((g.getCharAtLocation(this.getX(),this.getY()+1).getClass() == Hero.class) 
                || (g.getCharAtLocation(this.getX(),this.getY()+1).getClass() == Robot.class) 
                || (g.getCharAtLocation(this.getX(),this.getY()+1).getClass() == Obstacle.class)) {
             System.out.println("Error: There's Something Blocking the Path");
         } else {
             if((g.getCharAtLocation(this.getX(),this.getY()+1).getClass() == Ammopack.class)){
                 ((Ammopack)g.getCharAtLocation(this.getX(),this.getY()+1)).refillAmmo(this,g);
                 y += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()+1));
                 g.setSpot(this.getX(), this.getY()-1, -1);
             } else if((g.getCharAtLocation(this.getX(),this.getY()+1).getClass() == Healthpack.class)){
                 ((Healthpack)g.getCharAtLocation(this.getX(),this.getY()+1)).healChar(this,g);
                 y += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()-1));
                 g.setSpot(this.getX(), this.getY()-1, -1);
             } else {
                 y += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX(), this.getY()-1));
                 g.setSpot(this.getX(), this.getY()-1, -1);
             }
         }
     } else if(d == "Left"){
         if(this.getX() == 0){
             System.out.println("Error: At Left Bound");
         } else if((g.getCharAtLocation(this.getX()-1,this.getY()).getClass() == Hero.class) 
                || (g.getCharAtLocation(this.getX()-1,this.getY()).getClass() == Robot.class) 
                || (g.getCharAtLocation(this.getX()-1,this.getY()).getClass() == Obstacle.class)) {
             System.out.println("Error: There's Something Blocking the Path");
         } else {
             if((g.getCharAtLocation(this.getX()-1,this.getY()).getClass() == Ammopack.class)){
                 ((Ammopack)g.getCharAtLocation(this.getX()-1,this.getY())).refillAmmo(this,g);
                 x -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()+1, this.getY()));
                 g.setSpot(this.getX()+1, this.getY(), -1);
             } else if((g.getCharAtLocation(this.getX()-1,this.getY()).getClass() == Healthpack.class)){
                 ((Healthpack)g.getCharAtLocation(this.getX()-1,this.getY())).healChar(this,g);
                 x -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()+1, this.getY()));
                 g.setSpot(this.getX()+1, this.getY(), -1);
             } else {
                 x -= 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()+1, this.getY()));
                 g.setSpot(this.getX()+1, this.getY(), -1);
             }
         }
     } else{
         if(this.getX() == g.getMaxX()){
             System.out.println("Error: At Right Bound");
         } else if((g.getCharAtLocation(this.getX()+1,this.getY()).getClass() == Hero.class) 
                || (g.getCharAtLocation(this.getX()+1,this.getY()).getClass() == Robot.class) 
                || (g.getCharAtLocation(this.getX()+1,this.getY()).getClass() == Obstacle.class)) {
             System.out.println("Error: There's Something Blocking the Path");
         } else {
             if((g.getCharAtLocation(this.getX()+1,this.getY()).getClass() == Ammopack.class)){
                 ((Ammopack)g.getCharAtLocation(this.getX()+1,this.getY())).refillAmmo(this,g);
                 x += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()-1, this.getY()));
                 g.setSpot(this.getX()-1, this.getY(), -1);
             } else if((g.getCharAtLocation(this.getX()+1,this.getY()).getClass() == Healthpack.class)){
                 ((Healthpack)g.getCharAtLocation(this.getX()+1,this.getY())).healChar(this,g);
                 x += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()-1, this.getY()));
                 g.setSpot(this.getX()-1, this.getY(), -1);
             } else {
                 x += 1;
                 g.setSpot(this.getX(), this.getY(), g.getSpot(this.getX()-1, this.getY()));
                 g.setSpot(this.getX()-1, this.getY(), -1);
             }
         }
     }
 }
 
 public String toString(){
     String out = "";
     out += "Name: " + name + " " + getGridIcon()+"\n";
     out += "HP: " + hp + "\n";
     out += "Ammo: " + ammo + "\n";
     out += "Coordinates: ("+x+", "+y+")\n";
     return out;
 }
}
