/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week7;

/**
 *
 * @author josep
 */
import java.util.Scanner;
public class SimpleMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        System.out.println("The sum is " + add(num1, num2));//Method returns a value
        System.out.println("The difference is " + subtract(num1, num2));
        System.out.println("The product is " + multiply(num1, num2));
        System.out.println("The quotient is " + divide(num1, num2));
    }
    /**
     * This method adds two integers
     * @param a 
     * @param b 
     * @return sum of a and b as an integer
     */
    static int add(int a, int b){
        return a + b;
    }
    /**
     * This method subtracts two integers
     * @param a value on the left
     * @param b value on the right
     * @return difference of a and b
     */
    static int subtract(int a, int b){
        return a - b;
    }
    /**
     * This method multiplies two integers
     * @param a
     * @param b
     * @return product of a and b
     */
    static int multiply(int a, int b){
        return a * b;
    }
    /**
     * Divides two integers.
     * @param a 
     * @param b divisor
     * @return a /b as a double
     */
    static double divide(int a, int b){
        return a / (double)b;
    }
    
}
