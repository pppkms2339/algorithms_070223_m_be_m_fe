public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 9};
        int[] arr2 = {4, 7};
        System.out.println(findNumber(arr1, arr2, 3));
        System.out.println(binarySearchRec(arr1, 11));
    }

    private static int findNumber(int[] arr1, int[] arr2, int k) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        if (k < 0 || k >= len1 + len2) {
            System.out.println("Error");
            return -1;
        }
        int i = 0, j = 0;
        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                if (i + j == k) {
                    return arr1[i];
                } else {
                    i++;
                }
            } else {
                if (i + j == k) {
                    return arr2[j];
                } else {
                    j++;
                }
            }
        }
        while (i < len1) {
            if (i + j == k) {
                return arr1[i];
            } else {
                i++;
            }
        }
        while (j < len2) {
            if (i + j == k) {
                return arr2[j];
            } else {
                j++;
            }
        }
        return -1;
    }

    public static int binarySearchRec(int[] arr, int target) {
        return binarySearchRec(arr, target, 0, arr.length - 1);
    }

    private static int binarySearchRec(int[] arr, int target, int left, int right) {
        // Базовый случай (число не найдено)
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearchRec(arr, target, mid + 1, right);
        } else {
            return binarySearchRec(arr, target, left, mid - 1);
        }
    }
}