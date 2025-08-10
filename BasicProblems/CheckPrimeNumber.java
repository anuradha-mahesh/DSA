public class CheckPrimeNumber {
    public static void checkPrime(int n) {
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;  //don't forget to use break
            }
        }
        if(isPrime)
            System.out.println(n + " is a prime number");
        else
             System.out.println(n + " is not a prime number");
    }
    
    public static void main(String[] args) {
        checkPrime(17);
        checkPrime(12);
        checkPrime(5);
        checkPrime(18);
        checkPrime(9);
        checkPrime(25);
    }
}
