import java.util.Scanner;

/**
 * Todo List Manager - Version 1 (Basics)
 * 
 * A simple console-based todo list application using only Phase 1 Java concepts:
 * - Arrays for data storage
 * - Methods for organization
 * - Loops and control flow
 * - Scanner for user input
 * 
 * Features:
 * - Add tasks
 * - View all tasks
 * - Mark tasks as complete
 * - Delete tasks
 * 
 * @author gadam7
 * @version 1.0.0
 */
public class TodoListApp {
    
    // Constants
    private static final int MAX_TASKS = 50;
    
    // Parallel arrays to store task data
    private static String[] taskTitles = new String[MAX_TASKS];
    private static String[] taskDescriptions = new String[MAX_TASKS];
    private static boolean[] taskStatus = new boolean[MAX_TASKS];
    private static int taskCount = 0;
    
    private static Scanner input = new Scanner(System.in);
    
    /**
     * Main method - Entry point of the application
     */
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   📝 Todo List Manager v1.0            ║");
        System.out.println("║   Phase 1: Java Basics Edition         ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println();
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getUserChoice();
            
            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    viewAllTasks();
                    break;
                case 3:
                    markTaskComplete();
                    break;
                case 4:
                    viewCompletedTasks();
                    break;
                case 5:
                    clearAllCompletedTasks();
                    break;
                case 6:
                    deleteTask();
                    break;
                case 7:
                    running = false;
                    System.out.println("\n👋 Thanks for using Todo List Manager! Goodbye!");
                    break;
                default:
                    System.out.println("\n❌ Invalid choice! Please try again.");
            }
            
            if (running) {
                pressEnterToContinue();
            }
        }
        
        input.close();
    }
    
    /**
     * Display the main menu
     */
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           MAIN MENU");
        System.out.println("=".repeat(40));
        System.out.println("1. ➕ Add New Task");
        System.out.println("2. 📋 View All Tasks");
        System.out.println("3. ✅ Mark Task as Complete");
        System.out.println("4. ✅ View Completed Tasks");
        System.out.println("5. 🗑️ Clear All Completed Tasks");
        System.out.println("6. ❌ Delete Task");
        System.out.println("7. 🚪 Exit");
        System.out.println("=".repeat(40));
        System.out.print("Enter your choice (1-7): ");
    }
    
    /**
     * Get user's menu choice
     * @return integer choice
     */
    private static int getUserChoice() {
        try {
            return Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            return -1; // Invalid input
        }
    }
    
    /**
     * Add a new task to the list
     */
    private static void addTask() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           ADD NEW TASK");
        System.out.println("=".repeat(40));
        
        if (taskCount >= MAX_TASKS) {
            System.out.println("❌ Error: Task list is full! (Maximum " + MAX_TASKS + " tasks)");
            return;
        }
        
        System.out.print("Enter task title: ");
        String title = input.nextLine().trim();
        
        if (title.isEmpty()) {
            System.out.println("❌ Error: Task title cannot be empty!");
            return;
        }
        
        System.out.print("Enter task description: ");
        String description = input.nextLine().trim();
        
        // Add task to arrays
        taskTitles[taskCount] = title;
        taskDescriptions[taskCount] = description.isEmpty() ? "No description" : description;
        taskStatus[taskCount] = false; // New tasks are not completed
        taskCount++;
        
        System.out.println("\n✅ Task added successfully! Total tasks: " + taskCount);
    }
    
    /**
     * View all tasks in the list
     */
    private static void viewAllTasks() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           ALL TASKS");
        System.out.println("=".repeat(40));
        
        if (taskCount == 0) {
            System.out.println("📭 No tasks yet! Add your first task to get started.");
            return;
        }
        
        for (int i = 0; i < taskCount; i++) {
            String status = taskStatus[i] ? "✅" : "⬜";
            String strikethrough = taskStatus[i] ? "(DONE)" : "";
            
            System.out.println("\n" + (i + 1) + ". " + status + " " + taskTitles[i] + " " + strikethrough);
            System.out.println("   Description: " + taskDescriptions[i]);
        }
        
        System.out.println("\n" + "=".repeat(40));
        System.out.println("Total: " + taskCount + " task(s) | Completed: " + getCompletedCount() + " | Pending: " + getPendingCount());
    }

    private static void viewCompletedTasks() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("        COMPLETED TASKS");
        System.out.println("=".repeat(40));

        boolean hasCompleted = false;
        for (int i = 0; i < taskCount; i++) {
            if (taskStatus[i]) {
                String status = "✅";
                String strikethrough = "(DONE)";

                System.out.println("\n" + (i + 1) + ". " + status + " " + taskTitles[i] + " " + strikethrough);
                System.out.println("   Description: " + taskDescriptions[i]);
                hasCompleted = true;
            }
        }

        if (!hasCompleted) {
            System.out.println("📭 No completed tasks yet!");
        }
    }
    
    /**
     * Mark a task as complete
     */
    private static void markTaskComplete() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("         MARK TASK COMPLETE");
        System.out.println("=".repeat(40));
        
        if (taskCount == 0) {
            System.out.println("📭 No tasks to mark as complete!");
            return;
        }
        
        // Show pending tasks only
        System.out.println("\nPending tasks:");
        boolean hasPending = false;
        for (int i = 0; i < taskCount; i++) {
            if (!taskStatus[i]) {
                System.out.println((i + 1) + ". " + taskTitles[i]);
                hasPending = true;
            }
        }
        
        if (!hasPending) {
            System.out.println("🎉 All tasks are completed! Great job!");
            return;
        }
        
        System.out.print("\nEnter task number to mark as complete: ");
        int taskNumber = getUserChoice();
        
        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("❌ Error: Invalid task number!");
            return;
        }
        
        int index = taskNumber - 1;
        
        if (taskStatus[index]) {
            System.out.println("ℹ️  This task is already completed!");
        } else {
            taskStatus[index] = true;
            System.out.println("✅ Task '" + taskTitles[index] + "' marked as complete!");
        }
    }
    
    /**
     * Delete a task from the list
     */
    private static void deleteTask() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("           DELETE TASK");
        System.out.println("=".repeat(40));
        
        if (taskCount == 0) {
            System.out.println("📭 No tasks to delete!");
            return;
        }
        
        // Show all tasks
        for (int i = 0; i < taskCount; i++) {
            String status = taskStatus[i] ? "✅" : "⬜";
            System.out.println((i + 1) + ". " + status + " " + taskTitles[i]);
        }
        
        System.out.print("\nEnter task number to delete: ");
        int taskNumber = getUserChoice();
        
        if (taskNumber < 1 || taskNumber > taskCount) {
            System.out.println("❌ Error: Invalid task number!");
            return;
        }
        
        int index = taskNumber - 1;
        String deletedTitle = taskTitles[index];
        
        // Shift all elements after the deleted task
        for (int i = index; i < taskCount - 1; i++) {
            taskTitles[i] = taskTitles[i + 1];
            taskDescriptions[i] = taskDescriptions[i + 1];
            taskStatus[i] = taskStatus[i + 1];
        }
        
        // Clear the last element
        taskTitles[taskCount - 1] = null;
        taskDescriptions[taskCount - 1] = null;
        taskStatus[taskCount - 1] = false;
        
        taskCount--;
        
        System.out.println("🗑️  Task '" + deletedTitle + "' deleted successfully!");
        System.out.println("Total tasks remaining: " + taskCount);
    }

    private static void clearAllCompletedTasks() {
        int i = 0;
        while (i < taskCount) {
            if (taskStatus[i]) {
                // Shift all elements after the deleted task
                for (int j = i; j < taskCount - 1; j++) {
                    taskTitles[j] = taskTitles[j + 1];
                    taskDescriptions[j] = taskDescriptions[j + 1];
                    taskStatus[j] = taskStatus[j + 1];
                }

                // Clear the last element
                taskTitles[taskCount - 1] = null;
                taskDescriptions[taskCount - 1] = null;
                taskStatus[taskCount - 1] = false;

                taskCount--;
            } else {
                i++;
            }
        }

        System.out.println("🗑️  All completed tasks cleared successfully!");
        System.out.println("Total tasks remaining: " + taskCount);
    }
    
    /**
     * Get count of completed tasks
     * @return number of completed tasks
     */
    private static int getCompletedCount() {
        int count = 0;
        for (int i = 0; i < taskCount; i++) {
            if (taskStatus[i]) {
                count++;
            }
        }
        return count;
    }
    
    /**
     * Get count of pending tasks
     * @return number of pending tasks
     */
    private static int getPendingCount() {
        return taskCount - getCompletedCount();
    }
    
    /**
     * Wait for user to press Enter to continue
     */
    private static void pressEnterToContinue() {
        System.out.print("\nPress Enter to continue...");
        input.nextLine();
    }
}
