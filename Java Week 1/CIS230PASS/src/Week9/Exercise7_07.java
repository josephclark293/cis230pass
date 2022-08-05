/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week9;

/**
 *
 * @author josep
 */
public class Exercise7_07 {
    public static void main(String[] args) {
        int [] rgCounts = new int [10];
        System.out.println(java.util.Arrays.toString(rgCounts));
        final int NUM_RANDS = 100;
        for (int i = 0; i < NUM_RANDS; i++) {
            int random = (int) (Math.random() * 10 );
            switch(random){
                case 0: rgCounts[0]++;break;
                case 1: rgCounts[1]++;break;
                case 2: rgCounts[2]++;break;
                case 3: rgCounts[3]++;break;
                case 4: rgCounts[4]++;break;
                case 5: rgCounts[5]++;break;
                case 6: rgCounts[6]++;break;
                case 7: rgCounts[7]++;break;
                case 8: rgCounts[8]++;break;
                case 9: rgCounts[9]++;break;
            }
        }
        for (int i = 0; i < rgCounts.length; i++) {
            System.out.println(i + " occured " + rgCounts[i] + " times.");
            
        }
        
    }
}
