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

    // absolute zero
    if (celsius < 0) {
      celsius = 0;  
    }

    System.out.println("Celsius: " + celsius);
  }
}
