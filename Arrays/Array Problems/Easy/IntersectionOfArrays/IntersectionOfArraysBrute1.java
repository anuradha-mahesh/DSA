package IntersectionOfArrays;

import java.util.ArrayList;

public class IntersectionOfArraysBrute1 {
    public static ArrayList<Integer> intersection(int[] A, int[] B) {
    int m = A.length;
    int n = B.length;

    ArrayList<Integer> ans = new ArrayList<>();
    int i = 0, j = 0;

    while (i < m && j < n) {
        if (A[i] < B[j]) {
            i++;
        } else if (A[i] > B[j]) {
            j++;
        } else { // A[i] == B[j]
            if (ans.isEmpty() || ans.get(ans.size()-1) != A[i]) {
                ans.add(A[i]); // avoid duplicates
            }
            i++;
            j++;
        }
    }
    return ans;
}
public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 10};
        int arr1[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(intersection(arr, arr1));
    }

}
