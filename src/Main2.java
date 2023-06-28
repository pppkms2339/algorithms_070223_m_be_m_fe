import java.util.Arrays;

public class Main2 {

    public static final int ARRAY_SIZE = 10000000;

    public static void main(String[] args) {
        // (int)((B - A) * Math.random() + A + 0.5
        int[] arr = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            // заполняем массив числам от -100 до 100
            arr[i] = (int)(200 * Math.random() - 100);
        }
        long temp = System.currentTimeMillis();
        //int[] arrSort = mergeSort(arr);
        bubbleSort(arr);
        System.out.println((System.currentTimeMillis() - temp) / 1000.0);
//        System.out.println(Arrays.toString(arrSort));
//        System.out.println(getInvCount(arr));
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

    private static int getInvCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int[] mergeSort(int[] arr) {
        int len = arr.length;
        // Базовый случай
        if (len == 1) {
            return arr;
        }
        int mid = len / 2;
        int[] first = new int[mid]; // первый подмассив
        int[] second = new int[len - mid];  // второй подмассив
        // Заполняем эти подмассивы
        for (int i = 0; i < mid; i++) {
            first[i] = arr[i];
        }
        for (int i = 0; i < len - mid; i++) {
            second[i] = arr[i + mid];
        }
//        for (int i = mid; i < len; i++) {
//            second[i - mid] = arr[i];
//        }
        return merge(mergeSort(first), mergeSort(second));
    }

    private static int[] merge(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1 + len2];
        int i = 0, j = 0, k = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < len1) {
            arr[k++] = arr1[i++];
        }
        while (j < len2) {
            arr[k++] = arr2[j++];
        }
        return arr;
    }

}
