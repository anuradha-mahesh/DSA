package FindMissingNumber;

public class FindMissingNumberBrute {
    public static int findMissingNumberBrute(int[] arr) {
        int n = arr.length + 1;
        for (int i = 1; i < n; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = 1;
                }
            }

            if (flag == 0) {
                return i;
            }
        }
         return -1;
    }

    public static void main(String[] args) {
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 8 };
        System.out.println(findMissingNumberBrute(arr2));
    }
}
