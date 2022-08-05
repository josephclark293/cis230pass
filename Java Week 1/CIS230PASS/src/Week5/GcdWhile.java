/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week5;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class GcdWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gcd = 1; //1 divides every number
        int k = 2; //number to test
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        while (k <= n1 && k<=n2){
            if(n1 % k == 0 && n2 %  k == 0){
                gcd = k;
            }
            k++;
        }
        System.out.println("The GCD is " + k);
    }
    
}
