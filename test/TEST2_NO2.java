public class TEST2_NO2 {
  public static void main(String[] args) {
    int [] x = {12,45,3,7,5,20};
    printArrayEven(x);
  }

  private static void printArrayEven(int [] x) {
    int sum = 0;
    for (int i = 0; i < x.length; i+=2) {
      sum += x[i];
    }
    System.out.println(sum);
  }
}
