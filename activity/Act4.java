import java.util.Scanner;

public class Act4 {
    public static void main(String [] args) {
        
        // init scanner object
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to a game of ROCK PAPER SISSOR");
        System.out.println("Player 1 : R - Rock | P - Paper | S - Sissor");

        // get player 1 input
        char p1c = input.next().toLowerCase().charAt(0);
        System.out.println("Player 2 : R - Rock | P - Paper | S - Sissor");

        // get player 2 input
        char p2c = input.next().toLowerCase().charAt(0);

        System.out.println(checkWinner( p1c, p2c));

    }
    
    // Check Winner Method
    public static String checkWinner( char p1 , char p2) {
        
        // prevents the code from being madd RAHHHHH
        // Init the variable that can return  
        String ans = "skibidi explode";

        // Tie Condition
        if ( p1 == p2) {
            ans = "Both player are tied";
        }

        //Player 1 Wins Conditions
        if ( p1 == 'r' && p2 == 's') {
            ans = "Player 1 Wins";
        }

        if ( p1 == 'p' && p2 == 'r') {
            ans = "Player 1 Wins";
        }

        if ( p1 == 's' && p2 == 'p') {
            ans = "Player 1 Wins";
        }

        //Player 2 Wins Conditions
        if ( p1 == 'r' && p2 == 'p') {
            ans = "Player 2 Wins";
        }

        if ( p1 == 'p' && p2 == 's') {
            ans = "Player 2 Wins";
        }

        if ( p1 == 's' && p2 == 'r') {
            ans = "Player 2 Wins";
        }
        

        return ans;


    }
}
