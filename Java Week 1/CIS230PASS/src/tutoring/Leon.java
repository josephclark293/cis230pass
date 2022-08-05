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
public class Leon {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
//        final int NUM_GOODS = 100;
//        int numToCheck = 10; //start checking at 10
//        int perfsFound = 0;
//        while(perfsFound < NUM_GOODS){
//            int sumOfDigits = 0;
//            int cpyNumToCheck = numToCheck;
//            while(cpyNumToCheck != 0){
//                int digit = cpyNumToCheck % 10;
//                sumOfDigits+= digit;
//                cpyNumToCheck /=10;
//            }
//            if(numToCheck % sumOfDigits == 0){
//                perfsFound++;
//                if(perfsFound % 10 == 0){
//                    System.out.printf("%3d\n",numToCheck);
//                }else{
//                    System.out.printf("%3d" + " ",numToCheck);
//                }
//                
//            }
//            numToCheck++;
//        }
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your heart rate:");
//        double heartRate = input.nextInt();
//        System.out.print("Enter your age:");
//        int age = input.nextInt();
//        double target = 220 - age;
//        if (heartRate >= target * .5 && heartRate <= target * 0.85) {
//            System.out.println("Your heart rate is within range.");
//        } else {
//            System.out.println("Your heart rate is not within range.");
//        }
//        input.close();
          int x = 1;
          System.out.println("x = " + x);
          int sign = 1; double total = 0; double term = 1;
          for(int i = 1; i <= 100;i++){
              term = term/i;
              total+= term * sign;
              sign *= -1;
          }
          System.out.println(total * x);
          if(true){
              
          }else{

          }

    }

}
class Letter{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine().toLowerCase();
        int iNumVowels = 0;
        int iNumConsants = 0;
        for(int i = 0; i < sentence.length();i++){
            char letter = sentence.charAt(i);
            if(letter == 'a' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'e'){
                iNumVowels++;
            }else if (Character.isLetter(letter)){
                iNumConsants++;
            }
        }
        System.out.println(iNumVowels);
        System.out.println(iNumConsants);
    }
}
class LeapYear{
    public static void main(String[] args) {
        final int NUM_PER_LINE = 10;
        int startYr = 101;
        final int STOP_YR = 2100;
        int count = 0;
        for(int year = startYr; year < STOP_YR;year++){
            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if(isLeap){
                count++;
                if(count % NUM_PER_LINE == 0){
                    System.out.println(year);
                }else{
                    System.out.print(year + " ");
                }
            }
        }
        System.out.println("The number of leap years is " + count);
    }
}
class Exercise03_22{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        /*
        If the distance between entered point
        and 0 is less than or equal to 10
        then point in circle. OW it is not
        Hint: x_1 and y_1 are zero.
        */
        double distanceFromZero = Math.sqrt(x * x + y * y);//FiX THIS PART
        if(distanceFromZero <= 10 ){ //Fix this)
            //In circle
            System.out.println("Point (" + x + ", " + y + ") is in the circle.");
        }else{
            //outside of circle
            System.out.println("Point (" + x + ", " + y + ") is not in the circle.");
        }
    }
}
class Exercise07_15{
    public static void main(String[] args) {
        int []  test1 = {1,0};
        System.out.println(eliminateDuplicates(test1));
    }

    public static int [] eliminateDuplicates(int [] list ){
        int numDistincts = 0;
        int[] distincts = new int[list.length];
        for(int i = 0;i < distincts.length;i++){
            boolean isDistinct = true;
            for(int j = 0; j < i;j++){
                if(list[i] == list[j]){
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct){
                distincts[i] = list[i];
                numDistincts++;
            }
        }
        int [] result = new int[numDistincts];
        for(int i = 0; i < numDistincts;i++){
            result[i] = distincts[i];
        }
        System.out.println("The number of distincts is " + numDistincts);
        return result;
//        return numDistincts;
    }
}
