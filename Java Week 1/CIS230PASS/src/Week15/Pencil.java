/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week15;

/**
 *
 * @author josep
 */
public class Pencil {

    public double size;
    public boolean eraser;
    public String color;
    public boolean isMechanical;
    public boolean isColor;
    public String leadColor;

    public static void main(String[] args) {
        Pencil p = new Pencil(.7, true, "Yellow", true, true, "Pink");
        if (p.isColor) {
            System.out.println(p.leadColor);
        } else {
            System.out.println("Not color");
        }
        Pencil p2 = new Pencil();
        p2.write("Hello");
        p.write("Hello");

    }

    public Pencil() {
        size = 0.0;
        eraser = false;
        color = "";
        isMechanical = false;
        isColor = false;
        leadColor = "";
    }

    public Pencil(double size, boolean eraser, String color, boolean isMechanical, boolean isColor, String leadColor) {
        this.size = size;
        this.eraser = eraser;
        this.color = color.trim();
        this.isMechanical = isMechanical;
        this.isColor = isColor;
        this.leadColor = leadColor.trim();
    }

    public void write(String s) {
        System.out.println("Writing with:" + leadColor + " colored pencil:");
        System.out.println(s);
    }

}
