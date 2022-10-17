/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week10;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Exercise07_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int USER_NUMS = 10;
        int [] rgUserNums = new int[USER_NUMS];
        for (int i = 0; i < rgUserNums.length; i++) {
            System.out.print("Read a number: ");
            rgUserNums[i] = in.nextInt();
            
        }
        System.out.print("\nThe reversal of the input is ");
        for(int i = rgUserNums.length-1; i >= 0; i--){
            System.out.print(rgUserNums[i] + " ");
        }
        System.out.println("");
    }
}
