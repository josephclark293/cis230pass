/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Exercise07_12 {
    public static void main(String[] args) {
        final int SIZE = 10;
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double [] rgUserNums = new double[SIZE];
        for (int i = 0; i < 10; i++) {
            rgUserNums[i] = keys.nextDouble();
        }
        reverse(rgUserNums);
        System.out.println("The reversal of the input is");
        for (int i = 0; i < rgUserNums.length; i++) {
            System.out.print(rgUserNums[i] + " ");
            
        }
        System.out.println("");
    }
    public static void reverse (double [] list){
        // Reverse Array without creating a new array
        for(int i = 0,j = list.length -1; i < list.length/2;i++,j--){
            if(list[i] != list[j]){
                //swap
                double temp = list[i];
                list[i] = list[j];
                list[j] = temp;
            }
        }
        
    }
}
