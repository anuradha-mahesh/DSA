// public class CalGcd {
//     public static int calGCD(int n1, int n2) {
//         int gcd = 1;
//         for (int i = 2; i <=Math.min(n1, n2); i++) {
//             if (n1 % i == 0 && n2 % i == 0) {
//                 gcd = i;
//             }
//         }
//         return gcd;
//     }
    
//     public static void main(String[] args) {
//         System.out.println(calGCD(12, 18));
//         System.out.println(calGCD(25, 5));
//     }
// }


public class CalGcd {
    public static int calGCD(int n1, int n2) {
        while (n1 > 0 && n2 > 0) {
            if (n1 > n2)
                n1 = n1 % n2;
            else
                n2 = n2 % n1;
        }
        if (n1 == 0)
            return n2;
        else
            return n1;

    }
    
    public static void main(String[] args) {
        System.out.println(calGCD(12, 18));
        System.out.println(calGCD(25, 5));
    }
}
