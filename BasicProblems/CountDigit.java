// Count the Number of Digits in an Integer

// You are given an integer n. Your task is to count and return the number of digits in the integer.

// The number will have no leading zeroes, except when the number is 0 itself.

// The number is guaranteed to be non-negative.

public class CountDigit {
    public static int countDigit(int n) {
        if (n == 0) return 1; // Edge case

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count += 1;
        }
        return count;
    }

    public static void main(String[] args) {
       System.out.println(countDigit(102));
       System.out.println(countDigit(988888));
       System.out.println(countDigit(002));
    }
}