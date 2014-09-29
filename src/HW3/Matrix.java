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
public class Matrix {

    private int SIZE = 2; //default 
    private int[][] a = new int[SIZE][SIZE];

    public static Matrix mul(Matrix a, Matrix b) {
        return a.mul(b);
    }

    public Matrix(int[][] val) {
        SIZE = val.length;
        a = new int[SIZE][SIZE];
        for (int i = 0; i < val.length; i++) {
            for (int j = 0; j < val.length; j++) {
                a[i][j] = val[i][j];
            }
        }
    }

    public Matrix() {
    }

    public Matrix(int size) {
        SIZE = size;
        a = new int[SIZE][SIZE];
    }

    public void setE(int i, int j, int val) {
        a[i][j] = val;
    }

    public int getE(int i, int j) {
        return a[i][j];
    }

    public void scanInput() {
        System.out.println("Enter Element");
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = s.nextInt();
            }
        }
    }

    public Matrix add(Matrix b) {

        int[][] temp = new int[SIZE][SIZE];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = a[i][j] + b.getE(i, j);
            }
        }
        return new Matrix(temp);
    }

    private int vmul(int i, int j, Matrix b) {
        int sum = 0;
        for (int x = 0; x < a.length; x++) {
            sum += this.getE(i, x) * b.getE(x, j);
        }
        return sum;
    }

    public Matrix mul(Matrix b) {
        int[][] temp = new int[SIZE][SIZE];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                temp[i][j] = vmul(i, j, b);
            }
        }
        return new Matrix(temp);

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
