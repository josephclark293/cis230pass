/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week14;

/**
 *
 * @author josep
 */
public class StrictlyIndentical {

    public static boolean equals(int[][] m1, int[][] m2) {
        for(int i = 0; i < m1.length && i < m2.length;i++){
            for(int j = 0; j < m1[i].length && j < m2[i].length;j++){
                if(m1[i][j] != m2[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
}
