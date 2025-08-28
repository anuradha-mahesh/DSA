package FindMissingNumber;

public class FindMissingNumberOptimal1 {
    public static int findMissingNumberOptimal1(int[] arr) {
        int n = arr.length + 1;
        int sum1 = (n * (n +1)) / 2;
        int sum2 = 0;
        for (int i = 0; i < n - 1; i++) {
            sum2 = sum2 + arr[i];
        }
        return sum1 - sum2;
    }


    public static void main(String[] args) {
        int[] arr2 = { 1, 2, 3, 4, 5,6,7,8,10 };
        System.out.println(findMissingNumberOptimal1(arr2));
    }
}

