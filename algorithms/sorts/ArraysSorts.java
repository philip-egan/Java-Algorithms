package algorithms.sorts;

public class ArraysSorts {

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            for (int j = i; j > 0; j--) {
                if (temp > array[j - 1]) {
                    break;
                } else {
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    private ArraysSorts() {
    }
}