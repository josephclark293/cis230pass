/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

/**
 *
 * @author josep
 */
public class Question2 {

    public Question2() {
        System.out.println("#### Question 2 ###");
        System.out.println(mult(7));
        System.out.println(mult(4, 6));
        System.out.println("");
        System.out.println("End of Question 2\n\n");
    }

    public static int mult(int n, int t) {
        System.out.println("two int ");
        return n * t;
    }

    public static long mult(int n) {
        System.out.println("one int ");
        return n * 2;
    }

}
