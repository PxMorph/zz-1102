public class JJPuzzle {
  public static void main(String[] args) {
    int [] puzzle = new int [20]; // initial puzzle
    int [] storePuzzle = new int [20]; // storage puzzle (where the initial puzzle is modified)

    start(puzzle);
    showPuzzle(puzzle);
    OnlyGreen(puzzle, storePuzzle);
    OnlyYR(puzzle, storePuzzle);
    OnlyOdd(puzzle, storePuzzle);
    OnlyCouple(puzzle, storePuzzle);
  }

  // start initialising the puzzle
  public static void start(int [] puzzle) {
    // get random color on every block
    for (int i = 0; i < 20; i++) {
      puzzle[i] = randomColor();
    }
  }


  // print puzzle - based on the puzzle array input
  public static void showPuzzle(int [] puzzled) {
    System.out.print("| ");

    // prints every block
    for (int i = 0; i < 20; i++) {
      System.out.print(puzzled[i] + " | ");
    }

    System.out.println("\nKey:");
    System.out.println("0 = White | 1 = Yellow | 2 = Red | 3 = Green");

    // get the number of colors
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

  //reset the storage puzzle to match with initial puzzle
  public static void resetArray(int [] puzzle, int [] storePuzzle) {
    for (int i = 0; i < puzzle.length; i++) {
      storePuzzle[i] = puzzle[i];
    }
  }

  // Function for OnlyGreenn
  public static void OnlyGreen(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    int greencount = storePuzzle.length;
    // for anything that is not green, set to White
    // -1 if not green
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
  
  //function for only yellow and red
  public static void OnlyYR(int [] puzzle, int [] storePuzzle) {
    resetArray(puzzle, storePuzzle);
    int YRcount = storePuzzle.length;
    // for anything that green aka not red or green.
    // set to white
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
    // for every odd set to white
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
      // check every color block if the previous or next block is the same as the block.
      // then the color is a couple or tripple, woaw friiki
      if (i==0) { // at the start
        if (storePuzzle[i] == storePuzzle[i+1]) {} else {
          storePuzzle[i] = 0;
        }
      } else if (i==storePuzzle.length-1) {
        if (storePuzzle[i] == storePuzzle[i-1]) {} else {
          storePuzzle[i] = 0;
        }

      } else { // in between
        if (storePuzzle[i] == storePuzzle[i-1] || storePuzzle[i] == storePuzzle[i+1]) {} else {
          storePuzzle[i] = 0;
        }

      }
    }
    System.out.println();
    System.out.println("OnlyCouple");
    showPuzzle(storePuzzle);

  }
  // return random number from 1 to 3. exclude 0/white
  public static int randomColor() {
    return (int)(Math.random() * 3.0 + 1.0);
  }

}
