/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author josep
 */
public class ReferenceVariables {
    public static void main(String[] args) {
        int [][] ref = new int [5][5];
        System.out.println("Here we see the value of the variable 'ref' " + ref);
        System.out.println("Now lets look an element inside of 'ref' " + ref[0] + " this is "
                + "still a reference because it is a 1D array.");
        System.out.println("Now finally, " + ref[0][0] + " we can an singular integer value.");
        
    }
    
}
