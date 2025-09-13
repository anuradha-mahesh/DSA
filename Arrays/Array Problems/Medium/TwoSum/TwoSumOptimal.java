package TwoSum;

/*
 Limitations of Two Pointers Approach:

1. Works only for SORTED arrays:
   - If the array is unsorted, the two-pointer logic fails because moving pointers assumes increasing/decreasing values.

2. Cannot directly return ORIGINAL indices:
   - Sorting changes the positions of elements.
 - If you need original indices, you must store element-index pairs before sorting, or use a HashMap approach instead.

Best use case:
- You only need to check if a pair exists in a sorted array or want the pair values themselves (not original indices).
*/
import java.util.Arrays;

public class TwoSumOptimal {

    public static void twoSum(int[] arr, int target) {
        int n = arr.length;
        Arrays.sort(arr);  // Sort the array in ascending order

        int left = 0, right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Yes");
                return;
            } else if (sum < target) {
                left++;   // Need a bigger sum
            } else {      // sum > target
                right--;  // Need a smaller sum
            }
        }

        System.out.println("No");
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        twoSum(arr, 11);
    }
}
 
