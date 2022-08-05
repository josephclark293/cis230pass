/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Exeercis07_03_OOP {
    int [] frequencies;
    Scanner input;

    public Exeercis07_03_OOP() {
        frequencies = new int [100];
        input = new Scanner(System.in);
    }
    public void getInput(){
        System.out.print("Enter the integers between 1 and 100: ");
        int usrInput = input.nextInt();
        while(usrInput != 0){
            frequencies[usrInput-1]++;
            usrInput = input.nextInt();
        }
    }
    public void printResult(){
        for(int i = 0; i < frequencies.length;i++){
            if(frequencies[i] > 0){
                if(frequencies[i] > 1){
                    System.out.println((i+1) + " occurs " + frequencies[i] + " times.");
                }else{
                    System.out.println((i+1) + " occurs 1 time.");
                }
            }
        }
    }
//    public static void main(String[] args) {
//        Exeercis07_03_OOP ex = new Exeercis07_03_OOP();
//        ex.getInput();
//        ex.printResult();
//    }
    public void runIt(){
        getInput();
        printResult();
    }
    public static void main(String[] args) {
        new Exeercis07_03_OOP().runIt();
    }
    
    
    
}
