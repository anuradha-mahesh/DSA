public class CheckPalindrome {
   
    static boolean isPalindrome(String str, int i) {
        int n = str.length();

        // base condition
        if (i >= n / 2) return true;

        // if characters at i and n-i-1 don't match, it's not a palindrome
        if (str.charAt(i) != str.charAt(n - i - 1)) return false;

        // recursive call
        return isPalindrome(str, i + 1);
    }

    public static void main(String[] args) {
        String str = "madam";

        if (isPalindrome(str, 0)) {
            System.out.println(str+ " is Palindrome");
        } else {
            System.out.println(str+ " is not a Palindrome");
        }
    }
}


