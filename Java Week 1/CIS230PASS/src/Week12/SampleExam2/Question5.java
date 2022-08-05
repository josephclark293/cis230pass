/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Question5 {

    public Question5() {
        System.out.println("#### Question 5 ###");
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Election Management System!");
        System.out.print("How many candidates are there? ");
        int numCandidates = input.nextInt(); input.nextLine();
        String[] candidates = new String[numCandidates];
        int[] votes = new int[numCandidates];
        runElection(input, candidates, votes);
        System.out.println("");
        System.out.println("End of Question 5\n\n");
    }

    public static void runElection(Scanner input, String[] candStrings, int[] votes) {
        fillCandidates(input, candStrings);
        getVotes(input, votes);
        int max = getMax(votes);
        printWinner(candStrings[max], votes[max]);
    }

    public static void fillCandidates(Scanner input, String[] candStrings) {
        for (int i = 0; i < candStrings.length; i++) {
            System.out.print("Enter the name of Candidate " + (i + 1) + " : ");
            candStrings[i] = input.nextLine();

        }
    }

    public static void getVotes(Scanner input, int[] votes) {
        System.out.println("Now, enter the votes");
        System.out.print("Enter Candidate # (Enter 0 to finish): ");
        int usrVote = input.nextInt();
        while (usrVote != 0) {
            if (usrVote < 0 || usrVote > votes.length) {
                System.out.println("NOT A VALID VOTE!!");
            } else {
                votes[usrVote - 1]++;
            }
            System.out.print("Enter Candidate # (Enter 0 to finish): ");
            usrVote = input.nextInt();
        }
    }

    public static int getMax(int[] votes) {
        int max = votes[0];
        int maxIndx = 0;
        for (int i = 1; i < votes.length; i++) {
            if (votes[i] > max) {
                max = votes[i];
                maxIndx = i;
            }

        }
        return maxIndx;
    }

    public static void printWinner(String name, int numOfVotes) {
        System.out.println("Congratulations. " + name + " has won the election by earning " + numOfVotes + " votes!!");
    }

}
