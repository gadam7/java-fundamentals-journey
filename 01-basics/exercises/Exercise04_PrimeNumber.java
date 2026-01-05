/**
 * EXERCISE 4: Prime Number Checker
 * 
 * Create a program that checks if a number is prime.
 * 
 * Definition: A prime number is a natural number greater than 1 
 * that has no positive divisors other than 1 and itself.
 * 
 * Requirements:
 * 1. Create a method isPrime() that returns true/false
 * 2. Handle edge cases (negative numbers, 0, 1)
 * 3. Test with numbers: 2, 3, 4, 17, 20, 29
 * 
 * BONUS: Create a method to find all prime numbers up to N
 * 
 * DIFFICULTY: Medium
 */
public class Exercise04_PrimeNumber {

    // TODO: Implement isPrime method
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // TODO: BONUS - Implement findPrimesUpTo method
    public static void findPrimesUpTo(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO: Test your prime checker
        // Test: 2, 3, 4, 17, 20, 29, 97
        int[] testNumbers = {2, 3, 4, 17, 20, 29, 97};
        for (int num : testNumbers) {
            System.out.println(num + " is prime: " + isPrime(num));
        }

        // BONUS: Find all primes up to N (e.g., N=50)
        System.out.println("Prime numbers up to 50:");
        findPrimesUpTo(50);
    }
}