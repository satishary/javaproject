package switchjava;

public class SwitchDemo {

    public static void main(String[] args) {
        int n = 1;
        switch (n) {
            case 1:
                System.out.println("Sun");

            case 2:
                System.out.println("Mon");
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
            case 5:
                System.out.println("Thu");
            case 6:
                System.out.println("Fri");
            case 7:
                System.out.println("Sat");
            default:
                System.out.println("Invalid");
        }
    }
}
