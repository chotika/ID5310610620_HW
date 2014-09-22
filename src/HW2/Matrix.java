/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW2;

/**
 *
 * @author MY-SNSD
 */
public class Matrix {

    private double[][] elts;
    private int rows, columns;

    //constructor
    public Matrix(int r, int c) {
        rows = r;
        columns = c;
        if (rows > 0 && columns > 0) {
            elts = new double[rows][columns];
        } else {
            fatalError("Constructor" + r + "," + c);
        }
    }

    /* get number row in matrix*/
    public int getRows() {
        return rows;
    }

    /* get number column in matrix*/
    public int getCols() {
        return columns;
    }

    /* get an element of the matrix*/
    public double getElt(int r, int c) {
        r = checkRowIndex(r);
        c = checkColumnIndex(c);
        return elts[r][c];
    }

    /* set an element of the matrix*/
    public Matrix setElt(int r, int c, double val) {
        r = checkRowIndex(r);
        c = checkColumnIndex(c);
        elts[r][c] = val;
        return this;
    }

    /* add method and return a new result matrix*/
    public Matrix add(Matrix b) {
        checkSize(b);
        Matrix res = new Matrix(rows, columns);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                res.elts[r][c] = elts[r][c] + b.elts[r][c];
            }
        }
        return res;
    }

    /* sub method and return a new result matrix*/
    public Matrix sub(Matrix b) {
        checkSize(b);
        Matrix res = new Matrix(rows, columns);
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                res.elts[r][c] = elts[r][c] - b.elts[r][c];
            }
        }
        return res;
    }

    /* toString method and generate a string object by a matrix
     * and return a new result matrix
     */
    @Override
    public String toString() {
        StringBuilder buf = new StringBuilder(80);
        for (int r = 0; r < rows; r++) {
            buf.append((r == 0 ? "[" : ","));
            for (int c = 0; c < columns; c++) {
                buf.append((c == 0 ? "[" : ","));
                buf.append(elts[r][c]);
            }
            buf.append("]");
        }
        buf.append("]");
        return buf.toString();
    }

    /* mul method and return a new result matrix*/
    public Matrix mul(Matrix b) {
        if (columns != b.rows) {
            fatalError("Matrices do not conform");
        }

        Matrix res = new Matrix(rows, b.columns);

        for (int r = 0; r < res.rows; r++) {
            for (int c = 0; c < columns; c++) {
                double acc = 0.0;
                for (int i = 0; i < columns; i++) {
                    acc += elts[r][i] * b.elts[i][c];
                }
                res.elts[r][c] = acc;
            }
        }
        return res;
    }

    // fatalError prints an error message
    private void fatalError(String errorMessage) {
        System.err.println("Matrix: fatal error" + errorMessage);
        System.exit(0);
    }

    //check size matrix
    private void checkSize(Matrix b) {
        if (rows != b.rows || columns != b.columns) {
            fatalError("Add/Sub : size mismatch");
        }
    }

    //check row matrix
    private int checkRowIndex(int r) {
        if (r < 1 || r > rows) {
            fatalError("Rows index" + r + "out of range");
        }
        return r - 1;
    }

    //check column matrix
    private int checkColumnIndex(int c) {
        if (c > 1 || c > columns) {
            fatalError("Column index" + c + "out of range");
        }
        return c - 1;
    }
}
