import java.util.*;
/**
 * Write a description of class Grid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Grid
{
    private int numOfCharacters = 0; //an int keeping track of the number of Characters in the Grid
    private int[][] board; //a 2D array which, when printed out, represents where 
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
        numOfCharacters++;
        board[aCharacter.getY()][aCharacter.getX()] = numOfCharacters;
    }
    
    public void addCharacterRandomly(Character aCharacter){
        Random gen = new Random();
        players.add(aCharacter);
        numOfCharacters++;
        
        int x = gen.nextInt(10);
        int y = gen.nextInt(10);
        while(!isSpotEmpty(x,y)){
            x = gen.nextInt(board.length);
            y = gen.nextInt(board.length);
        }
        board[y][x] = numOfCharacters;
    }
    
    public boolean isSpotEmpty(int x, int y){
        if(board[y][x] == -1){
            return true;
        } else {
            return false;
        }
    }
    
    public void setSpot(int x1, int y1, int item){
        board[y1][x1] = item;
    }
    
    public int getSpot(int x, int y){
        return board[y][x];
    }
    
    public String display(){
        String out = "";
        for(int i = 0; i < board.length; i++){
            out+="[";
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == -1){
                   out+="   "; 
                } else {
                    out+=" "+board[i][j]+"\u+25A0 ";
                }// 0x25A0 Black square 0x2604 ammo 0x2764 heart
            }
            out+="]\n";
        }
        
        return out;
    }
}
