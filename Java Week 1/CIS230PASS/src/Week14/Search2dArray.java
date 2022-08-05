/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author josep
 */
public class Search2dArray {

    public static void main(String[] args) {
        int[][] test1 = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(test1, 3));
    }
    public static boolean searchMatrix(int [][] matrix, int target){
        int row = findRowBinarySearch(matrix, target);
        if(row != -1){
            return binarySearchRow(matrix[row], target);
        }
        return false;
    }


    public static boolean binarySearchRow(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return true;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    public static int findRowBinarySearch(int[][] matrix, int target) {
        int low = 0;
        int high = matrix.length -1;
        while(low <= high){
            int mid = (high + low)/2;
            if(target < matrix[mid][0]){
                high = mid -1;
            }else if(target >= matrix[mid][0] && target <= matrix[mid][matrix[mid].length - 1]){
                return mid;
            }else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
