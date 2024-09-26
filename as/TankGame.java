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
import java.util.Formatter;

public class TankGame {
  public static void main(String[] args) {
    public int[] smallTanks = {};
    public mainTank = 0;
    smallTanks[] = initGame();
    startGame();
  }
  
  public static void initGame() {
    for (int i = 0; i < 3; i++) {
      smallTanks[i] = randomBall();
    }
  }
  
  public static void startGame() {
    while(true){
      
    }
  }

  public static int randomBall() {
    // start from generate a range of 0-5 balls
    return (int)(Math.random() * 5);
  }

  public static void printTanks(int[] smallTanks) {
    for (int i = 0; i < smallTanks.lengths; i++) {
      System.out.format("Mini Tank:%1d [%3d]", i, smallTanks[i]);
    }
  }
}
