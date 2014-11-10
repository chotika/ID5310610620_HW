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
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author MY-SNSD
 */
public class Student {

    private int stId;

    public int getId() {
        return this.stId;
    }

    public boolean setIdNum(int id) {
        this.stId = id;
        return true;
    }

    public static void main(String args[]) {

        String path = "C:\\Users\\MY-SNSD\\Documents\\NetBeansProjects\\ID5310610620_HW-master\\src\\HW5\\filedata_1.txt";
        File file = new File(path);
        ArrayList<String> StudentList = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String a;

            while ((line = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(line);
                while (st.hasMoreTokens()) {
                    
                    a = st.nextToken();
                    StudentList.add(a);
                    Student temp = new Student();
                    int b = Integer.parseInt(a);
                    temp.setIdNum(b);
                    
                    
                }

            }
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
