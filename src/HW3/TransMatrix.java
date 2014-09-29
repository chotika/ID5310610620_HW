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
public class TransMatrix extends Matrix {

    

    public  void transpose(){
      int m, n, c, d;
 
      Scanner in = new Scanner(System.in);
     
      m = in.nextInt();
      n = in.nextInt();
 
      int matrix[][] = new int[m][n];
 
      
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            matrix[c][d] = in.nextInt();
 
      int transpose[][] = new int[n][m];
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )               
            transpose[d][c] = matrix[c][d];
      }
 
     
 
      for ( c = 0 ; c < n ; c++ )
      {
         for ( d = 0 ; d < m ; d++ )
               System.out.print(transpose[c][d]+"\t");
 
         System.out.print("\n");
      }
   }
}
