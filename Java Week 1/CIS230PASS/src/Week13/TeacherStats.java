/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week13;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class TeacherStats {

    /**
     * Here I used the main method to only run the teacher stats method.
     * A little more advanced, but that is okay. Remember this is a sample
     * solution you may call methods inside of main. That is completely okay 
     * @param args 
     */
    public static void main(String[] args) {
        runTeacherStats();
    }
    /**
     * Do all the work. Calling the other methods.
     */
    public static void runTeacherStats(){
        Scanner input = new Scanner(System.in);
        //calling the getNumber method the way I did may confuse you.
        //All it is doing is calling the method once the program gets to that 
        //part and then using the number it returns to create the array
        String[] names = new String[getNumStudents(input)];
        double[] scores = new double[names.length];
        getData(names, scores, input);
        presentHighestStudent(names, scores);
        presentLowestStudent(names, scores);
        showStatistics(scores);
    }
    /**
     * This method gets the number of students for the class
     * @param input Scanner object to be used to collect input
     * @return the number of students in the class
     */
    public static int getNumStudents(Scanner input) {
        System.out.print("Enter the number of students in your class: ");
        return input.nextInt();
    }
    /**
     * Get the student name and the test score data.
     * We use parallel arrays here with each index representing a student.
     * @param names The name of array created to represent students
     * @param scores The name of the array for the scores
     * @param input Using passed in Scanner object
     */
    public static void getData(String[] names, double[] scores, Scanner input) {
        input.nextLine(); //Clear New line hanging on keyboard buffer.
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter student name: ");
            names[i] = input.nextLine();
            System.out.print("Enter " + names[i] + "'s score on the exam: ");
            scores[i] = input.nextDouble();
            input.nextLine();//consume the new line character
        }
    }
    /**
     * Present to the user highest student name and score.
     * Calls getHighestStudent method to get the INDEX of highest score.
     * @param names Array for names of students
     * @param scores Array for scores of students
     */

    public static void presentHighestStudent(String[] names, double[] scores) {
        int maxIndx = getHighestStudent(scores);
        System.out.println("The highest score was " + scores[maxIndx] + " from " + names[maxIndx]);
    }
    /**
     * Find the index of highest student
     * @param scores Array of test scores.
     * @return highest INDEX
     */
    public static int getHighestStudent(double[] scores) {
        double max = scores[0];
        int maxIndx = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
                maxIndx = i;
            }
        }
        return maxIndx;
    }
    /**
     * Present the lowest student name and score
     * minIndx gets the minimum index from the method.
     * @param names Array of names of students.
     * @param scores Array of scores of students.
     */
    public static void presentLowestStudent(String [] names, double [] scores){
        int minIndx = getLowestStudent(scores);
        System.out.println("The lowest score was " + scores[minIndx] + " from " + names[minIndx]);
    }
    /**
     * Same logic as get highest but reversed.
     * @param scores
     * @return 
     */
    public static int getLowestStudent(double[] scores) {
        double min = scores[0];
        int minIndx = 0;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                minIndx = i;
            }
        }
        return minIndx;
    }
    /**
     * Calculate average of scores using for loop.
     * @param scores
     * @return 
     */
    public static double getAverage(double [] scores){
        double sum = 0;
        for(int i = 0; i < scores.length;i++){
            sum+=scores[i];
        }
        return sum/scores.length;
    }
    /**
     * Calculate Std Deviation
     * This method takes the square root of the numerator and denominator of the 
     * given formula. 
     * @param mean
     * @param scores
     * @return 
     */
    public static double getStdDeviation(double mean, double [] scores){
        return Math.sqrt(getMeanDifferenceSquared(mean, scores)/(scores.length - 1));
    }
    /**
     * Calculate numerator of std dev. 
     * @param mean
     * @param scores
     * @return 
     */
    public static double getMeanDifferenceSquared(double mean,double [] scores){
        double sum = 0;
        for(int i = 0; i < scores.length;i++){
            sum = sum +  (scores[i] - mean) * (scores[i] - mean);
        }
        return sum;
    }
    /**
     * Show the statistics to the user.
     * @param scores 
     */
    public static void showStatistics(double [] scores){
        double avg = getAverage(scores);
        double stdDev = getStdDeviation(avg, scores);
        System.out.println("The exam average is " + avg);
        System.out.println("The exam standard deviation is " + stdDev);
    }

}
        