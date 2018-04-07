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
    Character empty = new Character (0,0,"Empty Space",0,0);
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
        aCharacter.updateIsOnBoard();
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
        aCharacter.updateIsOnBoard();
        updateCharCoordinates(aCharacter);
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
    public Character getCharAtLocation(int x, int y){
        if(board[y][x] == -1){
            System.out.println("This Spot is Empty");
            return empty;
        } else {
            return players.get(board[y][x] - 1);
        }
    }
    public void updateCharCoordinates(Character aChar){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == getSpot(aChar.getX(), aChar.getY())-1){
                    aChar.updateCoords(j, i);
                }
            }
        }
    }
    
    public int getMaxX(){return board[0].length - 1;}
    public int getMaxY(){return board.length - 1;}
    
    public ArrayList<Character> getListOfCharacters(){return players;}
    
    public String display(){
        String out = "   0  1  2  3  4  5  6  7  8  9\n";
        for(int i = 0; i < board.length; i++){
            out+=i+" ";
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == -1){
                   out+="   "; 
                } else {
                    out+=" "+(getCharAtLocation(j,i)).getGridIcon()+" ";
                }
            }
            out+="\n";
        }
        
        return out;
    }
}
