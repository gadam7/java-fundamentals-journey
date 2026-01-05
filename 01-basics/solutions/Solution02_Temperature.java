/**
 * SOLUTION 2: Temperature Converter
 */
public class Solution02_Temperature {
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    public static void main(String[] args) {
        System.out.println("=== Temperature Converter Tests ===");
        
        // Celsius to Fahrenheit
        System.out.println("0°C = " + celsiusToFahrenheit(0) + "°F");
        System.out.println("100°C = " + celsiusToFahrenheit(100) + "°F");
        
        // Fahrenheit to Celsius
        System.out.println("32°F = " + fahrenheitToCelsius(32) + "°C");
        System.out.println("212°F = " + fahrenheitToCelsius(212) + "°C");
        
        // Celsius to Kelvin
        System.out.println("0°C = " + celsiusToKelvin(0) + "K");
        System.out.println("100°C = " + celsiusToKelvin(100) + "K");
        
        // Kelvin to Celsius
        System.out.println("273.15K = " + kelvinToCelsius(273.15) + "°C");
        System.out.println("373.15K = " + kelvinToCelsius(373.15) + "°C");
    }
}