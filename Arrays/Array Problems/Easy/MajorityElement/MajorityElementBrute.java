package MajorityElement;

public class MajorityElementBrute {
      public static int maj(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return arr[i]; // Majority element found
            }
        }

        return -1; // No majority element
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 2, 2, 4, 4, 4, 4, 4, 4, 4};
        System.out.println("Majority element is " + maj(arr));
    }
}
