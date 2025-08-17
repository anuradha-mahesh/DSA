package RemoveDuplicates;



import java.util.HashSet;

public class RemoveDuplicatesBrute {

    // Brute Force approach: Use HashSet to store unique elements
    public static int removeDuplicates(int[] nums) {
        // Step 1: Store all unique elements in a HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Copy unique elements back into nums[]
        int index = 0;
        for (int val : set) {
            nums[index] = val;
            index++;
        }

        // Return count of unique elements
        return set.size();
    }

    public static void main(String[] args) {
        // Input array (doesn't need to be sorted in brute force)
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 4, 5};

        // Call the function
        int k = removeDuplicates(arr);

        // Print results
        System.out.println("Number of unique elements: " + k);
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
