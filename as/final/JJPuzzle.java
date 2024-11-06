public class JJPuzzle {
  public static void main(String[] args) {
    int [] puzzle = new int [20];
     
    start(puzzle);
    printJJ(puzzle);
    OnlyGreen(puzzle);
    OnlyYR(puzzle);
  }
  public static void start(int [] puzzle) {
    for (int i = 0; i < 20; i++) {
      puzzle[i] = randomColor();
    }
  }


  //Testing methods

  public static void printJJ(int [] puzzle) {
    for (int i = 0; i < 20; i++) {
      System.out.print(puzzle[i] + " | ");
    }
    System.out.println();
    System.out.println("0 = White | 1 = Yellow | 2 = Red | 3 = Green");
  }

  public static void dupeArray(int [] puzzle, int [] newPuzzle) {
    for (int i = 0; i < puzzle.length; i++) {
      newPuzzle[i] = puzzle[i];
    }
  }

  public static void OnlyGreen(int [] puzzle) {
    int [] ogPuzzle = new int [20];
    dupeArray(puzzle, ogPuzzle);
    int greencount = 20;
    for (int i = 0; i < ogPuzzle.length; i++) {
      if (ogPuzzle[i] != 3) {
        ogPuzzle[i] = 0;
        greencount = greencount - 1;
      }
    }
    System.out.println();
    System.out.println("OnlyGreen");
    printJJ(ogPuzzle);
    System.out.println("Total: " + greencount);
  }

  public static void OnlyYR(int [] puzzle) {
    int [] ogPuzzle2 = new int [20] ;
    dupeArray(puzzle, ogPuzzle2);
    int YRcount = 20;
    for (int i = 0; i < ogPuzzle2.length; i++) {
      if (ogPuzzle2[i] == 3) {
        ogPuzzle2[i] = 0;
        YRcount = YRcount -1;
      }
    }
    System.out.println();
    System.out.println("OnlyYR");
    printJJ(ogPuzzle2);
    System.out.println("Total: "+ YRcount);
  }

  public static int randomColor() {
    return (int)(Math.random() * 3.0 + 1.0);
  }

}
