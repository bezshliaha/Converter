package app;

public class Rounder {
    public static double roundValue(double value) {
        return Math.round(value * 100.0) / 100.0;
    }
}