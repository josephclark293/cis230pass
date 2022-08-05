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
public class Exam1Pt1 {
    /*
    1. False - Switch statment expresion must yield a value of char, byte, short, int or String
    2. True
    3. False the second statement has a comma in it. 
    4. True
    
    2a. (Math.pow(x,3) - 2 *y + z)/(x + x * y * z)
    b. (-1 * b + Math.sqrt(b * b + 4 * a + c))/(2 * a * b)
    c. x <= 5 && y >= 8 || (x+y >= 6 && x+y <= 20)
    d. (y % 4 == 0 || y % 10 != 0) || (y % 400 == 0)
    
    */
    public static void main(String[] args) {
        System.out.println("Question 3: ");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter birth year");
        int iBirthYear = input.nextInt() - 1960;
        switch(iBirthYear % 12){//12 year repeating cycle is mod 12, but question has 1960 as 0 which means we must subtract 1960
            case 0: System.out.println("Rat");break;
            case 1: System.out.println("Ox");break;
            case 2: System.out.println("Tiger");break;
            case 3: System.out.println("Rabbit");break;
            case 4: System.out.println("Dragon");break;
            case 5: System.out.println("Snake");break;
            case 6: System.out.println("Horse");break;
            case 7: System.out.println("Goat");break;
            case 8: System.out.println("Monkey");break;
            case 9: System.out.println("Rooster");break;
            case 10: System.out.println("Dog");break;
            case 11: System.out.println("Pig");break;
        }
        System.out.println("Question 4. a)");
        int n = (int)(Math.random()*10) + 1;
        int total = 0;
        int term = 3;
        for(int i = 0; i < n; i++){
            total+= term;
            term+=4;
        }
    }
    
}
