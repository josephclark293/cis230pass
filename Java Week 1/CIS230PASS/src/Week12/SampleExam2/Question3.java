/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

/**
 *
 * @author josep
 */
public class Question3 {

    public Question3() {
        int [] rgiFib = {0,1,0,0,0,0,0,0};
        guessWhat(rgiFib);
        System.out.println("#### Question 3 ###");
        for (int i = 0; i < rgiFib.length; i++) {
            System.out.print(rgiFib[i] + " ");
            
        }
        System.out.println("");
        System.out.println("End of Question 3\n\n");
    }
    public static void guessWhat(int rgiFib[]){
        for(int i = 2; i < rgiFib.length;i++){
            rgiFib[i] = -rgiFib[i-1] + 2 * rgiFib[i -2];
        }
    }
    
}
