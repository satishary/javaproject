
package FUNCTION;


public class FUNCTIONALL {
    static void satish()   //void function returns nothing 
    {
    System.out.println("My name is satish");
    }
    public static void main(String[] args) {  //main function
        satish();
        satish();
        max(140,81);
        //String y=home();
        //System.out.println(y);
        home();
    }
    static void max(int a,int b)  //returns nothing
    {
    if(a>b)
       System.out.println(a+" is greater "+b+" is chota");
    else
        System.out.println(b);
    }
    static String home()   //function returns string
    {
    return "Satish Bhaiya 67";
    }
}
