/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

/**
 *
 * @author josep
 */
public class Question1 {

    public Question1() {
        System.out.println("#### Question 1 ###");
        int list[] = {1,2,3,4,5,6};
        for(int i = 1; i < list.length;i++)
            list[i-1] = list[i];
        for(int i = 0; i < list.length;i++)
            System.out.print(list[i] + " ");
        System.out.println("");
        System.out.println("End of Question 1\n\n");
    }
   
}
