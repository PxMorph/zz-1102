import java.util.Scanner;

public class CashierSystem {
  public static void main(String[] args) {
    initItems();
    startCS();
  }

  public static void initItems(){
    SupermarketItem ss001 = new SupermarketItem("ss001","Milo",4.50,6);
    SupermarketItem ss002 = new SupermarketItem("ss002","Indomie",1.5,3);
    SupermarketItem ss003 = new SupermarketItem("ss003","Coke Zero 1.5ml",2.5,6);
    SupermarketItem ss004 = new SupermarketItem("ss004", "Azmee Bread",2.0,5);
    SupermarketItem ss005 = new SupermarketItem("ss005", "Febreez", 5.50, 3);
    
  }

  public static void startCS() {
    /*
    Scanner userinput = new Scanner(System.in);
    String [] cart = new String[0];

    System.out.println("Enter productid: ");
    syste
    */
    System.out.println(ss001);
  }

  

}



