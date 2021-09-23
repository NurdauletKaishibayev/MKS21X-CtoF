/*
The function celsiusToFahrenheit will have 1 parameter, which would function as
the input for Celcius. It needs to be double. The return value should also be
a double as you're multiplying the input, c, by a fraction.

The function fahrenheitToCelcius will likewise have 1 parameter, which would
function as the input for Fahrenheit. The parameter will be a double. The return
also needs to be a double because you are dividing the input, f, by a fraction.
*/


public class CtoFTester{

  public static double celsiusToFahrenheit(double c) { // Input Celcius
    double f = (9.0 / 5.0) * c + 32.0; 
    return f;
  }

  public static double fahrenheitToCelcius(double f) { // Input Fahrenheit
    double c = (f - 32.0) / (9.0 / 5.0);
    return c;
  }


  public static void main(String[] args) {
    // Celcius to Fahrenheit
    System.out.println(celsiusToFahrenheit(1));
    System.out.println(celsiusToFahrenheit(0));
    System.out.println(celsiusToFahrenheit(32));
    System.out.println(celsiusToFahrenheit(100));
    System.out.println(celsiusToFahrenheit(-25));
    // Fahrenheit to Celcius
    System.out.println(fahrenheitToCelcius(1));
    System.out.println(fahrenheitToCelcius(0));
    System.out.println(fahrenheitToCelcius(212));
    System.out.println(fahrenheitToCelcius(100));
    System.out.println(fahrenheitToCelcius(-17));
  }
}

