package FindSingle;

import java.util.HashMap;
import java.util.Map;

public class FindSingleBetter2 {
    
    public static int findSingleBetter2(int[] arr) {
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int value = mpp.getOrDefault(arr[i], 0);
            mpp.put(arr[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
    
     public static void main(String args[]) {
        int[] arr = {4, 1, 2, 1, 2};
        int ans =  findSingleBetter2(arr);
        System.out.println("The single element is: " + ans);

    }
}
