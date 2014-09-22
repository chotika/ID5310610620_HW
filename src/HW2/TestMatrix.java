/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

/**
 *
 * @author MY-SNSD
 */
public class TestMatrix {

    public static void main(String[] args) {
        int r, c;
        Matrix a = new Matrix(3, 2);
        Matrix b = new Matrix(3, 2);
        
        System.out.println("a=" + a);
        System.out.println("a has" + a.getRows() + "row and" + a.getCols() + "columns.");
        
        System.out.println("b=" + b);
        System.out.println("b has" + b.getRows() + "row and" + b.getCols() + "columns.");
        
        for (r = 1; r <= a.getRows(); r++) {
            for (c = 1; c <= a.getCols(); c++) {
                a.setElt(r, c, (double) (r * c));
                b.setElt(r, c, (double) (r + c));
            }
        }
        
        System.out.println("a is now :" + a);
        System.out.println("b is now :" + b);
        
        System.out.println("Accessing elements of a&b");
        for (r = 1; r <= a.getRows(); r++) {
            for (c = 1; c <= a.getCols(); c++) {
                System.out.println("a(" + r + "," + c + ")= " + a.getElt(r, c) + " ");
                System.out.println("b(" + r + "," + c + ")= " + b.getElt(r, c) + " ");
            }
        }
        System.out.println("a-b=" + a.sub(b));
        System.out.println("a+b=" + a.add(b));
        
        Matrix x = new Matrix(3, 4);
        for (r = 1; r <= x.getRows(); r++) {
            for (c = 1; c <= x.getCols(); c++) {
                x.setElt(r, c, (double) (r * c));
            }
        }
        
        System.out.println("a=" + a);
        System.out.println("x=" + x);
        System.out.println("a*x=" + a.mul(x));
        System.out.println("x*a=" + x.mul(a));
    }
}
