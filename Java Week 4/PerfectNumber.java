/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author josep
 */
public class PerfectNumber {
    public static void main(String[] args) {
        final int NUM_OF_PERFECTS = 4;
        int countOfPerfects = 0;
        int numToCheck = 2;
        while(countOfPerfects < NUM_OF_PERFECTS){
            int sum = 0;
            for(int i = 1; i <= numToCheck/2;i++){
                if(numToCheck % i == 0){
                    sum+=i;
                }
            }
            if(sum == numToCheck){
                System.out.println(numToCheck + " is pefect.");
                countOfPerfects++;
            }
            numToCheck++;
        }
    }
    
}
