
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // Creating a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter temperature in Celsius
        System.out.println("Enter temperature in Celsius:");
        double celsius = scanner.nextDouble();  // Capture the user's input as a double

        // Convert the Celsius temperature to Fahrenheit
        double fahrenheit = (celsius * 1.8) + 32;

        // Display the temperature in Fahrenheit
        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        // Close the scanner 
        scanner.close();
    }
}