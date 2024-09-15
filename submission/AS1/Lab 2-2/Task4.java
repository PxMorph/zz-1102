import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    
    Scanner uInput = new Scanner(System.in);

    boolean check = false;
    int choices;
    double val1, val2;

    Scanner uInput2 = new Scanner(System.in);

    while(!check){
      System.out.println("1. find area and perimeter of a rectangle");
      System.out.println("2. find area and circumference of a circle");
      System.out.print("Choices: ");
      
      choices = uInput.nextInt();
      
      switch (choices) {
        case 1:
          System.out.print("length: ");
          val1 = uInput2.nextDouble();
          System.out.print("width: ");
          val2 = uInput2.nextDouble();

          System.out.print("area = ");
          System.out.printf("%.2f",(val1 * val2));
          System.out.print(" square cm , perimeter = ");
          System.out.printf("%.2f",(val1 + val2) * 2);
          System.out.println(" cm");

          break;
        
        case 2:
          System.out.print("radius: ");
          val1 = uInput2.nextDouble();

          System.out.print("area = ");
          System.out.printf("%.2f",( Math.PI * Math.pow(val1, 2)));
          System.out.print(" square cm, circumference = ");
          System.out.printf("%.2f", (2*Math.PI*val1));
          System.out.println(" cm");
          break;

        default:
          System.out.println("Error: Wrong menu choice");
          break;
      }
      

    }
    uInput.close();
    uInput2.close();
    
  }

}
