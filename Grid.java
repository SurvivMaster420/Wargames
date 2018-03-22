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
    
    public void addCharacters(Character aCharacter){
        players.add(aCharacter);
        numOfPlayers++;
        
        board[0][0] = numOfPlayers;
    }
    
    public void addCharactersRandomly(Character aCharacter){
        Random gen = new Random();
        players.add(aCharacter);
        numOfPlayers++;
        
        int x = gen.nextInt(10);
        int y = gen.nextInt(10);
        while(!isSpotEmpty(x,y)){
            x = gen.nextInt(board.length);
            y = gen.nextInt(board.length);
        }
        board[x][y] = numOfPlayers;
    }
    
    public boolean isSpotEmpty(int x, int y){
        if(board[x][y] == -1){
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
                }
            }
            out+="]";
        }
        
        return out;
    }
}
