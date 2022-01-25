package edu.cmn.deepdive;

/**
 * Implements a converter from the Celsius to Fahrenheit temperature scales. Double-precision
 * calculations are used.
 */
public class Converter {

  private static final double CELCIUS_TO_FAHRENHEIT_SCALE_FACTOR = 1.8;
  private static final int CELSIUS_TO_FAHRENHEIT_INTERCEPT = 32;
  private static final String CONVERSION_DISPLAY_FORMAT =
      "%.2f degrees Celsius = %.2f degrees Fahrenheit.%n";
  private static final String PARSE_ERROR_FORMAT = "%s not recognized as a number.%n";

  public static double convertC2F(double c) {
    return CELCIUS_TO_FAHRENHEIT_SCALE_FACTOR * c + CELSIUS_TO_FAHRENHEIT_INTERCEPT;
  }

  public static void main(String[] args) {
    for (String arg : args) {
      try {
        double celsius = Double.parseDouble(arg);
        System.out.printf(CONVERSION_DISPLAY_FORMAT, celsius, convertC2F(celsius));
      } catch (NumberFormatException e) {
        System.out.printf(PARSE_ERROR_FORMAT, arg);
      }
    }
  }

}
