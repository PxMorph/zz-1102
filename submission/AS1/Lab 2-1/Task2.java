//  Inflation is defined as the loss of purchasing power of a given currency over time. 
//  Let us assume that money loses 3% of its value every year. 
//  This means that an amount of money next year will equal to only 97% of its value this year.
// 
//  Let us define the following equation to calculate inflation:
//    𝑂𝑡ℎ𝑒𝑟𝐴𝑚𝑜𝑢𝑛𝑡 = 𝐶𝑢𝑟𝑟𝑒𝑛𝑡𝐴𝑚𝑜𝑢𝑛𝑡 ∗ 0.97 ^ 𝑂𝑡ℎ𝑒𝑟𝑌𝑒𝑎𝑟−𝐶𝑢𝑟𝑟𝑒𝑛𝑡𝑌𝑒𝑎𝑟
// 
//  Write the analysis, 
//  pseudo-code algorithm and 
//  a corresponding complete Java program that 
//  defines and 
//  initializes a variable currentAmount to an amount in BND.
// 
//  then calculates and displays:
//    1. the equivalent amount in two given years in the future.
//    2. the equivalent amount in a given year in the past.

//  The current amount is: 1000.0
//  The current year is: 2013
//  The amount for year 2009 is 1129.5697747731626
//  The amount for year 2025 is 693.8423609954377
//  The amount for year 2040 is 439.3765001738383
//
//  2.1 ANALYSIS    <-------------------------------
//  
//  * Inflation = reducing the money
//  * 97% total per year
//  * OtherAmount = Current Amount * 0.97 ^ (OtherYear - CurrentYear)
//
//  Calculates and displays:
//    1. the equivalent amount in two given years in the future.
//    2. the equivalent amount in a given year in the past.
//
//  2.2 PSEUDO CODE <-------------------------------
//
//  Start
//  tell the current amount
//  tell the current year
//  get the first year
//  calculate the value for first year
//  tell the year and value
//  get the second year
//  calculate the value for second year
//  tell the year and value
//  get the third year
//  calculate the value for third year
//  tell the year and value

public class Task2 {
  public static void main(String[] args) {
    // get the first sample output
    System.out.println("First Output");
    processThing(1000, 2013, 2009, 2025, 2040);

    // get the second sample output
    System.out.println("Second Output");
    processThing(1000, 2017, 2015, 2020, 2025);
  }

  public static void processThing( double cAmt, int cYr, int stYr, int ndYr, int rdYr ) {
    System.out.println("The current amount is: " + cAmt);
    System.out.println("The current year is: "+ cYr);

    // contacts the calcamount function by giving the values needed for the calculation
    System.out.println("The amount for year "+ stYr + " is " + calcAmount(cAmt, stYr, cYr));
    System.out.println("The amount for year "+ ndYr + " is " + calcAmount(cAmt, ndYr, cYr));
    System.out.println("The amount for year "+ rdYr + " is " + calcAmount(cAmt, rdYr, cYr));
  }

  public static double calcAmount(double cAmt,int oYr, int cYr) {
    // calculate inflation || Return the finals value
    return cAmt * Math.pow(0.97, ((oYr-cYr)));
  }

}
