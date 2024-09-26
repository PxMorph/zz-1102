import java.util.Scanner;

public class TowerGame {
  public static void main(String[] args) {
    playGame();
  }

  public static void playGame(){
    boolean session = true;
    int p1 = 0;
    int p2 = 0;

    while(session == true){
      p1 += playerMove("Player 1");
      p1 = zeroError(p1);
      printPos(p1,p2);
      if (p1 > 9) {
        session = false;
      }
      p2 += playerMove("Player 2");
      p2 = zeroError(p2);
      printPos(p1,p2);
      if (p2 > 9) {
        session = false;
      }
    }
    if(p1>p2){
      System.out.println("Player 1 WINS!!");
    } else {
      System.out.println("Player 2 WINS!!");
    }
  }

  public static int playerMove(String player) {
    Scanner uinput2 = new Scanner(System.in);
    System.out.println("\nIts " + player + " turn! Enter to continue");
    uinput2.nextLine();

    int val1 = genRandom();
    int val2 = genRandom();
    System.out.println(player + " rolled a " + val1 + " and " + val2 + "\n total:" + (val1 + val2) );

    return checkEven(val1+val2);
  }

  public static int checkEven(int sumNum){
    if(sumNum % 2 == 0){
      return 1;
    } else {
      return -1;
    }
  }

  public static int zeroError(int pN) {
    if(pN < 0){
      return 0;
    } else {
      return pN;
    }
  }

  public static int genRandom(){
    return (int)(Math.random() * 10) + 1;
  }

  //prints the position of player's floor
  public static void printPos(int p1f, int p2f){
    System.out.println("Player 1 [" + p1f + "] || Player 2 [" + p2f + "]");
  }

}
