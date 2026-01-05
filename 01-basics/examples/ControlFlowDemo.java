/**
 * Demonstrates control flow statements in Java
 */
public class ControlFlowDemo {
    public static void main(String[] args) {
        // IF-ELSE Example
        int age = 18;
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }
        
        // IF-ELSE IF-ELSE Example
        int score = 85;
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // SWITCH Example (Traditional)
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Other day");
        }
        
        // FOR Loop Example
        System.out.println("\nCounting with for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Count: " + i);
        }
        
        // WHILE Loop Example
        System.out.println("\nCounting with while loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // DO-WHILE Loop Example
        System.out.println("\nCounting with do-while loop:");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);
        
        // BREAK and CONTINUE Example
        System.out.println("\nBreak and Continue demo:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip 5
            }
            if (i == 8) {
                break; // Stop at 8
            }
            System.out.println(i);
        }
        
        // Ternary Operator Example
        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("\n" + number + " is " + result);
    }
}
