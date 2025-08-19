package UnionOfArrays;

import java.util.*;
 
public class ArrayUnionMethod2Brute {
  

    
    // Function to find union of two arrays
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        // TreeSet stores unique elements in sorted order
        TreeSet<Integer> set = new TreeSet<>();
        
        // Add all elements of arr1
        for (int i = 0; i < n; i++)
            set.add(arr1[i]);
        
        // Add all elements of arr2
        for (int i = 0; i < m; i++)
            set.add(arr2[i]);
        
        // Convert TreeSet to ArrayList
        ArrayList<Integer> Union = new ArrayList<>(set);
        
        return Union;
    }
    
    public static void main(String args[]) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;
        
        ArrayList<Integer> Union = FindUnion(arr1, arr2, n, m);
        
        System.out.println("Union of arr1 and arr2 is:");
        for (int val : Union)
            System.out.print(val + " ");
    }
}


