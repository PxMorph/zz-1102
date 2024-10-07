import java.util.Scanner;

public class RmWords {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    // get user's input here
    System.out.println("Enter sentence with 3 or more words");
    String sentence = userInput.nextLine();
    int noOfWord = noWords(sentence);
    getWords(sentence, noOfWord);
  }
  
  public static void getWords(String sentence, int noOfWord) {
    String [] words = new String[noOfWord];
    String getNL = sentence;
    for (int i = 0; i < noOfWord; i++) {
      int nextSpace = getNL.indexOf(' ');
      words[i] = getNL.substring(0,nextSpace);
      getNL = getNL.substring(nextSpace+1);
    }
    
    for (int i = 1; i < words.length-1; i++) {
      System.out.println(words[i]);
    }
  }

  public static int noWords(String sentence) {
    String getNL = sentence;
    //System.out.println(getNL.indexOf(' '));
    int count = 1;
    while (true) {
      // Stop if there is no words anymore
      if (getNL.indexOf(' ') == -1){
        break;
      }
      //System.out.println(getNL);

      // get the first thing we encountered
      int nextSpace = getNL.indexOf(' ');
      if (nextSpace != 0) {
        count++;
      }
      getNL = getNL.substring(nextSpace+1);
      //System.out.println(nextSpace);
    }
    return count;
  }
}
