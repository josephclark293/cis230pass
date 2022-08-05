/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week8;

/**
 *
 * @author josep
 */
public class OverloadingExample {
    public static void main(String[] args) {
        System.out.println("0.5 * 0.5 = " + multiply(0.5, 0.5));
        System.out.println("2 * 3 = " + multiply(2, 3));
        System.out.println("Hello * 3 = " + multiply("Hello", 3));
    }
    public static double multiply(double a, double b){
        return a * b;
    }
    public static int multiply(int a, int b){
        return a * b;
    }
    public static String multiply(String a, int b){
        String result = "";
        for (int i = 0; i < b;i++){
            result+=a;
        }
        return result;
    }
    
}
