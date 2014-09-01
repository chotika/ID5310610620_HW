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
        int Income, TotalTax ,intMaxTaxRate;
        int [] intIncomeRange;
        intIncomeRange = new int[4];
        int [] intTaxRate ;
        intTaxRate = new int[4];
        
        String income = "";
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter income and  tax rate  in tax bracket 1: 150000     0");
        System.out.println("Please enter income and  tax rate  in tax bracket 2: 300000     5");
        System.out.println("Please enter income and  tax rate  in tax bracket 3: 500000     10");
        System.out.println("Please enter income and  tax rate  in tax bracket 4: 150000     15");
        System.out.println("Please enter tax rate if income >750000 : 20");
        System.out.println("Please enter your income " + ":");
        try {
            income = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Error!!");
        }
        Income = Integer.parseInt(income);
        //System.out.println(+Income);
     
        if (Income <= 150000) {
            intIncomeRange[0] = 150000;
            System.out.println("0 - 150000 you pay 0 baht");
            System.out.println("You not have to pay taxes");
        } else {
            if (Income <= 300000) {
                intIncomeRange[1] = 200000;
                intTaxRate[0] = 5/100 ;
                TotalTax = (Income - 150000) * intTaxRate[0];
                System.out.println("0 - 150000 you pay 0 baht");
                System.out.println("150001 – 300000 you pay 150000 x 0.05 = 7500 baht");
                System.out.println("Total Tax :" + TotalTax + " Bath ");
            } else {
                if (Income <= 500000) {
                    intIncomeRange[2] = 250000;
                    intTaxRate[1] = 10/100 ;
                    TotalTax = 7500 + ((Income - 300000) * intTaxRate[1]);
                    System.out.println("0 - 150000 you pay 0 baht");
                    System.out.println("150001 – 300000 you pay 150000 x 0.05 = 7500 baht");
                    System.out.println("300001 – 500000 you pay 200000 x 0.10 = 20000 baht");
                    System.out.println("Total Tax :" + TotalTax + " Bath ");
                } else {
                    if (Income <= 750000) {
                        intIncomeRange[3] = 250000;
                        intTaxRate[2] = 15/100 ;
                        TotalTax = 27500 + ((Income - 500000) * intTaxRate[2]);
                        System.out.println("0 - 150000 you pay 0 baht");
                        System.out.println("150001 – 300000 you pay 150000 x 0.05 = 7500 baht");
                        System.out.println("300001 – 500000 you pay 200000 x 0.10 = 20000 baht");
                        System.out.println("500001 – 750000 you pay 250000 x 0.15 = 37500 baht");
                        System.out.println("Total Tax :" + TotalTax + " Bath ");
                    } else {
                        if (Income > 750000) {
                            intTaxRate[3]= 20/100;
                            intMaxTaxRate = 65000 + ((Income - 750000) * 20 / 100);
                            System.out.println("0 - 150000 you pay 0 baht");
                            System.out.println("150001 – 300000 you pay 150000 x 0.05 = 7500 baht");
                            System.out.println("300001 – 500000 you pay 200000 x 0.10 = 20000 baht");
                            System.out.println("500001 – 750000 you pay 250000 x 0.15 = 37500 baht");
                            System.out.println("750001 – 100000 you pay 250000 x 0.20 = 50000 baht");
                            System.out.println("Total Tax :" + intMaxTaxRate + " Bath ");
                        }

                    }
                }
            }
        }
    }
}