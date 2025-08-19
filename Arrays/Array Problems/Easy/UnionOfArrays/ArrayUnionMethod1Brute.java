package UnionOfArrays;

import java.util.*;

public class ArrayUnionMethod1Brute {
   

    // Function to find union of two sorted arrays
    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0;  // Pointers for arr1 and arr2
        ArrayList<Integer> union = new ArrayList<>();

        // Traverse both arrays
        while (i < n && j < m) {
            // Case 1: arr1[i] is smaller → add it
            if (arr1[i] < arr2[j]) {
                // Add if it's not duplicate of last inserted
                if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
            // Case 2: arr2[j] is smaller → add it
            else if (arr2[j] < arr1[i]) {
                if (union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
                    union.add(arr2[j]);
                }
                j++;
            }
            // Case 3: both are equal → add one of them
            else {
                if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
                j++;
            }
        }

        // If elements are left in arr1, add them
        while (i < n) {
            if (union.isEmpty() || union.get(union.size()-1) != arr1[i]) {
                union.add(arr1[i]);
            }
            i++;
        }

        // If elements are left in arr2, add them
        while (j < m) {
            if (union.isEmpty() || union.get(union.size()-1) != arr2[j]) {
                union.add(arr2[j]);
            }
            j++;
        }

        return union; // Final union
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};

        ArrayList<Integer> union = findUnion(arr1, arr2, arr1.length, arr2.length);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val : union) {
            System.out.print(val + " ");
        }
    }
}

