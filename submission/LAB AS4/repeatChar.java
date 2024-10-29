import java.util.Scanner;

public class repeatChar {
  public static void main(String[] args) {
    // Init Scanner
    Scanner userInput = new Scanner(System.in);
    Scanner userInput2 = new Scanner(System.in);

    //get user userInput
    System.out.println("Enter a word: ");
    String skibidi = userInput.nextLine();
    System.out.println("Enter how many time to repeat the character: ");
    int noTime = userInput2.nextInt();

    System.out.println(tape(skibidi, noTime));

    userInput.close(); userInput2.close();
  }

  public static String tape(String s, int n) {
    String newWord = "";
    for (int i = 0; i < s.length(); i++) {
      for (int d = 0; d < n; d++) {
        newWord = newWord + s.charAt(i);
      }
    }
    return newWord;
  }
}
