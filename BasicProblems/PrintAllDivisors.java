// import java.util.ArrayList;;

// public class PrintAllDivisors {
//     public static ArrayList<Integer> printAllDivisors(int n) {
//         ArrayList<Integer> div = new ArrayList<>();
//         for (int i = 1; i  <= n; i++) {
//             if (n % i == 0) {
//                 div.add(i);
//             }
//         }

//         return div;
//     }

//     public static void main(String[] args) {
//         System.out.println(printAllDivisors(12));
//         System.out.println(printAllDivisors(25));
//         System.out.println(printAllDivisors(144));
//     }
// }


// //You can optimize above code using the square root approach to reduce time complexity from O(n) to O(√n) —
// // useful for very large numbers.

import java.util.ArrayList;
import java.util.Collections;

public class PrintAllDivisors {

    // Function to return all divisors of a number
    public static ArrayList<Integer> printAllDivisors(int n) {
        ArrayList<Integer> div = new ArrayList<>();

        // Loop from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                // i is a divisor of n
                div.add(i);

                // n / i is the paired divisor
                // say n is 120 and i is 10 so it's pair is (120/10)=12
                // But if i == n/i (like in perfect squares), we should not add it twice
                if (i != n / i) {
                    div.add(n / i);
                }
            }
        }
        Collections.sort(div);
        return div;
    }

    public static void main(String[] args) {
        System.out.println(printAllDivisors(12));   // Output: [1, 12, 2, 6, 3, 4]
        System.out.println(printAllDivisors(25));   // Output: [1, 25, 5]
        System.out.println(printAllDivisors(144));  // Output: [1, 144, 2, 72, 3, 48, 4, 36, 6, 24, 8, 18, 9, 16, 12]
    }
}

