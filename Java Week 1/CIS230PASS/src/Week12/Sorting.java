/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author josep
 */
import java.util.Arrays;

public class Sorting {

    public static void main(String[] args) {
        final int SIZE = 1_000_000_000;
        int[] list = new int[SIZE];
        fillArray(list);
        long start = System.currentTimeMillis();
        selectionSort(list);
        long stop = System.currentTimeMillis();
        System.out.println("Selection Sort: " + (stop - start));

        fillArray(list); //scramble again
        start = System.currentTimeMillis();
        Arrays.sort(list);
        stop = System.currentTimeMillis();
        System.out.println("Another algorithm: " + (stop - start));
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentIndx = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndx = j;
                }

            }
            if (currentIndx != i) {
                list[currentIndx] = list[i];
                list[i] = currentMin;
            }

        }
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentIndx = i;
            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentIndx = j;
                }

            }
            if (currentIndx != i) {
                list[currentIndx] = list[i];
                list[i] = currentMin;
            }
            System.out.println(i);

        }
    }

    public static void fillArray(int[] list) {
        Searching.fillArray(list, 0, 10);
    }
}
