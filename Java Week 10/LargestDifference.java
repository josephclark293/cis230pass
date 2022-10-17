/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week11;

/**
 *
 * @author josep
 */
public class LargestDifference {
    public static void main(String[] args) {
        double [] test1 = {1,2,3,4,5,6,7,8,9};
        System.out.println(getLargestDifference(test1));
    }
    public static double getLargest(double[] list){
        double max = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i] > max){
                max = list[i];
            }
            
        }
        return max;
    }
    public static double getSmallest(double [] list){
        double min = list[0];
        for (int i = 1; i < list.length; i++) {
            if(list[i] < min){
                min = list[i];
            }
            
        }
        return min;
    }
    public static double getLargestDifference(double [] list){
        return getLargest(list) - getSmallest(list);
    }
}
