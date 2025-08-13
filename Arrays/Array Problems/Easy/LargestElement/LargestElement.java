package LargestElement;

class LargestElement {
    public static int largestElement(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 4, 43, 12, 543 };
        System.out.println("Largest Element is "+ largestElement(arr));
    }
}



