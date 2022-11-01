/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15;

/**
 *
 * @author josep
 */
public class PencilDriver {

    public static void main(String[] args) {
        Pencil p = new Pencil(.7, true, "Yellow", true, true, "Pink");
        if (p.isColor) {
            System.out.println(p.leadColor);
        } else {
            System.out.println("Not color");
        }
//        Pencil p2 = new Pencil();
//        p2.write("Hello");
//        p.write("Hello");
        doStuff(p);
        System.out.println(p.leadColor);
        System.out.println();
        

    }
    public static void doStuff(Pencil p){
        p.leadColor = "Brown";
    }
}

