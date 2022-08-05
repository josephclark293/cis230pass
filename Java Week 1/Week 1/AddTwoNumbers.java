/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author josep
 */
import java.util.Scanner;
public class AddTwoNumbers {
    public static void main(String [] args){    
        Scanner kb = new Scanner(System.in);
        System.out.print("Please enter number 1:");
        double num1 = kb.nextDouble();
        System.out.print("Please enter number 2:");
        double num2 = kb.nextDouble();
        double sum = num1 + num2;
        System.out.println("The total is " + sum);
    }
}
