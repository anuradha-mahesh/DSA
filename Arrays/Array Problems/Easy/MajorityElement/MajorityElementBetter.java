package MajorityElement;
import java.util.HashMap;

public class MajorityElementBetter {
    
    public static int maj(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.get(num) > n / 2) {
                return num; // Majority element found
            }
        }
        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 2, 2, 4, 4, 4, 4, 4, 4, 4};
        System.out.println("Majority element is " + maj(arr));
    }
}


