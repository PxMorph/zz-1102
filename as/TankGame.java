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


/*
  todo task
  - start
  - storage x
  - init tanks
  - random ball for each tanks
  - move ball
  
  - start
  - select tank
  - if i = 1, 2 ,3
  - check i+1 except 3+1
  - tank is !full
  - input amt 
  - check i+1 except 3+1
  - tank is !overflown
  - print tank
  - check sum of all mini tanks = 0
  - game over
  
*/



import java.util.Scanner;
import java.util.Formatter;

public class TankGame {
  public static void main(String[] args) {
    startGame();
  }


  public static int[] genTank(int[] miniTanks) {
    int amtMTank = 3;
    for (int i = 0; i < amtMTank; i++) {
      miniTanks[i] = (int)(Math.random() * 5);
    }
    return miniTanks;
  }

  public static void startGame() {
    int [] mTanks = new int[3];
      mTanks = genTank(mTanks);
    int mainTank = 0;
    Scanner uInput1 = new Scanner(System.in);
    
    while (true) {
      printTanks(mTanks, mainTank);
      if(!hasValue(mTanks)){
        System.out.println("GameOver!!!");
        break;
      }
      System.out.println("which tank of the ball you want to move:-");
      System.out.println("1. Mini Tank 1 -> Mini Tank 2");
      System.out.println("2. Mini Tank 2 -> Mini Tank 3");
      System.out.println("3. Mini Tank 3 -> Main Tank");
      System.out.print("Enter: ");
      int uI1 = uInput1.nextInt();
      if (uI1 > 3) {} else {
       if (uI1 == 3 || !full(mTanks[uI1])) {
          System.out.println("Amount of ball to move: ");
          int uI2 = uInput1.nextInt();
          if(uI1 == 3){
            if (!oobBall(mTanks[uI1-1], uI2)) {
              mainTank += uI2;
              mTanks[uI1-1] = mTanks[uI1-1] - uI2;
            } else {

            }
          }
          // check if ball is more than the cap
          if (uI1 != 3 && !overflown(mTanks[uI1], uI2)){
            // check if the ball requested is out bound
            if(!oobBall(mTanks[uI1-1], uI2)) {
              System.out.println("test");
              mTanks[uI1-1] = mTanks[uI1-1] - uI2;
              mTanks[uI1] += uI2;
            } else {
              System.out.println("Error: You selected to move more ball than that is available\n");
            } 
          } else if (uI1 != 3) {
            System.out.println("Error: There is not enough capacity to make the move\n");
          }
        } else {
          System.out.println("Error: capacity is full\n");
        }
      }
    }
  }

  public static boolean hasValue(int [] mT) {
    int val = 0;
    for (int i = 0; i < 3; i++) {
      val += mT[i];
    }
    if(val != 0){
      return true;
    } else {
      return false;
    }
  }

  public static boolean full(int mTnext) {
    if(mTnext == 5){
      return true;
    } else {
      return false;
    }
  }

  public static boolean overflown(int mTnext, int ballsIn) {
    if((mTnext + ballsIn) > 5){
      return true;
    } else {
      return false;
    }
  }

  public static boolean oobBall(int mT, int ballsIn) {
    if(mT < ballsIn){
      return true;
    } else {
      return false;
    }
  }

  public static void printTanks(int [] mt, int maint) {
    for (int i = 0; i < 3; i++) {
      System.out.format("Mini Tank:%2d [%2d]\n", i+1, mt[i] );
    }
    System.out.format("Main Tank:   [%2d]\n", maint);
  }

  

}
