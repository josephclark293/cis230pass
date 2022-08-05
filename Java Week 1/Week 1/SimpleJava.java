/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week1;

/**
 *
 * @author josep
 */
import java.util.Scanner;
public class SimpleJava {
    public static void main(String [] args){
        Scanner keys = new Scanner(System.in);
        System.out.print("Enter a message to be echoed back:");
        String usrMsg = keys.nextLine();
        System.out.println(usrMsg);
    }
    
}
