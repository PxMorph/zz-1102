public class TEST2_NO1 {
  public static void main(String[] args) {

    // TEST CASES
    /*
    String[] array = {"joyful", "happy", "excited"};
    String[] array2 = {"angry", "sad", "dies"};
    test(array); test(array2);
    */

  }
  
  public static boolean SearchString(String [] s) {
    for (int i = 0; i < s.length; i++) {
      if (s[i].equals("happy")) {
        return true;
      }
    }
    return false;
  }

  /*
  private static void test(String [] array) {
    if (SearchString(array)) {
      System.out.println("happy is present");
    } else {
      System.out.println("happy is not present");
    } 
  }
  */
}
