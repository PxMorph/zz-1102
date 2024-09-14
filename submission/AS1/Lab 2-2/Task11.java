import java.util.Scanner;

public class Task11 {
  public static void main(String[] args) {
    Scanner uInput = new Scanner(System.in);
    double speed, time;

    System.out.println("Check Distance travelled");
    System.out.print("Speed (m/s) : ");
    speed = uInput.nextDouble();
    System.out.print("Time taken (s): ");
    time = uInput.nextDouble();

    distance(speed, time);
    uInput.close();
  }

  public static void distance(double speed, double time) {
    System.out.println("The distance the car have travelled: " + ( speed * time ) + " m/s2");
  }
}
