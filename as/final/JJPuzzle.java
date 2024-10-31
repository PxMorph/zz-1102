public class JJPuzzle {
  public static void main(String[] args) {
    String [] puzzle;
  
    start(puzzle);
    print(puzzle);
  }

  public static void start(String [] puzzle) {
    puzzle = new String[20];
    for (int i = 0; i < 20; i++) {
      puzzle[i] = randomColor();
    }
  }


  //Testing methods

  public static void printJJ(String [] puzzle) {
    for (int i = 0; i < 20; i++) {
      System.out.print(puzzle[i] + " | ");
    }
  }

  //Other methods

  public static String randomColor() {
    int random = ((int)(Math.random()) * 3) + 1;
    switch (random) {
      case 1:
        return "yellow";
        break;

      case 2:
        return "red";
        break;

      case 3:
        return "green";
      default:
        break;
    }
  }
}
