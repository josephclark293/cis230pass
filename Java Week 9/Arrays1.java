/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

/**
 *
 * @author josep
 */
public class Arrays1 {
    public static void main(String[] args) {
        /*
        In this program we will fill an array of 
        15 elements with random values between 30 and 99.
        We need 69 numbers. That start at 30
        */
        final int ARRAY_SIZE = 15;
        int [] rgRandomNums = new int [ARRAY_SIZE];
        for (int i = 0; i < rgRandomNums.length; i++) {
            rgRandomNums[i] = (int)(Math.random() * 69) + 30;            
        }
        /*
        Print array
        */
        System.out.print("[");
        
        for(int i = 0; i < rgRandomNums.length;i++){
            System.out.print(rgRandomNums[i] + ",");
        }
        System.out.println("]");
        /*
        Min
        */
        int min = rgRandomNums[0];
        for(int i = 1; i < rgRandomNums.length;i++){
            if(rgRandomNums[i] < min){
                min = rgRandomNums[i];
            }
        }
        System.out.println(min);
    }
}
