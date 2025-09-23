package MaxSubarraySum;

  import java.util.*;

public class MaxSubarraySumBrute {
   
    public static int maxSubarraySum(int[] arr) {
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; 

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String args[]) {
        int[] arr = {2, 2, 1, -1, -1, -2, 2, 2};
        int ans = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + ans);
    }
}


