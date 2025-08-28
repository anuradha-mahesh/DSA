package LeftRotateByK;


public class LeftRotateByK {
 



    // Utility function to reverse part of the array
    static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateByK(int arr[], int n, int k) {
        // Step 1: Normalize k (in case k > n)
        k = k % n;

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        // Step 4: Reverse whole array
        reverse(arr, 0, n - 1);

        // Print rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int k = 2;
        int arr[] = {1, 2, 3, 4, 5};

        rotateByK(arr, n, k); // Expected Output: 3 4 5 1 2
    }
}


