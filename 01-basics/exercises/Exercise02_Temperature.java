/**
 * EXERCISE 2: Temperature Converter
 * 
 * Create a temperature converter that converts between:
 * - Celsius to Fahrenheit
 * - Fahrenheit to Celsius
 * - Celsius to Kelvin
 * - Kelvin to Celsius
 * 
 * Formulas:
 * - F = (C × 9/5) + 32
 * - C = (F - 32) × 5/9
 * - K = C + 273.15
 * - C = K - 273.15
 * 
 * Requirements:
 * 1. Create a method for each conversion
 * 2. Use appropriate data types (double)
 * 3. Test all conversions
 * 
 * DIFFICULTY: Easy
 */
public class Exercise02_Temperature {
    
    // TODO: Implement celsiusToFahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // TODO: Implement fahrenheitToCelsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    
    // TODO: Implement celsiusToKelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    // TODO: Implement kelvinToCelsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static void main(String[] args) {
        // TODO: Test your conversions
        // Example: 0°C = 32°F, 100°C = 212°F, 0°C = 273.15K
        System.out.println("0°C = " + celsiusToFahrenheit(0) + "°F");
        System.out.println("100°C = " + celsiusToFahrenheit(100) + "°F");
        System.out.println("32°F = " + fahrenheitToCelsius(32) + "°C");
        System.out.println("212°F = " + fahrenheitToCelsius(212) + "°C");
        System.out.println("0°C = " + celsiusToKelvin(0) + "K");
        System.out.println("100°C = " + celsiusToKelvin(100) + "K");
        System.out.println("273.15K = " + kelvinToCelsius(273.15) + "°C");
        System.out.println("373.15K = " + kelvinToCelsius(373.15) + "°C");
    }
}
