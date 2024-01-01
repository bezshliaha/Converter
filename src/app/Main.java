package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose conversion option:\n1. Miles to Kilometers");
        int choice = scanner.nextInt();

        if (choice == 1) {
            double miles = Converter.getInput();
            Converter.displayResult(miles, "miles", "kilometers");
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}