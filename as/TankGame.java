public class TankGame {
  public static void main(String[] args) {
    startGame();
  }
  
  public static void startGame() {
    
  }

  public static int randomBall() {
    return (int)(Math.random * 5);
  }

  public static void printTanks(int t1, int t2, int t3, int mT) {
    System.out.println("[" + t1 + "] [" + t2 + "] [" + t3 + "] [" + mT + "]");
  }
}
