// # Write ups
//
// ## Features
// 1. replay prompt
// 2. each small tanks generates balls 0 < 6
// 3. move to nearest tanks
// 4. max 5 ball capacity
// 5. game ends when all balls moved to the main tanks
//
// ## Features break down
// 1. - ask using if they want to replay
// 2. - all mini tank generates balls
// 3. - tanks can only move to the side which is closer to the main tanks
//    - be it down or the the right
// 4. - when attempting to move the ball from an initial mini tanks to the one closer to main tank.
//      check for if the tank closer to the main tank still have slots.
//      else must clear it out first.
//      <- which means the user must move the the tanks with the balls first
// 5. - end the game with all the ball is inside

import java.util.Scanner;

public class TankGame {
  public static void main(String[] args) {
    boolean game = false;
    Scanner uInput1 = new Scanner(System.in);
    while (!game) {
      // startGame();
      int uiStart;
      while (true) {
        System.out.print("Enter Value: ");
        uiStart = uInput1.nextInt();
        if (uiStart != 1 || uiStart != 2) {
          System.out.println("Please Enter the either 1 or 2");
        } else {
          break;
        }
      }
    }
  }
  
  public static void startGame() {
    int[] smallTanks = {randomBall(), randomBall(), randomBall()};
    int mainTank = 0;
    
    

  }

  public static int randomBall() {
    // start from generate a range of 0-5 balls
    return (int)(Math.random() * 5);
  }

  public static void printTanks(int t1, int t2, int t3, int mT) {
    System.out.println("[" + t1 + "] [" + t2 + "] [" + t3 + "] [" + mT + "]");
  }
}
