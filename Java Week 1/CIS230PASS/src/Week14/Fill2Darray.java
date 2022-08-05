/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author josep
 */
import java.util.*;
public class Fill2Darray {
    public static void main(String[] args) {
        int [][] nums = new int [5][5];
        fill2DArray(nums);
        print2DArray(nums);
    }
    public static void fill2DArray(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length;j++){
                matrix[i][j] = (int)(Math.random() * 10 + 1);
            }
            
        }
    }
    public static void print2DArray(int [][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%4d",matrix[i][j]);
                
            }
            System.out.println();
            
        }
    }
    
}
