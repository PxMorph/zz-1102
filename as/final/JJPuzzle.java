public class JJPuzzle {
  public static void main(String[] args) {
    int [] puzzle = new int [20];
    int [] storePuzzle = new int [20]; 

    start(puzzle);
    showPuzzle(puzzle);
    OnlyGreen(puzzle, storePuzzle);
    OnlyYR(puzzle, storePuzzle);
    OnlyOdd(puzzle, storePuzzle);
    OnlyCouple(puzzle, storePuzzle);
  }
  public static void start(int [] puzzle) {
    for (int i = 0; i < 20; i++) {
      puzzle[i] = randomColor();
    }
  }


  //Testing methods

  public static void showPuzzle(int [] puzzled) {
    System.out.print("| ");
    for (int i = 0; i < 20; i++) {
      System.out.print(puzzled[i] + " | ");
    }
    System.out.println("\nKey:");
    System.out.println("0 = White | 1 = Yellow | 2 = Red | 3 = Green");
    int ny = 0; int nr = 0; int ng = 0;
    for (int i = 0; i < puzzled.length; i++) {
      if (puzzled[i] == 1) {
        ny++;
      } else if (puzzled[i] == 2) {
        nr++;
      } else if (puzzled[i] == 3) {
        ng++;
      } 
    }
    System.out.println("Total:- \nYellow:"+ ny + ", Red:"+ nr + ", Green:" + ng);


  }

  public static void resetArray(int [] puzzle, int [] storePuzzle) {
    for (int i = 0; i < puzzle.length; i++) {
      storePuzzle[i] = puzzle[i];
    }
  }

  public static void OnlyGreen(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    int greencount = 20;
    for (int i = 0; i < storePuzzle.length; i++) {
      if (storePuzzle[i] != 3) {
        storePuzzle[i] = 0;
        greencount = greencount - 1;
      }
    }
    System.out.println();
    System.out.println("OnlyGreen");
    showPuzzle(storePuzzle);
    System.out.println("Total: " + greencount);
  }

  public static void OnlyYR(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    int YRcount = 20;
    for (int i = 0; i < storePuzzle.length; i++) {
      if (storePuzzle[i] == 3) {
        storePuzzle[i] = 0;
        YRcount = YRcount -1;
      }
    }
    System.out.println();
    System.out.println("OnlyYR");
    showPuzzle(storePuzzle);
    System.out.println("Total: "+ YRcount);
  }

  public static void OnlyOdd(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    for (int i = 0; i < storePuzzle.length; i++) {
      if ((i%2)!=0) {
        storePuzzle[i] = 0;
      } 
     }
    System.out.println();
    System.out.println("OnlyOdd");
    showPuzzle(storePuzzle);
  }

  public static void OnlyCouple(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    for (int i = 0; i < storePuzzle.length; i++) {
      if (i==0) {
        if (storePuzzle[i] == storePuzzle[i+1]) {} else {
          storePuzzle[i] = 0;
        }
      } else if (i==storePuzzle.length-1) {
        if (storePuzzle[i] == storePuzzle[i-1]) {} else {
          storePuzzle[i] = 0;
        }

      } else {
        if (storePuzzle[i] == storePuzzle[i-1] || storePuzzle[i] == storePuzzle[i+1]) {} else {
          storePuzzle[i] = 0;
        }

      }
    }
    System.out.println();
    System.out.println("OnlyCouple");
    showPuzzle(storePuzzle);

  }
  public static int randomColor() {
    return (int)(Math.random() * 3.0 + 1.0);
  }

}
