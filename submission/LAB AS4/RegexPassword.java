import java.util.Scanner;

public class RegexPassword {
  public static void main(String[] args) {
    getPasswordFromUser();
  }
  
  private static void getPasswordFromUser() {
    Scanner userInput = new Scanner(System.in);
    String password;

    while (true){
      System.out.println("Enter your password: ");
      password = userInput.nextLine();
      
      if (isValidPassword(password)) {
        System.out.println("Password accepted!");
        break;
      } else {
        System.out.println("Password must be at least 8 characters long, and contain letters, digits, and symbols.");
      }

    }
    
    userInput.close();
  }

  private static boolean isValidPassword(String password) {
    if (password.length() < 8) {
      return false;
    }

    boolean hasLetter = false;
    boolean hasDigit = false;
    boolean hasSymbol = false;

    for (char ch : password.toCharArray()) {
      if (Character.isLetter(ch)) {
        hasLetter = true;
      } else if (Character.isDigit(ch)) {
        hasDigit = true;
      } else {
        // Assuming the rest is a symbol.
        hasSymbol = true;
      }

      // if all condition all condition are already satisfied
      // break
      

      if (hasLetter && hasDigit && hasSymbol) {
        return true;
      }
    }
    

    // if not complete
    return false;
  }

}
