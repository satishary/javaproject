package basics;


public class ArraysSecondLargestno {
    public static void main(String args[]){
        int a[]={12,5,1,15,39,1};
        int max1=a[0],max2=a[1];
        if( max1<max2){
            max1=a[1];
            max2=a[0];
        }
        for(int i=2;i<=a.length-1;i++)
        {
           int value=a[i];
           if(value<=max2)
               continue;
           if(value>=max1)
           {
               max2=max1;
               max1=value;
               continue;
           }
           max2=value;
        }
        System.out.println(max1);
        System.out.println(max2);
    }
    
}
