package MaxSubarraySum;

public class MaxSubarraySumWithArr {
   
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum so far
        long sum = 0;               // current subarray sum

        int start = 0;   // temporary start index
        int ansStart = -1, ansEnd = -1; // final subarray indices

        for (int i = 0; i < n; i++) {
            if (sum == 0) {
                start = i; // potential start of a new subarray
            }

            sum += arr[i]; // add current element

            if (sum > maxi) {
                maxi = sum;
                ansStart = start;
                ansEnd = i;
            }

            // If sum becomes negative, reset it
            if (sum < 0) {
                sum = 0;
            }
        }

        // Printing the subarray that gives max sum
        System.out.print("The maximum subarray is: [ ");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("]");

        return maxi;
    }

    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int n = arr.length;
        long maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}


