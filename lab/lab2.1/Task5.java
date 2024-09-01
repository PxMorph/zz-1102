// Write a program that accepts the unit weight of a bag of Sugar in Kilograms 
// the number of bags sold and displays the total price of the sale, computed as
// totalPrice = unitWeight * numberOfUnits * 5.99;
// totalPriceWithTax = totalPrice + totalPrice * 0.0725;

// where 5.99 is the cost per Kg and 0.0725 is the sales tax. Display the result in the following manner:

// SAMPLE

// Please enter the number of bags: 32
// Please enter the weight per bag (in Kg): 5
// Price per Kg: $5.99
// Sales tax: 7.25%
// Total price: $ 1027.884

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        double noBags , wKg;
        double perKg = 5.99;
        double saleTax = 0.0725;
        
        Scanner uInput = new Scanner(System.in);
        
        System.out.print("Please enter the number of bags: ");
        noBags = uInput.nextDouble();

        System.out.print("Please enter the weight per bag (in Kg): ");
        wKg = uInput.nextDouble();

        System.out.println("Price per Kg: $" + perKg);
        System.out.println("Sales tax: " + (saleTax * 100));
        // System.out.printf(  saleTax*100 + "%%" );

        System.out.print("Total price: $" + calcPrices(noBags, wKg, perKg, saleTax));

    }
    
    public static double calcPrices( double bag , double kg , double monei, double tax) {
        double totalprice = kg * bag * monei;
        return totalprice + (totalprice * (tax));
    }
}
