import java.util.Random;
import java.util.Scanner;

public class Computer_guess_number {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        System.out.println("Put down the number between 1 and 100 to let computer guess: ");
        int numberToGuess = scanner.nextInt();
        System.out.println("Computer! Guess the number!");
        int numberOfGuesses = 0;
        int num0 = 0;
        int num100 = 100;
        int numberGuessed = generator.nextInt(num0, num100);

        while (true) {
            if (numberToGuess == numberGuessed) {
                numberOfGuesses++;
                System.out.println("Congratulations! Your guessed the number " + numberOfGuesses + " times!");
                break;
            } else if (numberToGuess < numberGuessed) {
                numberOfGuesses++;
                System.out.println("The number " + numberGuessed + " is too big! Try again!");
                num100 = numberGuessed - 1;
                numberGuessed = generator.nextInt(num0,num100);
            } else {
                numberOfGuesses++;
                System.out.println("The number " + numberGuessed + " is too small! Try again!");
                num0 = numberGuessed + 1;
                numberGuessed = generator.nextInt(num0, num100);
            }
        }
    }
}
