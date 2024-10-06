import java.util.Scanner;
import java.util.Random;

class Game {
    private int numberToGuess;
    private int numberOfTries;
    private boolean hasWon;

    // Constructor to initialize the game
    public Game() {
        Random random = new Random();
        numberToGuess = random.nextInt(100); // Random number between 1 and 100
        numberOfTries = 0;
        hasWon = false;
    }

    // Method to start the game
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Welcome to 'Guess the Number'!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        while (!hasWon && numberOfTries < 10) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else if (guess > numberToGuess) {
                System.out.println("Too high!");

            } else {
                hasWon = true;
            }
        }


        if (hasWon) {
            System.out.println("Congratulations! You've guessed the number " + numberToGuess + " in " + numberOfTries + " tries.");
        } else {
            System.out.println("Game Over! You've used all your attempts. The correct number was " + numberToGuess + ".");
        }
    }


}

// exercise 03 Guess the Number
public class CWH_ch9_OOPs_exe3 {
    public static void main(String[] args) {
      /*
      Create the Class Game ,which allows a user to play "Guess the Number"
      games once .Games have the following method
      1.Constructor to generate the number
      2.TakeUserInput() to take user input  Of nUmber
      3.isNumberCorrect() to detect whether the number entered by user is true.
      Use Properties such as noOfGuesses(int) etc to get this task done
      4. getters and Setters for noOfGuesses


       */
        Game game = new Game();
        game.start();
    }
}
