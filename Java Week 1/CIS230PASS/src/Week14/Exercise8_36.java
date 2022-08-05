/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Week14;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Exercise8_36 {
    public static void main(String[] args) {
      runLatinSquare();
    }
    public static void runLatinSquare(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = input.nextInt();
        char [][] square = new char [n][n];
        System.out.println("Enter for rows of letters seperated by spaces");
        for(int i = 0; i < square.length;i++){
          boolean validRow = true;
            for(int j = 0; j < square[i].length;j++){
                char c =  input.next().charAt(0);
                if(isValidInput(c, n)){
                    square[i][j] = c;
                }else{
                  validRow = false;      
                }
            }
            if(!validRow){
              System.out.println("Wrong input: the letters must be from A to " + (char)('A' + n -1));
              
              
            }
        }
        if(isLatinSqaure(square)){
            System.out.println("The input array is a Latin square");
        }else{
            System.out.println("The input array is not a Latin square");
        }
    }
    public static boolean isValidInput(char c, int n){
        if(c >= 'A' && c <= 'A' + n){
            return true;
        }
        return false;
    }
    public static boolean isLatinSqaure(char [][] s){
        for(int i = 0 ; i < s.length; i++){
            if(!checkRow(s, i) || !checkColumn(s, i)){
                return false;
            }
        }
        return true;
    }
    public static boolean checkRow(char [][] s,int row){
        for(int i = 0; i < s[row].length;i++){
            for(int j = 0; j < s[row].length;j++){
                if(s[row][i] == s[row][j] && i != j){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkColumn(char [][]s,int col){
        for(int c = 0; c < s.length;c++){
            for(int r = 0; r < s.length;r++){
                if(s[c][col] == s[r][col] && c != r){
                    return false;
                }
            }
        }
        return true;
    }
}
