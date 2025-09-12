import java.util.Arrays;

public class MoveZeroesToEnd {




    // Approach 1: Overwrite (write pointer)
    public static void removeZeroOverwrite(int[] arr) {
        int j = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        for (int i = j; i < n; i++) {
            arr[i] = 0;
        }

        System.out.println("Overwrite approach: " + Arrays.toString(arr));
    }

    // Approach 2: Swap-based two-pointer
    public static void removeZeroSwap(int[] arr) {
        int j = 0; // pointer to first zero

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != j) { // swap only if i and j are different
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }

        System.out.println("Swap-based approach: " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 0, 0, 0, 2, 3, 0, 0, 0, 4, 0, 5, 0, 0, 0};
        int[] arr2 = arr1.clone(); // copy for second approach

        removeZeroOverwrite(arr1);
        removeZeroSwap(arr2);
    }
}

