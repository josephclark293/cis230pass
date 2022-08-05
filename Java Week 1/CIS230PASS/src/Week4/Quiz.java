/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week4;

/**
 *
 * @author josep
 */
public class Quiz {

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int wrong = 0;
        int answer;
        while (wrong < 3) {
            int random1 = (int) (Math.random() * 100);
            int random2 = (int) (Math.random() * 125);
            int modulus = (int) (Math.random() * 150);
            System.out.print(random1 + " % " + modulus + " = ");
            answer = input.nextInt();
            if(answer == random1 % modulus){
                System.out.println("Correct! \u263A");
            }else{
                wrong++;
                System.out.println("Incorrect \u2639");
            }
//            System.out.print("( " + random1 + " + " + random2 + " )" +  " % " + modulus + " = ");
//            answer = input.nextInt();
//            if(answer == (random1 + random2) % modulus){
//                System.out.println("Correct! \u263A");
//            }else{
//                wrong++;
//                System.out.println("Incorrect \u2639");
//            }
//            input.nextLine();
        }
    }
}

