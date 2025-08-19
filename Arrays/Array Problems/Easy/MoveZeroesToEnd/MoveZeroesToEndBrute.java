package MoveZeroesToEnd;

import java.util.*;
 
public class MoveZeroesToEndBrute {
    
    // 🔹 Your approach (temp array + no count)
    public static void removeZero(int[] arr) {
        int j = 0;                // pointer for non-zero elements
        int n = arr.length;
        int[] temp = new int[n];  // temporary array

        // Step 1: Copy all non-zero elements into temp
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill the rest with zeros
        for (int i = j; i < n; i++) {
            temp[i] = 0;
        }

        // Print result
        System.out.println("first Method: " + Arrays.toString(temp));
    }

    // using ArrayList
    public static int[] moveZeros(int n, int []a) {
        // temporary ArrayList:
        ArrayList<Integer> temp = new ArrayList<>();

        // Step 1: Copy non-zero elements into temp
        for (int i = 0; i < n; i++) {
            if (a[i] != 0)
                temp.add(a[i]);
        }

        // Step 2: Fill first nz positions with temp elements
        int nz = temp.size();
        for (int i = 0; i < nz; i++) {
            a[i] = temp.get(i);
        }

        // Step 3: Fill rest with 0
        for (int i = nz; i < n; i++) {
            a[i] = 0;
        }

        return a;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 0, 0, 0, 2, 3, 0, 4, 5};
        int arr2[] = {1, 0, 0, 0, 2, 3, 0, 4, 5};

        // Your version
        removeZero(arr1);

        // Striver’s version
        int[] ans = moveZeros(arr2.length, arr2);
        System.out.println("Second Method: " + Arrays.toString(ans));
    }
}


