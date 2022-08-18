/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Rectangle {

    //Rectangles require you have to have two different measurements
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length: ");
        double length = input.nextDouble();
        System.out.print("Enter the width: ");
        double width = input.nextDouble();
        double perimeter = 2 * length + 2 * width;
        double area = length * width;
        System.out.println("The perimeter is " + perimeter);
        System.out.println("The area is " + area);
    }

}
