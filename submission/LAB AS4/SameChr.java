import java.util.Scanner;

public class SameChr {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    //get userinput here
    System.out.println("Enter a word here: ");
    String word = userInput.nextLine();
    
    if (!checkSpace(word)) {
      checkLetter(word);
    } else {
      System.out.println("Erms wada sigma! no spaces please! make sure its a word not a sentence");
    }

  }

  public static void checkLetter(String wordGH) {
    String wordLC = wordGH.toLowerCase();

    //first char 
    char firstChar = wordLC.charAt(0);
    // Get word last char
    char lastChar = wordLC.charAt(wordLC.length()-1);

    // Check skibidi first letter and last letter
    if(firstChar == lastChar){
      System.out.println("The word have the same letter for both start and end");
    } else {
      System.out.println("Not Same same");
    }
  }

  public static boolean checkSpace(String wordGH) {
    if (wordGH.indexOf(' ') > -1) {
      return true;
    }
    return false;
  }
}
