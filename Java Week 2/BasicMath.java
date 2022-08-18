/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/**
 *
 * @author josep
 */
import java.util.Scanner;
public class BasicMath {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("The sum is " + (num1 + num2));
        System.out.println("The difference is " + (num1 - num2));
        System.out.println("The product is " + (num1 * num2));
        System.out.println("The quotient is " + (num1 / num2));
    }
}
