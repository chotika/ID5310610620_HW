/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW3;

/**
 *
 * @author MY-SNSD
 */
public class BinaryMatrix extends TransMatrix {

    int[][] m;
    int size;

    

    void binary() {
        int i, j;
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (m[i][j] > 0) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }
            }
        }
    }
}
