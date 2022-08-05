/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoring;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Gavin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        double fahrenheit;
        fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius + " Celsius is" + fahrenheit + " Fahrenheit");
    }

}

class Gavin2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = radius * radius * Math.PI;
        double volume = area * length;
        System.out.println(area);
        System.out.println(volume);
    }
}

class Gavin3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();
        System.out.println(feet * 0.305);

    }
}

class Gavin4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double kilograms = input.nextDouble();
        System.out.println(kilograms + " pounds is " + 0.454 * kilograms + " kilograms ");

    }
}

class Gavin5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter subtotal and gratutity rate: ");
        double subtotal = input.nextDouble();
        double gratutity = input.nextDouble();
        System.out.print("The gratutity is " + subtotal * gratutity / 100);
        System.out.println(" total is " + (subtotal * gratutity / 100 + subtotal));
    }
}

class Exercise02_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initialTemp = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double finalTemp = input.nextDouble();
        System.out.println("The energy needed is " + (mass * (finalTemp - initialTemp) * 4184));
    }
}

class Exercise03_04 {

    public static void main(String[] args) {
        int month = (int) (Math.random() * 12) + 1;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
    }
}

class Exercise03_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapse = input.nextInt();
        switch (day) {
            case 0:
                System.out.print("Today is Sunday and the future day is ");
                break;
            case 1:
                System.out.print("Today is Monday and the future day is ");
                break;
            case 2:
                System.out.print("Today is Tuesday and the future day is ");
                break;
            case 3:
                System.out.print("Today is Wednesday and the future day is ");
                break;
            case 4:
                System.out.print("Today is Thursday and the future day is ");
                break;
            case 5:
                System.out.print("Today is Friday and the future day is ");
                break;
            case 6:
                System.out.print("Today is Saturday and the future day is ");
                break;
        }
        switch ((day + elapse) % 7) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }
}

class Exercise03_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three digit integer: ");
        int iNumToCheck = input.nextInt();
        int original = iNumToCheck;
        int dig1 = iNumToCheck % 10 * 100;
        iNumToCheck /= 10;
        int dig2 = iNumToCheck % 10 * 10;
        iNumToCheck /= 10;
        int dig3 = iNumToCheck;
        if (dig1 + dig2 + dig3 == original) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}

class Ecercise03_14 {

    public static void main(String[] args) {
        for (int i = 0; i < 10_000; i++) {
            System.out.println(Math.random() * 2);
        }
    }
}

class Exercise05_04 {

    public static void main(String[] args) {
        final double MILES_TO_KG = 1.609;
        System.out.println("Miles   Kilometers");
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                System.out.printf(i + "      " + "%3.3f\n",(i * MILES_TO_KG));
            } else {
                System.out.printf(i + "       " + "%3.3f\n",(i * MILES_TO_KG));
            }
        }
    }
}
class Exercise05_07{
    public static void main(String[] args) {
        double tuition = 10_000;
        final double INCREASE = 0.05;
        for(int i = 0; i < 10;i++){
            tuition = tuition + (tuition * INCREASE);
        }
        System.out.println("After 10 years tuition is $" + tuition);
        double total = tuition;
        for(int i = 0; i < 3;i++){
            tuition = tuition + (tuition * INCREASE);
            total+=tuition;
        }
        System.out.println("After four years you will pay $" + total);
    }
}
class Exercise05_18{
    public static void main(String[] args) {
        for(int i = 1; i <= 6;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
            
}
class Exercise06_01{
    public static void main(String[] args) {
        for(int i = 1; i <= 100;i++){
            if(i % 10 == 0){
                System.out.printf("%7d\n",getPentagonalNumber(i));
            }else{
                System.out.printf("%7d",getPentagonalNumber(i));
            }
        }
    }
    public static int getPentagonalNumber(int n){
        return (n*(3*n-1))/2;
    }
}
class Exercise06_02{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long usrNum = input.nextLong();
        System.out.println("The sum of digits for " + usrNum + " is " + sumDigits(usrNum));
    }
    public static int sumDigits(long n){
        int sum = 0;
        while(n > 0){
            sum+= n % 10;
            n /= 10;
        }
        return sum;
              
    }
}