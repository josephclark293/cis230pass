/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week2;

/** num1 * num2 * num3;
 * 
 *
 * @author josep
 */
import java.util.Scanner;

public class GeometricMean {

    public static void main(String[] args) {
        Scanner keys = new Scanner(System.in);
        final double COUNT_OF_NUMS = 3;
        double num1, num2, num3;
        System.out.print("Enter three numbers: ");
        num1 = keys.nextDouble();
        num2 = keys.nextDouble();
        num3 = keys.nextDouble();

        double innnerProduct = num1 * num2 * num3;
        double geometricMean = Math.pow(innnerProduct, 1 / COUNT_OF_NUMS);

        System.out.println(geometricMean);

    }

}
/*
      final double COUNT_OF_NUMS = 3;
      double num1, num2,num3;
      System.out.print("Enter three numbers: ");
      num1 = keys.nextDouble();
      num2 = keys.nextDouble();
      num3 = keys.nextDouble();
      
      double innnerProduct = num1 * num2 * num3;
      double geometricMean = Math.pow(innnerProduct,1/COUNT_OF_NUMS);
      
 */
