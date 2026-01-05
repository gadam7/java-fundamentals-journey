/**
 * EXERCISE 5: Number Patterns
 * 
 * Create methods to print different number patterns using loops.
 * 
 * Requirements:
 * Print the following patterns:
 * 
 * Pattern 1 (Square):
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 1 2 3 4 5
 * 
 * Pattern 2 (Right Triangle):
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * Pattern 3 (Inverted Triangle):
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1
 * 
 * BONUS: Create a pyramid pattern with stars
 * 
 * DIFFICULTY: Medium
 */
public class Exercise05_Patterns {
    
    // TODO: Implement printSquare method
    public static void printSquare(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // TODO: Implement printRightTriangle method
    public static void printRightTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // TODO: Implement printInvertedTriangle method
    public static void printInvertedTriangle(int size) {
        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
    // TODO: BONUS - Implement printPyramid method
    public static void printPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = i; j < height; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // TODO: Call all your pattern methods
        printSquare(5);
        System.out.println("----------");
        printRightTriangle(5);
        System.out.println("----------");
        printInvertedTriangle(5);
        System.out.println("----------");
        printPyramid(5);
    }
}
