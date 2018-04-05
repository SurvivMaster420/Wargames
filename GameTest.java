
/**
 * Write a description of class GameTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    public static void main(String args[]){
        Grid g = new Grid(10); //creates a 10x10 grid of empty spaces
        Robot aChar = new Robot(0,0,"Bender",10,5); //creates a robot object
        Hero robin = new Hero(2,2,"Robin",10,5);
        Obstacle rock = new Obstacle(4,2,"A Rock",0,0);
        Healthpack hp = new Healthpack(2,3,"Healthpack",1,0);
        Ammopack ap = new Ammopack(1,2,"Ammopack",1,0);
        
        g.addCharacter(aChar); //adds character at designated x and y position (0,0)
        g.addCharacter(robin);
        g.addCharacter(rock);
        g.addCharacter(hp);
        g.addCharacter(ap);
        
        System.out.print(g.display()); //prints the display for the game
        System.out.println(aChar);
        System.out.println(robin);
        
    }
}
