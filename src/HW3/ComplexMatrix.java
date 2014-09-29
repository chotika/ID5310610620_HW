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
public class ComplexMatrix  {

    private int SIZE = 2; //default 
    private ComplexNumber[][] a = new ComplexNumber[SIZE][SIZE];

    public static ComplexMatrix mul(ComplexMatrix a, ComplexMatrix b) {
        return a.mul(b);
    }

    public ComplexMatrix(ComplexNumber[][] val) {
        SIZE = val.length;
        a = new ComplexNumber[SIZE][SIZE];
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                a[i][j] = new ComplexNumber(val[i][j].getRe(), val[i][j].getIm());
            }
        }
    }

    public ComplexMatrix() {
    }

    public ComplexMatrix(int size) {
        SIZE = size;
        a = new ComplexNumber[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                a[i][j] = new ComplexNumber();
            }
        }
    }

    public void setE(int i, int j, ComplexNumber val) {
        a[i][j] = val;
    }

    public ComplexNumber getE(int i, int j) {
        return a[i][j];
    }

    public void scanInput() {
        System.out.println("Enter Element");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j].setRePart();
                a[i][j].setImPart();
            }
        }
    }

    public ComplexMatrix add(ComplexMatrix b) {

        ComplexNumber[][] temp = new ComplexNumber[SIZE][SIZE];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = ComplexNumber.add(a[i][j], b.getE(i, j));
            }
        }
        return new ComplexMatrix(temp);
    }

    private ComplexNumber vmul(int i, int j, ComplexMatrix b) {
        ComplexNumber sum = new ComplexNumber();
        for (int x = 0; x < a.length; x++) {
            sum = ComplexNumber.add(sum, ComplexNumber.multipilcation(this.getE(i, x), b.getE(x, j)));
        }
        return sum;
    }

    public ComplexMatrix mul(ComplexMatrix b) {
        ComplexNumber[][] temp = new ComplexNumber[SIZE][SIZE];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = vmul(i, j, b);
            }
        }
        return new ComplexMatrix(temp);

    }

    public void printMatrix() {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
