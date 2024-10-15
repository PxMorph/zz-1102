import java.util.Scanner;

public class repeatChar2 {
  public static void main(String[] args) {
    //init Scanner
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);

    //Get user userInput
    System.out.println("Enter a Word: ");
    String word = userInput.nextLine();
    System.out.println("Entered the desired repeated length: ");
    int rlength = userInput2.nextInt();

    // Activate the method for beads
    System.out.println(beads(word, rlength));

    userInput.close(); userInput2.close();
  }

  private static String beads(String s, int n) {
    if(!checkBeads(s,n)){
      s.substring(n)
    } else {

    }
  }

  private static boolean checkBeads(String s, int n) {
    if (s.length() is >= n ) {
      return true;
    }
    return false;
  }
}
