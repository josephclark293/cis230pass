/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

import java.util.Random;

/**
 *
 * @author josep
 */
import java.util.*;
public class Searching {

    public static void main(String[] args) {
        final int SIZE = 1_000_000_000;
        int [] list = new int [SIZE];
        Random r = new Random();
        for(int i = 0; i < list.length -1; i++){
            list[i] = r.nextInt(0, 10);
        }
        list[list.length - 1] = 10;
        long start = System.currentTimeMillis();
        System.out.println("Found at index: " +  linearSearch(list, 10));
        long finish = System.currentTimeMillis();
        
        System.out.println("Linear Search: " + (finish - start));
        //We techinically don't need to sort since the key is at the end, but we will do it 
        //anyway to prevent the confusion.
        
        start = System.currentTimeMillis();
        Arrays.sort(list);
        System.out.println("Found at index: " +  binarySearch(list, 10));
        finish = System.currentTimeMillis();
        System.out.println("Binary Search: " + (finish - start));

    }
    public static int binarySearch(int [] list, int key){
        int low = 0;
        int high = list.length -1;
        while (low <= high){
            int mid = (low + high) /2 ;
            if(key < list[mid]){
                high = mid - 1;
            }else if(key == list[mid]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }

        }
        return -1;
    }

    public static int linearSearch(double[] list, double key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i]) {
                return i;
            }

        }
        return -1;
    }
    /**
     * Fill an array with random values. Low is the lowest random number and high is the highest (inclusive).
     * @param list - array to be filled.
     * @param low - lowest value.
     * @param max  - highest value inclusive. 
     */
    public static void fillArray(int [] list, int low, int max){
        Random r = new Random();
        for (int i = 0; i < list.length; i++) {
            list[i] = r.nextInt(low, max+1);
        }
        
    }

}
