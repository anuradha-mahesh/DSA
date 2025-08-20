package IntersectionOfArrays;

import java.util.*;

public class IntersectionOfArraysBrute2 {
    public static ArrayList<Integer> findArrayIntersection(int[] A, int n, int[] B, int m) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] vis = new int[m];  // visited array for B

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (A[i] == B[j] && vis[j] == 0) {
                    ans.add(A[i]);
                    vis[j] = 1; // mark visited
                    break;
                }
                if (B[j] > A[i]) break; // optimization since arrays are sorted
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 4};
        int arr2[] = {2, 2, 3, 5};

        ArrayList<Integer> result = findArrayIntersection(arr1, arr1.length, arr2, arr2.length);
        System.out.println(result); // [2, 2, 3]
    }
}
