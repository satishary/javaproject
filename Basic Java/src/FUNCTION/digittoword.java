package FUNCTION;

public class digittoword {
// 88 Eighty Eight, 68 Sixty Eight 

    public static String unitsToWord(int n) {
        if (n == 0) {
            return "ZERO";
        }
        if (n == 1) {
            return "ONE";
        }
        if (n == 2) {
            return "TWO";
        }
        if (n == 3) {
            return "THREE";
        }
        if (n == 4) {
            return "FOUR";
        }
        if (n == 5) {
            return "FIVE";
        }
        if (n == 6) {
            return "six";
        }
        if (n == 7) {
            return "SEVEN";
        }
        if (n == 8) {
            return "EIGHT";
        }

        return "NINE";

    }

    public static String teensToWord(int n) {

        if (n == 11) {
            return "ELEVEN";
        } else if (n == 12) {
            return "TWELVE";
        } else if (n == 13) {
            return "THIRTYTEEN";
        } else if (n == 14) {
            return "FOURTEEN";
        } else if (n == 15) {
            return "FIFTEEN";
        } else if (n == 16) {
            return "SIXTEEN";
        } else if (n == 17) {
            return "SEVENTEEN";
        } else if (n == 18) {
            return "EIGHTEEN";
        }

        return "NINETEEN";

    }

    public static String tens(int n) {
        if (n == 10) {
            return "TEN";
        }
        if (n == 20) {
            return "TWENTY";
        }
        if (n == 30) {
            return "THIRTY";
        }
        if (n == 40) {
            return "FOURTY";
        }
        if (n == 50) {
            return "FIFTY";
        }
        if (n == 60) {
            return "SIXTY";
        }
        if (n == 70) {
            return "SEVENTY";
        }
        if (n == 80) {
            return "EIGHTY";
        }
        if (n == 88) {
            return "EIGHTY EIGHT";
        }

        return "NINETY";

    }

    public static String zeroToNinetyNine(int n) {
        if (n <= 9) {
            return unitsToWord(n);
        }
        if (n % 10 == 0) {
            return tens(n);
        }
        if (n >= 11 && n <= 19) {
            return teensToWord(n);
        }
        int ten = (n / 10) * 10;
        int digit = n % 10;
        return tens(ten) + " " + unitsToWord(digit);
    }
//10 ten,20 twenty, ...  90 nine

    public static String zeroTo999(int n) {
        if (n <= 99) {
            return zeroToNinetyNine(n);
        }
        //456 456/10 45.6, 456/100 4.56 
        // 4   56 
        //Four + Hundred + Fifty Six
        int hundred = n / 100;
        int rem = n % 100;
        if (rem == 0) {
            return zeroToNinetyNine(hundred) + " Hundred";
        }
        return zeroToNinetyNine(hundred) + " Hundred " + zeroToNinetyNine(rem);
    }
//9999

    public static String zeroTo9999(int n) {
        if (n <= 99) {
            return zeroToNinetyNine(n);
        }
        int Thousand = n / 1000;
        int rem = n % 1000;
        if (rem == 0) {
            return zeroTo999(Thousand) + "Thousand";
        }
        return zeroTo999(Thousand) + "Thousand" + zeroTo999(rem);

    }

    public static void main(String args[]) {
        int n = 9999;
        for (int i = 0; i <= n; i++) {
            String result = zeroTo9999(i);
            System.out.println(result);
        }

    }

}
