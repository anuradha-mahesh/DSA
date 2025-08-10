import java.util.Scanner;

public class HashingBasics{
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input the size of the array
        System.out.print("enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Step 2: Take array input
        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 3: Precompute frequency using a hash array
        // Assumption: elements in arr are from 0 to 12
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;  // count frequency
        }

        // Step 4: Input number of queries
        System.out.print("enter the number of queries: ");
        int q = sc.nextInt();

        // Step 5: Process each query
        while (q-- > 0) {
            int number = sc.nextInt();
            System.out.println(hash[number]); // Fetch frequency in O(1)
        }

        sc.close();
    }
}