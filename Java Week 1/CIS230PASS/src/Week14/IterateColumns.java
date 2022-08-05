/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author josep
 */
public class IterateColumns {
    public static void main(String[] args) {
        int [][] test = new int [3][3];
        Fill2Darray.fill2DArray(test);
        Fill2Darray.print2DArray(test);
        getMaxPerColumn(test);
    }
    public static void getMaxPerColumn(int [][] x){
        
        for(int col = 0; col < x[0].length;col++){
            int max = x[0][col];
            for(int row = 1; row < x.length;row++){
                if( x[row][col] > max){
                    max = x[row][col];
                }
            }
            System.out.println("The max for column " + (col + 1) + " is " + max);
        }
    }
           
}
