package SecondLargest;

import java.util.Arrays;

public class SecondLargestAllApproaches {

    // 1️⃣ Brute Force: Sort & Pick
    public static int bruteForce(int[] arr) {
        int[] copy = arr.clone(); // avoid modifying original
        Arrays.sort(copy);
        int n = copy.length;

        int largest = copy[n - 1];
        int secLargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (copy[i] != largest) {
                secLargest = copy[i];
                break;
            }
        }
        return secLargest;
    }

    // 2️⃣ Better: Two Pass Traversal
    public static int betterApproach(int[] arr) {
        int largest = arr[0];
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        int secLargest = -1;
        for (int num : arr) {
            if (num != largest && num > secLargest) {
                secLargest = num;
            }
        }
        return secLargest;
    }

    // 3️⃣ Optimal: Single Pass
    public static int optimalApproach(int[] arr) {
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] < largest) {
                secLargest = arr[i];
            }
        }
        return secLargest;
    }

    // Main method to test all
    public static void main(String[] args) {
        int[] arr = {2, 102, 4, 5, 12, 1, 23, 98};

        System.out.println("Brute Force: " + bruteForce(arr));
        System.out.println("Better Approach: " + betterApproach(arr));
        System.out.println("Optimal Approach: " + optimalApproach(arr));
    }
}
