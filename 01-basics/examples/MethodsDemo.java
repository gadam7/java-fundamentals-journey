/**
 * Demonstrates methods in Java
 */
public class MethodsDemo {
    
    // Method with no parameters and no return value
    public static void greet() {
        System.out.println("Hello from a method!");
    }
    
    // Method with parameters
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }
    
    // Method with return value
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with multiple parameters and return value
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    // Method overloading - same name, different parameters
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double multiply(double a, double b) {
        return a * b;
    }
    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Recursive method example
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    // Main method - entry point
    public static void main(String[] args) {
        // Calling methods
        greet();
        greetPerson("Java Learner");
        
        int sum = add(10, 20);
        System.out.println("Sum: " + sum);
        
        double area = calculateArea(5.5, 3.2);
        System.out.println("Area: " + area);
        
        // Method overloading examples
        System.out.println("Multiply (int): " + multiply(5, 3));
        System.out.println("Multiply (double): " + multiply(5.5, 2.0));
        System.out.println("Multiply (3 ints): " + multiply(2, 3, 4));
        
        // Recursive method
        System.out.println("Factorial of 5: " + factorial(5));
    }
}