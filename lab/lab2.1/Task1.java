import java.util.Scanner;

public class Task1 {
  
  //Write the analysis, pseudo-code algorithm 

  //defines and initializes the volume v of a sphere in cubic centimeters
  
  //displays the volume in cubic centimetres 
  
  //and the surface area s of the sphere in square centimeters.
  
  //we have the volume

  //volume of sphere = 4/3*PI*r^3

  //find radius first using volume
  //r = cubic root (3v/4PI)
  //
  //Surface area = 4*PI*r^2
  //
  //PROGRAM LOGIC
  //
  //User input (volume) >> Find r >> Outputs Volume w/ calc surfaceArea
  //
  //outputs in 2 decimal points, save memory (cannot use float due to usage of pi)


  public static void main(String[] args) {
    
    double sVol;

    Scanner uVol = new Scanner(System.in);
    
    System.out.println("Volume of Sphere : ");
    sVol = uVol.nextDouble();
    System.out.print("Volume : ";
    System.out.printf("%.2f", sVol);
    System.out.println(" Cubic cm");
    System.out.print("Surface Area : ");
    System.out.printf("%.2f" ,calcSA(sVol));
    System.out.println(" Square cm");
  }
 
  //Method for calculating Surface area
  public static double calcSA(double e) {
    return 4.0 * Math.PI * Math.pow((Math.cbrt((3*e)/(4.0*Math.PI))), 2);
  }
}
