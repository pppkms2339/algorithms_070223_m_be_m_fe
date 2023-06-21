public class Main3 {

    public static void main(String[] args) {
        int[] array = {1, 1, 2, 3, 4, 10};
        System.out.println(binarySearch(array, -10, 0, array.length - 1));
    }

    // Находим индекс искомого элемента (итеративно)
    private static int binarySearch(int[] array, int key, int low, int high) {
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] < key) {
                low = mid + 1;
            } else if (array[mid] > key) {
                high = mid - 1;
            } else {
                index = mid;
                break;
            }
        }
        return index;
    }

}
