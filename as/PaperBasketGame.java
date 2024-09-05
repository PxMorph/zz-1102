/* 

   What the game should do? To throw the paper ball into the basket. A warning will appear if the paper
ball does not go into the basket due to its size or overshoot. Write the following methods in your
program:

1) void startThrow( double pb_r, double b_r, double b_h, double distance) - this method accepts
the radius of the paper ball, radius of basket, height of basket , distance throw.

2) void calculateThrow(double pb_r, double b_r, double b_h, double distance)- this method
accepts the radius of the paper ball, radius of basket, height of basket , distance throw. This
method also calculates the volume of the ball and the basket.

3) void shoot(double vol_pb, double vol_ b, distance throw ) – this method accepts the volume of
paper ball, volume of basket and the distance thrown by the player. This method checks if the
ball gets into the basket such that the volume of the ball is smaller than the volume of the
basket and must be within the correct distance.

4) void print_result(boolean result) – prints the word goal to indicate paper ball goes in the basket
or otherwise.

*/

/*
radius of ball
radius of basket
height of basket
distance throw
volume of paper ball
volume of basket
boolean of in or miss

1. userinput
	2. radius of paper ball
	3. radius of basekt
	4. height of basket
	5. distance being thrown
2. start throw
	1. recieve
		1. radius of paper ball
		2. radius of basket
		3. height of basket
		4. distance throw
	2. distance is for carry over to other methods?
3. calculate throw
	1. calc
		1. vol of paperball
		2. vol of basket
	2. distance is for carry over still??
4. shoot
	1. calc paperball vol < basket vol 
	2. distanceT = distance of PB --> Basket
5. get result
	1. print goal
	2. print miss
	3. print over-size
	5. Err Priority "Miss --> Over-size"

### to win
paperball vol < basket vol
distance thrown must be correct distance

### Possible Userinputs
radius of paper ball
radius of basket
height of basket
distance thrown

## formulae
volume of Cylinder
$$ V = \pi r^2h $$
volume of Sphere
$$ V = \frac{4}{3}\pi r^3 $$
*/

import java.util.Scanner;

public class PaperBasketGame {
  public static void main(String[] args) {

    // Create new object scanner
    Scanner userInput = new Scanner(System.in);

    // Start initialising the variables
    double rBall, rBasket, hBasket, dThrown;

    System.out.print("Radius of paperball: ");
    // Assign the ball radius value
    rBall = userInput.nextDouble();
    
    System.out.print("Radius of basket: ");
    // Assign the basket radius
    rBasket = userInput.nextDouble();
    
    System.out.print("Height of basket: ");
    // Assign the height of the basket
    hBasket = userInput.nextDouble();
    
    System.out.print("The distance the paperball is thrown (cm): ");
    // Assign distance thrown values
    dThrown = userInput.nextDouble();
    

    // Call startthrow method
    startThrow(rBall, rBasket, hBasket, dThrown);

  }

  public static void startThrow( double pb_r, double b_r, double b_h, double distance) {
    calculateThrow(pb_r,b_r,b_h,distance);  
  }

  public static void calculateThrow( double pb_r, double b_r, double b_h, double distance ) {
    shoot(
        // calculate paperball vol
        (4/3)*Math.PI * Math.pow(pb_r,3),
        // calculate basket vol
        Math.PI * Math.pow(b_r,2) * b_h,
        // carry over distance 
        distance
        );
  }

  public static void shoot( double vol_pb, double vol_b, double distance ) {
    if(vol_pb < vol_b && distance == 100){
      print_result(true);
    } else if (vol_pb > vol_b && distance == 100) {
      System.out.println("Oversized PaperBall!");
      print_result(false);
    } else {
      System.out.println("Overshoot!");
      print_result(false);
    }
  }

  public static void print_result(boolean result) {
    if(!result){
      System.out.println("WOMP WOMP");
    } else {
      System.out.println("GOAL!!!");
    }
  }
}
