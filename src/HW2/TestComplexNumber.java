/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

/**
 *
 * @author MY-SNSD
 */
public class TestComplexNumber {
  /** The program */
  public static void main(String[] args) {
    ComplexNumber c = new ComplexNumber(3 ,  5);
    ComplexNumber d = new ComplexNumber(2);
    System.out.println(c);
    System.out.println(c + ".getReal() = " + c.getReal());
    System.out.println(d + ".getImaginary() = " + d.getImag());
    System.out.println(d + ".magnitude() =" + d.magnitude());
    System.out.println(c + " + " + d + " = " + c.add(d));
    System.out.println(c + " + " + d + " = " + c.subtract(d));
    System.out.println(c + " + " + d + " = " + ComplexNumber.add(c, d));
    System.out.println(c + " * " + d + " = " + c.multiply(d));
    System.out.println(c + " == "+ d + " = " + c.equals(d));
  }
}
