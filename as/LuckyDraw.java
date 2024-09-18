
/*
1) Implement a method to draw the two dice (random number can be assigned on each dice for
each draw)
2) Implement a method to calculate the addition of the dice value.
3) Implement a method to check the result of the addition such that:
 Check if the addition is equal to 12
 Check if the addition is bet.6-11
 Check if the addition is equal 2 to 5
 Check if the addition is others
4) Implement a method that assigns the lucky draw prizes to each category.
5) Implement a method that prints the result of the lucky draw.
6) Repeat the draw for the next round. The system terminates once the player hits -1.
*/

import java.util.Scanner;

public class LuckyDraw {
  public static void main(String[] args) {
    int skibidi = 0; // zero is default
    contSay("start");
    skibidi = assignDraw(drawDice());

  }
  
  public static int drawDice() {
    int d1 = rollDie();
    int d2 = rollDie();

    System.out.println("First Die: " + d1);
    contSay("continue");
    System.out.println("Second Die: " + d2);
    return addDices(d1, d2); // honest kinda time wastey
  }
  
  public static int addDices(int d1, int d2) {
    return d1 + d2;
  }

  public static int rollDie() {
    return (Math.random() * 6) + 1;
  }

  public static void assignDraw(int totalDice) {
    if (totalDice = 12) {
      return 1;
    } else if (totalDice < 6 || totalDice > 12) {
      return 2;
    } else if (totalDice < 1 || totalDice > 6) {
      return 3;
    } else {
      return 0;
    }
  }

  public static void printResult(int skibidi) {
    switch (skibidi) {
      case 1:
        sayReward("A Grand Price");
        break;
      case 2:
        sayReward("Second Price");
        break;
      case 3:
        sayReward("Third Price");
        break;
      default:
        //skibidi rizzz
        sayReward("Participant Reward (image w/ me <3)");
        break;
    }
  }

  public static void sayReward(string sR) {
    System.out.println("Congratulation your reward is " + sR);
  }

  public static void contSay(String cS) {
    System.out.println("press anything to " + cS);
    Scanner uInput = new Scanner(System.in);
    uInput.nextLine();
    uInput.close();
  }
}
