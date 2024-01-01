package app;

import java.util.Scanner;

public class Converter {
    public static double milesToKilometers(double miles) {
        return miles * 1.60934;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers / 1.60934;
    }

    public static double getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the distance:");

        String input = scanner.nextLine().replace(",", ".");
        return Double.parseDouble(input);
    }

    public static void displayResult(double value, String fromUnit, String toUnit) {
        double roundedValue = Rounder.roundValue(value);
        double convertedValue;
        if ("miles".equals(fromUnit)) {
            convertedValue = milesToKilometers(roundedValue);
        } else {
            convertedValue = kilometersToMiles(roundedValue);
        }
        System.out.println(roundedValue + " " + fromUnit + " = " +
                           Rounder.roundValue(convertedValue) +
                           " " + toUnit);
    }
}