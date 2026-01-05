/**
 * EXERCISE 3: Grade Calculator
 * 
 * Create a program that calculates letter grades based on numerical scores.
 * 
 * Grading scale:
 * - A: 90-100
 * - B: 80-89
 * - C: 70-79
 * - D: 60-69
 * - F: 0-59
 * 
 * Requirements:
 * 1. Create a method that takes a score and returns the letter grade
 * 2. Validate input (score should be between 0-100)
 * 3. Use if-else statements or switch
 * 4. Test with various scores
 * 
 * BONUS: Calculate GPA (A=4.0, B=3.0, C=2.0, D=1.0, F=0.0)
 * 
 * DIFFICULTY: Easy
 */
public class Exercise03_GradeCalculator {
    
    // TODO: Implement getLetterGrade method
    public static String getLetterGrade(int score) {
        if (score < 0 || score > 100) {
            return "Invalid score";
        } else if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else if (score >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
    
    // TODO: BONUS - Implement getGPA method
    public static double getGPA(String letterGrade) {
        switch (letterGrade) {
            case "A":
                return 4.0;
            case "B":
                return 3.0;
            case "C":
                return 2.0;
            case "D":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return -1.0; // Invalid grade
        }
    }
    
    public static void main(String[] args) {
        // TODO: Test with different scores
        // Test cases: 95, 85, 75, 65, 55
        int[] testScores = {95, 85, 75, 65, 55};
        for (int score : testScores) {
            String grade = getLetterGrade(score);
            System.out.println("Score: " + score + " => Grade: " + grade);
        }

        // BONUS: Test GPA calculation
        System.out.println("\nGPA Calculation:");
        String[] grades = {"A", "B", "C", "D", "F"};
        for (String grade : grades) {
            double gpa = getGPA(grade);
            System.out.println("Grade: " + grade + " => GPA: " + gpa);
        }
    }
}