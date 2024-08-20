public class Act2 {
  //average
  //max
  //min
  //summation
  //
  public static void findAverage(double va, double vb) {
    System.out.println("Average: " + ((va+vb)/2));
  }

  public static void findMax(double va, double vb) {
    System.out.println("Max: " + Math.max(va, vb));
  }

  public static void findMin(double va, double vb) {
    System.out.println("Min: " + Math.min(va, vb));
  }

  public static void findSumm(double va, double vb) {
    System.out.println("Summation: " + (((va+vb)/2)+(Math.max(va,vb))+Math.min(va,vb)) );
  }

  public static void main(String[] args) {
    double va = 15; double vb = 20;
    findAverage(va,vb);
    findMax(va,vb);
    findMin(va,vb);
    findSumm(va,vb);
  }
}
