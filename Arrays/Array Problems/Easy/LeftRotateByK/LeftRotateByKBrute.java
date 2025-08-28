package LeftRotateByK;


public class LeftRotateByKBrute {
  

    // Function to left rotate the array by k places
    static void solve(int arr[], int n, int k) {
        
        // Step 1: Handle cases where k >= n
        // Example: rotating [1,2,3,4,5] by k=7 is same as k=2 (7 % 5 = 2)
        k = k % n;

        // Step 2: Store first k elements in a temporary array
        int[] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }

        // Step 3: Shift remaining elements of arr[] to the left by k positions
        for (int i = 0; i < n - k; i++) {
            arr[i] = arr[i + k];
        }

        // Step 4: Copy back the k elements from temp[] to the end of arr[]
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }

        // Step 5: Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int k = 3; // Number of places to rotate
        int n = 5; // Size of array
        int arr[] = {1, 2, 3, 4, 5};
        
        solve(arr, n, k);  // Function call
    
} 
}
