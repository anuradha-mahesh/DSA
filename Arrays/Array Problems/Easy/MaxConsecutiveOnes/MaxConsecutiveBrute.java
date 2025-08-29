package MaxConsecutiveOnes;

public class MaxConsecutiveBrute {
    public static int maxConsecutiveOnesBrute(int[] arr) {
        int n = arr.length;
        int maxCount = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    break; // streak broken
                }
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 1, 0, 1, 1 };
        System.out.println(maxConsecutiveOnesBrute(arr)); // Output: 4
    }
}
