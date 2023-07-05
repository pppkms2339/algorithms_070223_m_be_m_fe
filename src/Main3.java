import java.util.Arrays;

public class Main3 {

    public static void main(String[] args) {
        int[] array = {7, -2, 4, 1, 6, 5, 0, 6, 2};
        quickSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int lower, int upper) {
        if (lower >= upper) {
            return;
        }
        int pivot = helperPivot(array, lower, upper);
        quickSort(array, lower, pivot - 1);
        quickSort(array, pivot + 1, upper);
    }

    /**
     * Метод, который находит опорный элемент и изменяет массив таким
     * образом, чтобы меньшие опорного элементы находились левее опорного,
     * а большие - правее
     * @param array исходный массив
     * @param lower нижний индекс диапазона
     * @param upper верхний индекс диапазона
     * @return индекс опорного элемента
     */
    private static int helperPivot(int[] array, int lower, int upper) {
        int middle = (lower + upper) / 2;
        int middleValue = array[middle];
        int i = lower, j = upper;
        while (i < j) {
            while (array[i] < middleValue) {
                i++;
            }
            while (array[j] > middleValue) {
                j--;
            }
            // Элемент array[i] точно больше опорного,
            // а элемент array[j] точно меньше опорного - меняем их местами
            if (i < j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (array[i] == middleValue) {
            return i;
        }
        return j;
    }

    // TODO Проверить!!!
    private static int helperPivot2(int[] array, int lower, int upper) {
        int middle = (lower + upper) / 2;
        int middleValue = array[middle];
        int i = lower, j;
        for (j = i; j < upper - 1; j++) {
            if (array[j] > middleValue) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        return i;
    }

}
