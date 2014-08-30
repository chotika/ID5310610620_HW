/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author MY-SNSD
 */
public class TaxRate {

    public static void main(String[] args) {
        int Income, TotalTax;
        String income = "";
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your incomes(*annual incomes*)");
        try {
            income = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!!");
        }
        Income = Integer.parseInt(income);
        System.out.println(+Income);
        
        
        if (Income <= 150000) {
            System.out.println("You not have to pay taxes");
        } else {
            if (Income <= 300000) {
                TotalTax = (Income - 150000) * 5 / 100;
                System.out.println("Total Tax :" + TotalTax + " Bath ");
            } else {
                if (Income <= 500000) {
                    TotalTax = 7500 + ((Income - 300000) * 10 / 100);
                    System.out.println("Total Tax :" + TotalTax + " Bath ");
                } else {
                    if (Income <= 750000) {
                        TotalTax = 27500 + ((Income - 500000) * 15 / 100);
                        System.out.println("Total Tax :" + TotalTax + " Bath ");
                    } else {
                        if (Income > 750000) {
                            TotalTax = 65000 + ((Income - 750000) * 20 / 100);
                            System.out.println("Total Tax :" + TotalTax + " Bath ");
                        }

                    }
                }
            }
        }
    }
}