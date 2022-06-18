package ifelse;

public class ThreeMax {

    public static void main(String[] args) {
        int a = 7, b = 5, c=9;
        System.out.println(a == b);//if else statement 
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        int max;
        if(a>=b && a>=c)
            max=a;
        else 
            if(b>=c)
            max=b;
        else
                max=c;
        System.out.println(max);
        
        
    }
}
