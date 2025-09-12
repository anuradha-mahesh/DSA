import java.util.*;

public class ArrayUnionMethod1Brute {


    // Function to find union of two arrays (Naive Method)
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        ArrayList<Integer> union = new ArrayList<>();

        // Add elements of arr1
        for (int i = 0; i < n; i++) {
            if (!union.contains(arr1[i])) { // check if already present
                union.add(arr1[i]);
            }
        }

        // Add elements of arr2
        for (int j = 0; j < m; j++) {
            if (!union.contains(arr2[j])) { // check if already present
                union.add(arr2[j]);
            }
        }

        // Sort the result since arrays are sorted
        Collections.sort(union);

        return union;
    }

    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);

        System.out.println("Union of arr1 and arr2 is:");
        for (int val : Union) {
            System.out.print(val + " ");
        }
    }
}


