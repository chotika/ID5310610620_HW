/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

/**
 *
 * @author MY-SNSD
 */
public class ComplexNumber {
    /*the real_part and imaginary_part*/

    final private double r, i;

    /* Construct a Complex */
    public ComplexNumber(double real_part, double imaginary_part) {
        r = real_part;
        i = imaginary_part;
    }

    /* Construct a Complex */
    public ComplexNumber(double real_part) {
        r = real_part;
        i = 0;
    }

    /* Return just the Real part */
    public double getReal() {
        return r;
    }

    /* Return just the Real part */
    public double getImag() {
        return i;
    }
    /* Return the magnitude of a complex number */

    public double magnitude() {
        return Math.sqrt(r * r + i * i);
    }

    /*add one complex */
    public ComplexNumber add(ComplexNumber other) {
        return add(this, other);
    }

    /*add two complexes*/
    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.r + c2.r, c1.i + c2.i);
    }

    /*subtract one complex */
    public ComplexNumber subtract(ComplexNumber other) {
        return subtract(this, other);
    }

    /*subtract two complexes*/
    public static ComplexNumber subtract(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.r - c2.r, c1.i - c2.i);
    }

    /* Multiply this Complex times another one*/
    public ComplexNumber multiply(ComplexNumber other) {
        return multiply(this, other);
    }

    /* Multiply two Complexes */
    public static ComplexNumber multiply(ComplexNumber c1, ComplexNumber c2) {
        return new ComplexNumber(c1.r * c2.r - c1.i * c2.i, c1.r * c2.i + c1.i * c2.r);
    }

    /* Compare this Complex number with another*/
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ComplexNumber)) {
            throw new IllegalArgumentException(
                    "Complex.equals argument must be a Complex");
        }
        ComplexNumber other = (ComplexNumber) o;
        return r == other.r && i == other.i;
    }

    /* Generate a hashCode; not sure how well distributed these are.*/
    @Override
    public int hashCode() {
        return (int) (r) | (int) i;
    }
}
