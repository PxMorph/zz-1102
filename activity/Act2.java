public class Act2 {

  // calc 2 vars
  // by calling methods
  // find average
  // find max
  // find min
  // find summation
  
  public static void main(String[] args) {
    double va = 10; double vb = 15;
    findAverage(va,vb);
    findMax(va,vb);
    findMin(va,vb);
    findSumm(va,vb);
  }

  static void findAverage(double va, double vb) {
    System.out.println("Average: "+(va+vb)/2);
  }

  static void findMax(double va, double vb) {
    System.out.println("Max: "+Math.max(va, vb));
  }

  static void findMin(double va, double vb) {
    System.out.println("Min: "+Math.min(va,vb));
  }

  static void findSumm(double va, double vb) {
    double result = ((va+vb)/2)+Math.max(va,vb)+Math.min(va,vb);
    System.out.println("Summation: "+ result);
  }
}




