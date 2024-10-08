import java.util.Scanner;

public class RmWords {
  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    
    // get user's input here
    System.out.println("Enter sentence with 3 or more words");
    String sentence = userInput.nextLine();
    int noOfWord = noWords(sentence);
    if(noOfWord >= 3){
      getWords(sentence, noOfWord);
    } else {
      System.out.println("You need to type 3 or more words!!");
    }
  }
  
  public static void getWords(String sentence, int noOfWord) {
    String [] words = new String[noOfWord];
    String getNL = sentence;
    for (int i = 0; i < noOfWord; i++) {
      int nextSpace = getNL.indexOf(' ');
      if (nextSpace > 0) {
        words[i] = getNL.substring(0,nextSpace);
      } else if (nextSpace < 0) {
        words[i] = getNL.substring(0);
      }
      getNL = getNL.substring(nextSpace+1);
    }
    
    //Prints all the words
    for (int i = 0; i < words.length; i++) {
      System.out.println(words[i]);
    }
  }

  // finding total of words for checking
  // also for the arraying
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
    }
    return count;
  }
}
