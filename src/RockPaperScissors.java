import java.util.Random;

import java.util.Scanner;


public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] plays = {"rock", "paper", "scissors"};

        int playerScore = 0;
        int computerScore = 0;

        while (true) {
            System.out.println("Enter your move (rock, paper, scissors, or quit): ");
            String playerMove = scanner.nextLine().toLowerCase();

            if (playerMove.equals("quit")) {
                break;
            }

            if (!playerMove.equals("rock") && !playerMove.equals("paper") && !playerMove.equals("scissors")) {
                System.out.println("Invalid input. Please enter rock, paper, or scissors.");
                continue;
            }

            int computerChoice = random.nextInt(3);
            String computerMove = plays[computerChoice];

            System.out.println("Computer's move: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if ((playerMove.equals("rock") && computerMove.equals("scissors")) ||
                    (playerMove.equals("paper") && computerMove.equals("rock")) ||
                    (playerMove.equals("scissors") && computerMove.equals("paper"))) {
                System.out.println("You win!");
                playerScore++;
            } else {
                System.out.println("Computer wins!");
                computerScore++;
            }

            System.out.println("Score: Your - " + playerScore + ", Computer - " + computerScore);
        }

        System.out.println("Final score: Your - " + playerScore + ", Computer - " + computerScore);
    }
}


