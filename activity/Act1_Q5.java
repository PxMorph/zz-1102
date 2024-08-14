public class Act1_Q5 {
  public static void main(String [] args) {
    // 1. find area of circle
    // 2. find area of triangle
    // 3. circle/2 - area of triangle
  
    double areac, triangle, shaded, diameter, r;
    diameter = 10; r = diameter/2;
    areac = Math.PI*(Math.pow(r,2));
    triangle = (4*6)/2;
    shaded = (areac/2) - triangle;

    System.out.println(shaded);
  }
}
