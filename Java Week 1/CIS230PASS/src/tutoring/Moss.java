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
public class Moss {

    public static void main(String[] args) {
        for (int num = 10_000; num >= 2; num--) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num);
                break;
            }
        }
    }
}

class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        if (n1 <= n2 && n1 <= n3) {
            System.out.print(n1 + ",");//n1 then is smallest
            if (n2 < n3) {
                System.out.println(n2 + "," + n3);
            } else {
                System.out.println(n3 + "," + n2);
            }
        } else if (n2 <= n1 && n2 <= n3) {
            System.out.print(n2 + ",");
            if (n1 < n3) {
                System.out.println(n1 + "," + n3);
            } else {
                System.out.println(n3 + "," + n1);
            }
        } else {//Three the biggest
            System.out.print(n3 + ",");
            if (n1 < n2) {
                System.out.println(n1 + "," + n2);
            } else {
                System.out.println(n2 + "," + n1);
            }
        }
    }
}
