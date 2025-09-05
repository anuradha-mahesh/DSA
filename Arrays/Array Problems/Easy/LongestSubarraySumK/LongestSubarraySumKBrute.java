package LongestSubarraySumK;

public class LongestSubarraySumKBrute {
     // Brute force: O(n^3) approach
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length;
        int len = 0; // stores max subarray length

        for (int i = 0; i < n; i++) {         // subarray start index
            for (int j = i; j < n; j++) {     // subarray end index
                long s = 0;                   // sum of a[i...j]
                for (int K = i; K <= j; K++) {
                    s += a[K];
                }

                if (s == k) {                 // check if target reached
                    len = Math.max(len, j - i + 1);
                }
            }
        }
        return len;
    }

   
}
