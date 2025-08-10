import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};

        System.out.println("Before sorting: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("After sorting:  " + Arrays.toString(arr));
    }
}
