public class ReverseNumber {

    //for just printing(no return)
    public static void reverseNumberPrint(int n) {
        while (n > 0) {
            int rem = n % 10;
            System.out.print(rem);
            n = n / 10;
        }
    }

    //to actually reverse the number
    public static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        reverseNumberPrint(543);
        System.out.println();
        System.out.println(reverseNumber(789));
    }
}
