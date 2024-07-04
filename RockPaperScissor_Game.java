import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor_Game {
    public static void main(String[] args) {
        // Array of options for the game
        String[] choices = {"rock", "paper", "scissors"};

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Random object to generate computer's choice
        Random random = new Random();

        while (true) {
            // Ask the user to choose
            System.out.print("Enter your choice (rock, paper, or scissors): ");
            String userChoice = scanner.nextLine().toLowerCase();

            // Check if the user input is valid
            if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.println("Invalid input! Please enter rock, paper, or scissors.");
                continue;
            }

            // Generate a random index to get computer's choice
            int randomIndex = random.nextInt(choices.length);
            String computerChoice = choices[randomIndex];

            // Display the choices
            System.out.println("You chose: " + userChoice);
            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                    (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }

            // Ask if the user wants to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.nextLine().toLowerCase();

            if (!playAgain.equals("yes")) {
                break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}
