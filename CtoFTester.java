/*
The function celsiusToFahrenheit will have 1 parameter, which would function as
the input for Celcius. It needs to be double. The return value should also be
a double as you're multiplying the input, c, by a fraction.

The function fahrenheitToCelcius will likewise have 1 parameter, which would
function as the input for Fahrenheit. The parameter will be a double. The return
also needs to be a double because you are dividing the input, f, by a fraction. 
*/


public class CtoFTester{

  public static double celsiusToFahrenheit(double c) {
    double f = (9.0 / 5.0) * c + 32;
    return f;
  }


  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheit(100));
  }
}

