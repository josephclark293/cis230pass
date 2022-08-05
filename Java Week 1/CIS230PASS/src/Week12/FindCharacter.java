/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week12;

/**
 *
 * @author josep
 */
public class FindCharacter {
    public static void main(String[] args) {
        String s = "abcd";
        assert containsCharacter('b', s) == true :   "Incorrect";
        
        s = "The quick brown fox jumped over the lazy dog.";
        assert containsCharacter('!', s) == false:  "Incorrect";
        
        s = "The purple pink pants have stuff";
        assert containsCharacter('z', s) == false:  "Incorrect";
        
    }
    public static boolean containsCharacter(char c,String s){
        for(int i = 0; i < s.length();i++){
            if(c == s.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
