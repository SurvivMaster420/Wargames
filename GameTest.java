import java.util.*;
/**
 * Write a description of class GameTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTest
{
    private static boolean shiftPlayer = true;
    public static void main(String args[]){
        Grid g = new Grid(10); //creates a 10x10 grid of empty spaces
        Scanner sc = new Scanner(System.in);
        
        Robot aChar = new Robot(0,0,"Bender",12,12); //creates a robot object
        Hero robin = new Hero(9,9,"Robin",10,15);
        Obstacle rock1 = new Obstacle(4,2,"A Rock",0,0);
        Obstacle rock2 = new Obstacle(3,5,"A Rock",0,0);
        Obstacle rock3 = new Obstacle(7,0,"A Rock",0,0);
        Obstacle rock4 = new Obstacle(5,8,"A Rock",0,0);
        Obstacle rock5 = new Obstacle(3,6,"A Rock",0,0);
        Obstacle rock6 = new Obstacle(6,8,"A Rock",0,0);
        Obstacle rock7 = new Obstacle(4,9,"A Rock",0,0);
        Healthpack hp1 = new Healthpack(2,3,"Healthpack",1,0);
        Healthpack hp2 = new Healthpack(7,6,"Healthpack",1,0);
        Ammopack ap1 = new Ammopack(1,2,"Ammopack",1,0);
        Ammopack ap2 = new Ammopack(8,7,"Ammopack",1,0);
        Character player1 = robin;
        Character player2 = aChar;
    
        g.addCharacter(aChar); //adds character at designated x and y position (0,0)
        g.addCharacter(robin);
        g.addCharacter(rock1);
        g.addCharacter(rock2);
        g.addCharacter(rock3);
        g.addCharacter(rock4);
        g.addCharacter(rock5);
        g.addCharacter(rock6);
        g.addCharacter(rock7);
        g.addCharacter(hp1);
        g.addCharacter(ap1);
        g.addCharacter(hp2);
        g.addCharacter(ap2);
        
        while(player1.getIsAlive() && player2.getIsAlive()){
            turn(g, sc, player1, player2);
            if(shiftPlayer){
                player1 = aChar;
                player2 = robin;
                shiftPlayer = !shiftPlayer;
            } else {
                player1 = robin;
                player2 = aChar;
                shiftPlayer = !shiftPlayer;
            }
        }
        if(!(robin.getIsAlive())){
            System.out.println("Robot(Player 2) Wins!");
        } else {
            System.out.println("Hero(Player 1) Wins!");
        }
    }
    
    public static void turn(Grid g, Scanner scanner, Character player1, Character player2){
        displayGame(g);
        System.out.println(player1.getName()+", what would you like to do?");
        System.out.println("Type 1 to move Up     Type 2 to move Down");
        System.out.println("Type 3 to move Left   Type 4 to move Right");
        System.out.println("Type 5 to Attack someone else");
        int choice = scanner.nextInt();
        if(choice == 1){
            player1.moveChar(g, "Up");
        } else if(choice == 2){
            player1.moveChar(g, "Down");
        } else if(choice == 3){
            player1.moveChar(g, "Left");
        } else if(choice == 4){
            player1.moveChar(g, "Right");
        } else {
            System.out.println(player1.getName()+" attacks "+player2.getName());
            player1.attack(player2);
        }
    }
    
    public static void displayGame(Grid g){
        System.out.println(g.display());
        System.out.println("Heroes:");
        for(int i = 0; i < g.getListOfCharacters().size(); i++){
            if(g.getListOfCharacters().get(i).getClass() == Hero.class){
                System.out.println(g.getListOfCharacters().get(i).toString());
            }
        }
        System.out.println("Robots:");
        for(int i = 0; i < g.getListOfCharacters().size(); i++){
            if(g.getListOfCharacters().get(i).getClass() == Robot.class){
                System.out.println(g.getListOfCharacters().get(i).toString());
            }
        }
        System.out.println("Healthpacks:");
        for(int i = 0; i < g.getListOfCharacters().size(); i++){
            if(g.getListOfCharacters().get(i).getClass() == Healthpack.class){
                System.out.println(g.getListOfCharacters().get(i).toString());
            }
        }
        System.out.println("Ammopacks:");
        for(int i = 0; i < g.getListOfCharacters().size(); i++){
            if(g.getListOfCharacters().get(i).getClass() == Ammopack.class){
                System.out.println(g.getListOfCharacters().get(i).toString());
            }
        }
    }
}
