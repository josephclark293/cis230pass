/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class SineFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angle = Math.toRadians(input.nextDouble());
        int sign = 1;
        double denominator = 1;
        double sum = 0;
        for(int i = 0; i < 250;i++){
            double numerator = sign * Math.pow(angle, 2*i + 1);
            denominator = denominator * (2 * i + 1);
            sum+= numerator/denominator;
            sign *= -1;
        }
        System.out.println(sum);
        System.out.println(Math.sin(Math.toRadians(90)));
    }
    
}
