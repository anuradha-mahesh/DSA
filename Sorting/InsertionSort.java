public class InsertionSort {

    // Method to perform insertion sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Start from the second element (index 1), because the first element is considered sorted
        for (int i = 1; i < n; i++) {
            int key = arr[i];      // Pick the current element to be placed correctly
            int j = i - 1;         // Start comparing from the element just before the current one

            // Shift elements of the sorted part (left side) that are greater than key
            // Move them one position to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];   // Shift element to the right
                j--;                   // Move to the previous element on the left
            }

            // Place the key at its correct position
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        // Sample array to be sorted
        int[] arr = {5, 3, 1, 4, 2};

        // Call insertion sort
        insertionSort(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
