
public class RemoveDuplicates {
   

    // Function to remove duplicates from a sorted array
    public static int removeDuplicates(int[] nums) {
        // Edge case: if array is empty
        if (nums.length == 0) return 0;

        // i is the slow pointer (tracks unique position)
        int i = 0;

        // j is the fast pointer (scans the array)
        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique element
            if (nums[i] != nums[j]) {
                i++;             // move slow pointer
                nums[i] = nums[j]; // update with unique element
            }
        }
        
        // (i + 1) gives the count of unique elements
        return i + 1;
    }

    public static void main(String[] args) {
        // Input: sorted array with duplicates
        int[] arr = {1,1,2,2,3,3,3,3,3,4,4,4,4,5,5,5,5};

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
