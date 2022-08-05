/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week6;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Exam1Pt2 {

    public static void main(String[] args) {
        int n = 10;
        int sign = 1;
        double total = 0;
        for (int i = 1; i <= 10; i++) {
            total += sign / (double)(i * i);
            sign *= -1;
        }
        System.out.println(total);
        System.out.println("############# Question c ############");
        java.util.Scanner input = new Scanner(System.in);
        int sumEvens = 0;
        int sumOdds = 0;
        int usrInput = input.nextInt();
        while (usrInput != 0) {
            if (usrInput % 2 == 0) {
                sumEvens += usrInput;
            } else {
                sumOdds += usrInput;
            }
            usrInput = input.nextInt();
        }
        System.out.println("############# Question c ############");
        int x = 1;
        System.out.println("x = " + x);
        sign = 1;
        total = 0;
        double term = 1;
        for (int i = 1; i <= 100; i++) {
            term = term / i;
            total += term * sign;
            sign *= -1;
        }
        System.out.println(total * x);
        System.out.println("########## Question 5 ################");
        System.out.print("Enter your heart rate:");
        double heartRate = input.nextInt();
        System.out.print("Enter your age:");
        int age = input.nextInt();
        double target = 220 - age;
        if (heartRate >= target * .5 && heartRate <= target * 0.85) {
            System.out.println("Your heart rate is within range.");
        } else {
            System.out.println("Your heart rate is not within range.");
        }
        input.close();
        final int NUM_GOODS = 100;
        int numToCheck = 10; //start checking at 10
        int perfsFound = 0;
        while(perfsFound < NUM_GOODS){
            int sumOfDigits = 0;
            int cpyNumToCheck = numToCheck;
            while(cpyNumToCheck != 0){
                int digit = cpyNumToCheck % 10;
                sumOfDigits+= digit;
                cpyNumToCheck /=10;
            }
            if(numToCheck % sumOfDigits == 0){
                perfsFound++;
                if(perfsFound % 10 == 0){
                    System.out.printf("%3d\n",numToCheck);
                }else{
                    System.out.printf("%3d" + " ",numToCheck);
                }
                
            }
            numToCheck++;
        }
    }

}
