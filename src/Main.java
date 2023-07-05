import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{3, 2, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 9, 9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1})));
    }

    private static int[] plusOne(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] != 9) {
                array[i]++;
                break;
            } else {
                array[i] = 0;
            }
        }
        if (array[0] == 0) {
            // В исходном числе были только девятки
            int[] arr = new int[array.length + 1];
            arr[0] = 1;
            return arr;
        }
        return array;
    }

}