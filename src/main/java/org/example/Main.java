package org.example;

// imported all utils
import java.util.*;

public class Main {
    // method to convert celsius value to fahrenheit
    public static float celsiusToFahrenheit(float temperature) {
        return (temperature * ((float) 9 / 5)) + 32; // apply formula
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create scanner object
        System.out.print("Enter temperature in Celsius: ");
        float temperature = scanner.nextFloat(); // read user input
        System.out.printf("Temperature in Fahrenheit: %.2f", celsiusToFahrenheit(temperature));
    }
}