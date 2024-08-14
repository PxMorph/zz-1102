import java.util.Scanner;
public class Eldest {
  public static void main(String [] args) {
    int fstu = 0; int lstu = 0;
    Scanner fStudent = new Scanner(System.in);
    System.out.println("First student age: ");
    fstu = fStudent.nextInt();
    
    Scanner lStudent = new Scanner(System.in);
    System.out.println("Second student age: ");
    lstu = lStudent.nextInt();
    
    // System.out.println("Mr Skibidi the GYAATT is "+Math.max(fstu, lstu)+" Years Old");
    System.out.println(Math.max(fstu, lstu));
  }
}
