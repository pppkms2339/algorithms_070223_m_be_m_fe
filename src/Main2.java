public class Main2 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(sumArray(array, array.length - 1));
    }

    private static int sumArray(int[] array, int i) {
        // Базовый случай
        if (i == 0) {
            return array[0];
        }
        return sumArray(array, i - 1) + array[i];
    }

}
