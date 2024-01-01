package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Choose the conversion option:\n1. " +
                               "Miles to kilometers\n2. Kilometers to miles\n");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double miles = Converter.getInput();
                    Converter.displayResult(miles, "miles", "kilometers");
                    break;
                case 2:
                    double kilometers = Converter.getInput();
                    Converter.displayResult(kilometers, "kilometers", "miles");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        } while (choice < 1 || choice > 2);

        scanner.close();
    }
}