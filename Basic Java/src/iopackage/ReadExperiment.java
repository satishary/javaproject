/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iopackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadExperiment {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fin=new FileInputStream("d:\\data.txt");
        ObjectInputStream in =new ObjectInputStream(fin);
        Experiment[] experiments=(Experiment[])in.readObject();
        System.out.println(Arrays.toString(experiments));
        
        
    }
}
