import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        System.out.println("Hi there, welcome to Try Guess");

        Scanner userInput = new Scanner(System.in);
        String playAgain;

        do {
            Random random = new Random();
            int userAttempt = 0;
            int defaultAttempt = 5;
            int randomNum = random.nextInt(100) + 1;

            System.out.println("You have " + defaultAttempt + " attempts to guess a number between 1 and 100!");

            while (userAttempt < 5) {
                System.out.println("What's your guess?");

                if (userInput.hasNextInt()) {
                    int num = userInput.nextInt();

                    if (num == randomNum) {
                        userAttempt++;
                        System.out.println("Computer's number was " + randomNum);
                        System.out.println("You guessed it right in " + userAttempt + " attempts!");
                        break;
                    } else if (num > randomNum) {
                        userAttempt++;
                        System.out.println("The number you entered is too high. You have used " + userAttempt + " attempts!");
                    } else if (num < randomNum) {
                        userAttempt++;
                        System.out.println("The number you entered is too low. You have used " + userAttempt + " attempts!");
                    }

                    if (userAttempt == 5) {
                        System.out.println("Sorry, you've used all your attempts. The correct number was " + randomNum);
                    }
                } else {
                    System.out.println("Please enter a valid number.");
                    userInput.next();
                }
            }

            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (yes or no)");
            playAgain = userInput.next().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing! Goodbye!");
        userInput.close();
    }
}
