public class CheckArmstrongNumber {
    public static void checkArmstrongNumber(int n) {
        int sum = 0;
        int originalNum = n;

        int digits = String.valueOf(n).length();

        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, digits);
            n = n / 10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Armstrong Number");
        } else
            System.out.println(originalNum + " is not a Armstrong Number");
    }
    
    public static void main(String[] args) {
        checkArmstrongNumber(153);
        checkArmstrongNumber(124);
    }
}
