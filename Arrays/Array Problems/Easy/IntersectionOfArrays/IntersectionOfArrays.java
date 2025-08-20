package IntersectionOfArrays;

import java.util.*;
 
public class IntersectionOfArrays {
   


    public static ArrayList<Integer> findArrayIntersection(int[] A, int n, int[] B, int m) {
        int i = 0, j = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        while (i < n && j < m) {
            if (A[i] < B[j]) {
                i++;
            } 
            else if (B[j] < A[i]) {
                j++;
            } 
            else { // A[i] == B[j]
                ans.add(A[i]);
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 3, 5};

        ArrayList<Integer> result = findArrayIntersection(arr1, arr1.length, arr2, arr2.length);
        System.out.println(result); // Output: [2, 2, 3]
    }
}


