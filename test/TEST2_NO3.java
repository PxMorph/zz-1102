public class TEST2_NO3 {
  public static void main(String[] args) {

    // TEST CASE
    
    /*
    double[] testData = {2.0, 5.5, 10.0, 15.0, 20.0, 7.7, 12.3, 3.1};
    double[] newData = newArray(testData);
    for (int i = 0; i < newData.length; i++) {
      System.out.println(newData[i]);
    }
    */
  }

  public static double [] newArray(double [] x) {
    int count = 0;
    
    for (int i = 0; i < x.length;i++) {
      if (x[i] >= 5.0 && x[i] <= 15.0) {
        count++;
      }
    }

    double [] y = new double [count];
    int count2 = 0;
    for (int i = 0; i < x.length; i++) {
      if (x[i] >= 5.0 && x[i] <= 15.0) {
        y[count2] = x[i];
        count2++;
      }
    }

    return y;
  }
}
