public class Task15 {
  public static void main(String[] args) {
    // initial balance of $1000 dolons
    // 5 percent interest every year
    // first second and third year
    
    
    double balance = 1000;
    double stYr,ndYr,rdYr;

    stYr = getInterest(balance);
    ndYr = getInterest(stYr);
    rdYr = getInterest(ndYr);



    System.out.println("Initial Balance: "+ balance);
    System.out.println("First Year Balance: "+stYr);
    System.out.println("Second Year Balance: "+ndYr);
    System.out.println("Third Year Balance: "+rdYr);


  }

  public static double getInterest( double cBal ) {
    return cBal + ((cBal/100) * 5);
  }
}
