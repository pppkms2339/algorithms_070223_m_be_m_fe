public class Main {
    public static void main(String[] args) {
        move(2, 1, 2, 3);
    }

    private static void move(int n, int source, int destination, int helper) {
        if (n == 0) {
            return;
        }
        move(n - 1, source, helper, destination);
        System.out.println(source + "->" + destination);
        move(n - 1, helper, destination, source);
    }

    private static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        return fact(n - 1) * n;
    }
}