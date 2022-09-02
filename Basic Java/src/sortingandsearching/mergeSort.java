/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingandsearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ramjee Bharti
 */
public class mergeSort {
    static String output="";
    public static  void main(String args[])
    {
    int a[]={9,8,7,6,5,4,3,2,1,0};
    katega(0,a.length-1,a);
        System.out.println(output);
    System.out.println(Arrays.toString(a)+" ---------");
    }
    static void katega(int l,int r,int a[])
    {
        //System.out.println(l + "," + r + "  " + Arrays.toString( Arrays.copyOfRange(a, l, r+1)));
    if(l>=r)
        return;
        int mid=(l+r)/2;
     output+=   Arrays.toString( Arrays.copyOfRange(a, l, mid+1))+ Arrays.toString( Arrays.copyOfRange(a, mid + 1, r+1))+ "\n";
        katega(l,mid,a);
        katega(mid+1,r,a);
       // System.out.println(l+" "+r);
        int arr[]=new int[r-l+1];
        int i=l,j=mid+1,k=0;
        while(i<=mid && j<=r)
        {
            if(a[i]<a[j])
                arr[k++]=a[i++];
            else
                arr[k++]=a[j++];
        }
        while(i<=mid)
        {
           
                arr[k++]=a[i++];
           
        }
        while(j<=r)
        {
            
                arr[k++]=a[j++];
        }
        
        int z=0;
        for(int p=l;p<=r;p++)
        { 
      a[p]=arr[z++];
        }
           
    }
    
    
}
