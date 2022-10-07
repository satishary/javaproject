package opps2;

public class Currency {

    int paise;

    public Currency(int r, int p) {
        paise = 100 * r + p;

    }

    public String toString() {
        int r = paise / 100;
        int p = paise % 100;
        return String.format("₹ %s.%s", r, p);
        //return "dsfg";
    }

    public static void main(String args[]) {
        Currency c1 = new Currency(2, 254);
        System.out.println(c1);
        Currency c2 = new Currency(12, 126);
        System.out.println(c2);
    }

}
