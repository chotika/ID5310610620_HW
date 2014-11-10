/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HW5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 *
 * @author MY-SNSD
 */
public class ReadFile {

    public static void main(String[] args) {


        String path = "C:\\Users\\MY-SNSD\\Documents\\NetBeansProjects\\ID5310610620_HW-master\\src\\HW5\\filedata.txt";
        File file = new File(path);
        ArrayList<String> myArr = new ArrayList<String>();

        try {

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String a;


            while ((line = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    a = st.nextToken();
                    myArr.add(a); 
                }
     
            }
            Set<String> uniqueSet = new HashSet<String>(myArr);
                for (String temp : uniqueSet) {
                    System.out.println(temp + " :" + Collections.frequency(myArr, temp));
                }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
