/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12.SampleExam2;

/**
 *
 * @author josep
 */
public class Question6 {

    public Question6() {
        System.out.println("### Question 6 ####");
        int[] testVec1 = {1,2,355,8,9};
        System.out.println(isIncreasingThree(testVec1));
        System.out.println("End of Question 6\n\n\n");
    }

    public static boolean isIncreasingThree(int [] nums){
        if(nums.length < 3){
            return false;
        }
        for (int i = 0; i < nums.length - 2; i++) {
            if(nums[i+1] > nums[i] && nums[i+2] > nums[i+1]){
                return true;
            }
            
        }
        return false;
    }
    
}
