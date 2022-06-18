package FUNCTION;

public class newfuntction {

    public static String word(int n) {
        if (n == 10) {
            return "ten";
        }
        if (n == 11) {
            return "eleven";
        }
        if (n == 12) {
            return " thirteen";
        }
        if (n == 13) {
            return "fourteen";
        }
        if (n == 14) {
            return "fifteen";
        }
        return "twenty";
    }

    public static void main(String[] args) {
        String result = word(20);
        System.out.println(result);
    }
}
