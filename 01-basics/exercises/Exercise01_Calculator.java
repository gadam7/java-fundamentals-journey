/**
 * EXERCISE 1: Basic Calculator
 * 
 * Create a simple calculator that can perform basic operations:
 * - Addition
 * - Subtraction
 * - Multiplication
 * - Division
 * 
 * Requirements:
 * 1. Create methods for each operation
 * 2. Each method should take two parameters and return the result
 * 3. Handle division by zero
 * 4. Test all operations in the main method
 * 
 * DIFFICULTY: Easy
 */
public class Exercise01_Calculator {
    
    // TODO: Implement add method
    public static int add(int a, int b) {
        return a + b;
    }
    
    // TODO: Implement subtract method
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    // TODO: Implement multiply method
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    // TODO: Implement divide method (handle division by zero)
    public static int divide(int a, int b) {
        return (b == 0) ? 0 : a / b;
    }
    
    public static void main(String[] args) {
        // TODO: Test all your methods here
        Example: System.out.println("10 + 5 = " + add(10, 5));
        Example: System.out.println("10 - 5 = " + subtract(10, 5));
        Example: System.out.println("10 * 5 = " + multiply(10, 5));
        Example: System.out.println("10 / 5 = " + divide(10, 5));
        Example: System.out.println("10 / 0 = " + divide(10, 0));
    }
}