package iopackage;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Experiment implements Serializable{
    private int data;
    public Experiment(int data)
    {
        this.data=data;
    }

    @Override
    public String toString() {
        return "Experiment{" + "data=" + data + '}';
    }
    
    public static void main (String args[]) throws FileNotFoundException, IOException{
        Experiment[] experiments=new Experiment[10];
        for(int i=0;i<=experiments.length-1;i++)
            experiments[i]=new Experiment(i);
        
        FileOutputStream out=new FileOutputStream("d:\\data.txt");
        ObjectOutputStream stream=new ObjectOutputStream(out);
        stream.writeObject(experiments);
        out.flush();
        out.close();
        
        
        
        
        
    }
    
    }
