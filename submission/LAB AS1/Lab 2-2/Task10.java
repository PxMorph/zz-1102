import java.util.Scanner;

public class Task10 {
  public static void main(String[] args) {
    double fTemp;

    Scanner uInput = new Scanner(System.in);

    System.out.println("Convert Fahrenheit to Celsius");
    System.out.print("Fahrenheit: ");

    fTemp = uInput.nextDouble();

    celsius(fTemp);
    uInput.close();
  }

  public static void celsius(double fTemp) {
    double celsius = ((fTemp - 32.0)*(5.0/9.0));

    // absolute zero in kelvin unit,
    // limits the lowest possible celcius units
    if (celsius < -273.15) {
      celsius = -273.15;  
    }

    System.out.print("Celsius: ");
    // returns the value 
    System.out.printf("%.2f", celsius);
    System.out.print(" Degree Celsius");
  }
}
