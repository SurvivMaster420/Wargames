
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
        Robot aChar = new Robot(0,0,"Bender",10); //creates a robot object
        
        
        g.addCharacter(aChar); //adds character at designated x and y position (0,0)
        System.out.print(g.display()); //prints the display for the game
    }
}
