
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
    contSay("start");
     drawDice();

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



  public static void printResult() {
    
  }

  public static void contSay(String cS) {
    System.out.println("press anything to " + cS);
    Scanner uInput = new Scanner(System.in);
    uInput.nextLine();
    uInput.close();
  }
}
