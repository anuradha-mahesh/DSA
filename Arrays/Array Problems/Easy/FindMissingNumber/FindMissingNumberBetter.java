package FindMissingNumber;

public class FindMissingNumberBetter {
    public static int findMissingNumberBetter(int[] arr) {
        int n = arr.length+1;
        int[] hash = new int[n + 1];
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]] = 1;
        }

        for (int i = 1; i < n; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 8 };
        System.out.println(findMissingNumberBetter(arr2));
    }
}


