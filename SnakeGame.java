
package game;
import java.util.Scanner;

public class SnakeGame {



public static void main(String[] args) {
   
   // creates an object of Scanner
      Scanner input = new Scanner(System.in);

    System.out.print("Enter player name: ");

    // takes input from the keyboard
    String name = input.nextLine();
      GameFrame G = new GameFrame();
G.setTitle("Snake Game--------------"+"Player :"+name);
     //new GameFrame();
 game g = new game();
g.setVisible(true);

	}

}
