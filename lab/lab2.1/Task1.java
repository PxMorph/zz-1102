import java.util.Scanner;

public class Task1 {

  //find radius first using volume
  //v = (4/3) * pi * r^3
  //r = cubic root of v*(4/3)/pi
  public static void main(String[] args) {
    double vol, r;
    Scanner volSphere = new Scanner(System.in);
    System.out.println("skibidi :");
    vol = volSphere.nextDouble();
    
    r = Math.cbrt( (vol*(4/3))*Math.PI);
  System.out.println("epic: " + (4* Math.PI*(Math.pow(r,2))));
  }
}
