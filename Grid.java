import java.util.*;
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    private int numOfPlayers = 0;
    private int[][] board;
    private ArrayList<Character> players = new ArrayList<Character>();
    public Grid(int n){
        board = new int[n][n];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = -1;
            }
        }
    }
    
    public void addCharacter(Character aCharacter){
        players.add(aCharacter);
        numOfPlayers++;
        board[aCharacter.getY()][aCharacter.getX()] = numOfPlayers;
    }
    
    public void addCharacterRandomly(Character aCharacter){
        Random gen = new Random();
        players.add(aCharacter);
        numOfPlayers++;
        
        int x = gen.nextInt(10);
        int y = gen.nextInt(10);
        while(!isSpotEmpty(x,y)){
            x = gen.nextInt(board.length);
            y = gen.nextInt(board.length);
        }
        board[y][x] = numOfPlayers;
    }
    
    public boolean isSpotEmpty(int x, int y){
        if(board[y][x] == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public String display(){
        String out = "";
        for(int i = 0; i < board.length; i++){
            out+="[";
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == -1){
                   out+="   "; 
                } else {
                    out+=" "+board[i][j]+" ";
                }//0x2764 <- unicode posistion value for heart/health pack  0x2604 <- unicode for ammo
            }
            out+="]\n";
        }
        
        return out;
    }
}
