package FindMissingNumber;

public class FindMissingNumberOptimal2 {
    

    public static int missingNumber(int[] arr) {
        int N = arr.length + 1; // total numbers should be from 1..N
        int xor1 = 0, xor2 = 0;

        // XOR all array elements
        for (int i = 0; i < arr.length; i++) {
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1); // numbers 1..arr.length
        }

        xor1 = xor1 ^ N; // include N

        return xor1 ^ xor2; // missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5}; // missing number is 3
        System.out.println("The missing number is: " + missingNumber(arr));
    }
}


