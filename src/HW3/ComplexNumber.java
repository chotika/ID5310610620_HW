/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW3;

import java.util.Scanner;

/**
 *
 * @author MY-SNSD
 */
public class ComplexNumber {
    // Field
    private int rePart; // Real part
    private int imPart;// Immagination part
    
    
    // Constructor  
    public ComplexNumber() {
        this.rePart = 0;
        this.imPart = 0;
    }

    public ComplexNumber(int rePart, int imPart) {
        this.rePart = rePart;
        this.imPart = imPart;
    }
    
   public int getRe(){
       return this.rePart;
   }
   public int getIm(){
       return this.imPart;
   }

    // Method
    public void setRePart() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter real part: ");
        this.rePart = sn.nextInt();   
    }

    public void setImPart() {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter immagintion part: ");
        this.imPart = sn.nextInt();
    }

    
    public static ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart + b.rePart;
        int im = a.imPart + b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber substract(ComplexNumber a, ComplexNumber b) {
        int re = a.rePart - b.rePart;
        int im = a.imPart - b.imPart;
        ComplexNumber c = new ComplexNumber(re, im);
        return c;
    }

    public static ComplexNumber multipilcation(ComplexNumber a, ComplexNumber b) {
        int re = (a.rePart*b.rePart) - (a.imPart*b.imPart);
        int im = (a.rePart*b.imPart) + (a.imPart*b.rePart);
        ComplexNumber c = new ComplexNumber(re,im);
        return c;
    }

    /*
     * return -1 if a's abs is < b , 0 equal , 1 |a| > |b|
     */
    public static int compare(ComplexNumber a, ComplexNumber b) {
        double magA,magB;
        magA = a.magnitude();
        magB = b.magnitude();
        if(Math.abs(magA-magB) < 0.001 ) return 0; // equal;
        
        if(magA > magB) return 1;
        else return -1;
    }

    public double magnitude() {
        return Math.sqrt( Math.pow(rePart, 2) + Math.pow(imPart, 2));
    }

    @Override
    public String toString(){
        return this.rePart+"+"+this.imPart+"j";
    }
}

