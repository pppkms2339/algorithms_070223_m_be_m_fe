public class Main2 {

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println();
        printNaturalNumbers(1, 10);
        System.out.println();
        printNaturalNumbers2(1, 10);
    }

    private static void printNaturalNumbers(int lower, int upper) {
        if (lower > upper) {
            return;
        }
        System.out.println(lower);
        printNaturalNumbers(lower + 1, upper);
    }

    private static void printNaturalNumbers2(int lower, int upper) {
        if (lower <= upper) {
            System.out.println(lower);
            lower++;
            helper(lower, upper);
        } else {
            return;
        }
    }

    private static void helper(int lower, int upper) {
        if (lower <= upper) {
            System.out.println(lower);
            lower++;
            printNaturalNumbers2(lower, upper);
        } else {
            return;
        }
    }

    private static int fact(int k) {
        if (k == 1) {
            return 1;
        }
        return fact(k - 1) * k;
    }



}
