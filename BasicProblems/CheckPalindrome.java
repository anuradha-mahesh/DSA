public class CheckPalindrome {
    public static void checkPalindrome(int n) {
        int originalNum = n;
        int rev = 0;      
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (rev == originalNum) {
            System.out.println(originalNum + " is a Palindrome");
        } else
            System.out.println(originalNum + " is not a Palindrome");
    }
    
    public static void main(String[] args) {
        checkPalindrome(535);
        checkPalindrome(927);;
    }
}
