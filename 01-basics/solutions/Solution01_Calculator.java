/**
 * SOLUTION 1: Basic Calculator
 */
public class Solution01_Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return (double) a / b;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Calculator Tests ===");
        System.out.println("10 + 5 = " + add(10, 5));
        System.out.println("10 - 5 = " + subtract(10, 5));
        System.out.println("10 * 5 = " + multiply(10, 5));
        System.out.println("10 / 5 = " + divide(10, 5));
        System.out.println("10 / 0 = " + divide(10, 0)); // Test division by zero
        System.out.println("10 / 3 = " + divide(10, 3)); // Test decimal result
    }
}