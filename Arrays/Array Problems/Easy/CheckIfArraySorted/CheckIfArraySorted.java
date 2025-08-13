package CheckIfArraySorted;

public class CheckIfArraySorted {
     public static void arraySorted(int[] arr) {
        int n = arr.length;
        boolean isSorted = true; // Assume sorted initially

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) { // If current is smaller than previous
                isSorted = false;
                break; // No need to check further
            }
        }

        if (isSorted) {
            System.out.println("sorted");
        } else {
            System.out.println("not sorted");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 102, 4, 5, 12, 1, 23, 98};
        arraySorted(arr);
    }
}
