package TwoSum;

 import java.util.Arrays;
import java.util.HashMap;

public class TwoSumBetter {
  public static int[] twoSum(int[] arr, int target) {
    int n = arr.length;
    int[] ans = new int[2];
        
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
          int moreNeeded = target -  arr[i];
          if (mpp.containsKey(moreNeeded)) {
            ans[0] = mpp.get(moreNeeded);
            ans[1] = i;
            return ans;
          }

          // Add current number to map
          if (!mpp.containsKey(arr[i])) {
            mpp.put(arr[i], i);
          }
        }
        return ans;
  }
  
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6 };
    int[] ans = twoSum(arr, 11);
   System.out.println(Arrays.toString(ans));
  }
}


