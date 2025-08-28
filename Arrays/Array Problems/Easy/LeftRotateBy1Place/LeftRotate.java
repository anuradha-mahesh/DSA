package LeftRotateBy1Place;


public class LeftRotate {
   

    // Function to left rotate the array by 1 place
    static void solve(int arr[], int n) {
        // Step 1: Store the first element in a temporary variable
        int temp = arr[0];  

        // Step 2: Shift all elements one position to the left
        // We go only till n-2 (i.e., index n-1 not included) because
        // arr[i] = arr[i+1] → at i = n-1, arr[i+1] would be out of bounds
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];  
        }

        // Step 3: Place the first element (stored in temp) at the end
        arr[n - 1] = temp;

        // Step 4: Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        
        solve(arr, n);  // Function call
    }
}


