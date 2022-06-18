package FUNCTION;

public class functionmssage {

    public static void printHello(int n, String massage) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(massage);
        }
    }
    
public static void main(String args[]){

        printHello(5, "HEllo");
        printHello(10, "HEYY");
        printHello(4, "BYE");
    }
}