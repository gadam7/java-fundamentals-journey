/**
 * Demonstrates Java primitive data types
 */
public class DataTypesDemo {
    public static void main(String[] args) {
        // Integer types
        byte myByte = 127;           // -128 to 127
        short myShort = 32000;       // -32,768 to 32,767
        int myInt = 2147483647;      // -2^31 to 2^31-1
        long myLong = 9223372036854775807L; // -2^63 to 2^63-1
        
        // Floating-point types
        float myFloat = 3.14f;       // ~6-7 decimal digits
        double myDouble = 3.14159265359; // ~15 decimal digits
        
        // Character type
        char myChar = 'A';           // Single character
        char unicode = '\u0041';     // Unicode (also 'A')
        
        // Boolean type
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        
        // Printing values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("char: " + myChar);
        System.out.println("unicode char: " + unicode);
        System.out.println("boolean: " + isJavaFun);
        
        // Constants
        final double PI = 3.14159;
        System.out.println("PI constant: " + PI);
    }
}