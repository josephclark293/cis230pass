/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Question4 {
    
    public Question4() {
        System.out.println("#### Question 4 ###");
        Scanner input = new Scanner(System.in);
        double tuition = 11_000;
        double targetTuition = getTargetTuition(input);
        double increaseRate = getIncreaseRate(input);
        int year = getNumYears(tuition, targetTuition, increaseRate);
        displayResult(year, targetTuition);
        System.out.println("");
        System.out.println("End of Question 4\n\n");
    }
    public static double  getTargetTuition(Scanner input){
        System.out.print("Enter a target tuition: ");
        return input.nextDouble();
    }
    public static double getIncreaseRate(Scanner input){
        System.out.print("Enter an increase rate (in percent): ");
        return input.nextDouble()/100;
    }
    public static int getNumYears(double startTuition,double target, double increaseRate){
        int year = 0;
        while(startTuition < target){
            startTuition = startTuition * (1 + increaseRate);
            year++;
        }
        return year;
    }
    public static void displayResult(int years, double tuition){
        System.out.print("It will take " + years + " years ");
        System.out.print("for Tuition to be " + tuition);
    }
    
    
}
