/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Three Numbers: ");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();
        sortThreeNumbers(num1, num2, num3);
    }
    public static void displaySortedNumbers(double num1,double num2, double num3){
        System.out.print("The sorted numbers are ");
        System.out.println(num1 + " " + num2 + " " + num3 + " ");
    }
    public static void displaySortedNumbers(int num1, int num2, int num3){
        System.out.print("The sorted numbers are ");
        System.out.println(num1 + " " + num2 + " " + num3 + " ");
    }
    public static void sortThreeNumbers(double num1, double num2, double num3){
        /*
        I will use the bubble method your book uses in Chapter 3
        */
        if(num1 > num2){
            //Bubble over
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            //bubble over
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            // we've bubbled over the biggest to the last, so check first two
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }
        displaySortedNumbers(num1, num2, num3);
    }
    public static void sortThreeNumbers(int num1, int num2, int num3){
                /*
        I will use the bubble method your book uses in Chapter 3
        */
        if(num1 > num2){
            //Bubble over
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if(num2 > num3){
            //bubble over
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            // we've bubbled over the biggest to the last, so check first two
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        displaySortedNumbers(num1, num2, num3);
    }
    
}
