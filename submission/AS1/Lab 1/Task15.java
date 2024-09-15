public class Task15 {
  public static void main(String[] args) {
    // initial balance of $1000 dolons
    // 5 percent interest every year
    // first second and third year
    
    // inits
    double balance = 1000;
    double stYr,ndYr,rdYr;
    
    // use method to calc the value needed.
    stYr = getInterest(balance);
    ndYr = getInterest(stYr);
    rdYr = getInterest(ndYr);

    System.out.print("Initial Balance: ");
    formatBal(balance);
    System.out.print("First Year Balance: ");
    formatBal(stYr);
    System.out.print("Second Year Balance: ");
    formatBal(ndYr);
    System.out.print("Third Year Balance: ");
    formatBal(rdYr);

  }

  // Print Formater -> Average scss / tailwind user's mindset wkwkwkwkwkw
  public static void formatBal(double bal) {
    System.out.printf("%.2f %n", bal);
  }

  // calculates the output using the formula
  // values is carried over using the args
  public static double getInterest( double cBal ) {
    return cBal + ((cBal/100) * 5);
  }
}
