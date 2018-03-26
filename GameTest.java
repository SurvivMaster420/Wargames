
/**
 * Write a description of class GameTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    public static void main(String args[]){
        Grid g = new Grid(10);
        Robot aChar = new Robot(0,0,"Bender",10);
        
        
        g.addCharacter(aChar);
        System.out.print(g.display());
    }
}
