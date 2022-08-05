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
public class MarkovMatrix {
    public static void main(String[] args) {
        System.out.println("Enter a 3 x 3 matrix row by row:");
        double [][] m = getMatrix();
        if(isMarkovMatrix(m)){
            System.out.println("It is a Markov matrix");
        }else{
            System.out.println("It is not a Markov matrix");
        }
    }
    public static double [][] getMatrix(){
        Scanner input = new Scanner(System.in);
        double [][] m = new double[3][3];
        for (int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length;j++){
                m[i][j] = input.nextDouble();
            }
            
        }
        return m;
    }
    public static boolean isMarkovMatrix(double [][] m){
        for(int col = 0; col < m[0].length;col++){
            double sum = 0;
            for(int row = 0; row < m.length;row++){
                if(m[row][col] < 0){
                    return false;
                }
                sum+=m[row][col];
            }
            if(sum != 1){
                return false;
            }
        }
        return true;
    }
    
}
