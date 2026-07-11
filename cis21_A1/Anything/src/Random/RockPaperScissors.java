package Random;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.print("Enter your choice (rock, paper, scissors): ");
            String[] choice = {"rock", "paper", "scissors"};

            String ComputerChoice = choice[new Random().nextInt(choice.length)];

            String UserChoice;

            while (true) {
                UserChoice = scanner.nextLine().toLowerCase();

                if (UserChoice.equals("rock") || UserChoice.equals("paper") || UserChoice.equals("scissors")) {
                    break;
                }

                System.out.println(UserChoice + " is not a valid choice.");
                System.out.println("Please enter rock, paper, or scissors: ");
            }

            System.out.println("Computer played: " + ComputerChoice);

            if (UserChoice.equals(ComputerChoice)) {
                System.out.println("The game is a tie.");
            } else if (UserChoice.equals("rock")) {
                if (ComputerChoice.equals("paper")) {
                    System.out.println("You lost.");
                } else if (ComputerChoice.equals("scissors")) {
                    System.out.println("You win.");
                }
            } else if (UserChoice.equals("scissors")) {
                if (ComputerChoice.equals("paper")) {
                    System.out.println("You Win.");
                } else if (ComputerChoice.equals("rock")) {
                    System.out.println("You lost.");
                }
            } else if (UserChoice.equals("paper")) {
                if (ComputerChoice.equals("rock")) {
                    System.out.println("You Win.");
                } else if (ComputerChoice.equals("scissors")) {
                    System.out.println("You lost.");
                }
            }

            System.out.print("Play Again (yes/no): ");

            String PlayAgain = scanner.nextLine().toLowerCase();

            if (!PlayAgain.equals("yes")) {
                break;
            }

        }
        scanner.close();
    }
}
