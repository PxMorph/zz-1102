// Inflation is defined as the loss of purchasing power of a given currency over time. 
// Let us assume that money loses 3% of its value every year. 
// This means that an amount of money next year will equal to only 97% of its value this year.
// 
// Let us define the following equation to calculate inflation:
//    𝑂𝑡ℎ𝑒𝑟𝐴𝑚𝑜𝑢𝑛𝑡 = 𝐶𝑢𝑟𝑟𝑒𝑛𝑡𝐴𝑚𝑜𝑢𝑛𝑡 ∗ 0.97 ^ 𝑂𝑡ℎ𝑒𝑟𝑌𝑒𝑎𝑟−𝐶𝑢𝑟𝑟𝑒𝑛𝑡𝑌𝑒𝑎𝑟
// 
// Write the analysis, 
// pseudo-code algorithm and 
// a corresponding complete Java program that 
// defines and 
// initializes a variable currentAmount to an amount in BND.
// 
// then calculates and displays:
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
//
//      ____________________________________________________
//      Tasks
//
//      * Ask current amount
//      * Ask current year
//
//      * Future years
//      * |
//      * | - Ask first future year (init)
//      * | - Ask second future year (init)
//      
//      * Past year
//      * |
//      * | - Ask past year
//      
//      * tell the total for 
//      * | - current amount money
//      * | - curent year
//      * | - 1st year
//      * | - 2nd year
//      * | - past year total
//
//  2.2 PSEUDO CODE <-------------------------------
//    - Start
//    - INIT VARS 
//      - current amount
//      - current year
//      - years 1st, 2nd, past year
//
//    - ask current amount
//    - ask current year
//    - ask first future year
//    - ask second future year
//
//    - ask past year
//      - if ( past year < current year )
//      - otherwise ask agian - must be less

import Java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    double currentAmount;
    int cYear, stYear, ndYear, pYear;
    
    Scanner uInput = new Scanner(System.in);
    
    System.out.print("The current amount is: ");
    currentAmount = uInput.nextDouble();
    System.out.println(currentAmount);
    
    System.out.print("The current year is: ");
    cYear = uInput.nextInt();
    System.out.println(cYear);

    System.out.print("Enter the first year: ");
    stYear = uInput.nextInt();
    System.out.println(stYear);

    System.out.print("Enter the second year: ");
    ndYear = uInput.nextInt();
    System.out.println(ndYear);
  
    System.out.print("Enter year from the past: ");
    pYear = uInput.nextInt();
    System.out.println(pYear);
    
  }


  public static double calcAmount(double cAmt,int oYr) {
    return cAmt ^ ((double)(oYr-cYear))
  }

}
