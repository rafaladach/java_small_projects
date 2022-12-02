import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {

        Random generator = new Random();
        int number = generator.nextInt(100);
        int guessPoint = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Guess the number between 1-100: ");

        while (true) {
            int guessNumber = scanner.nextInt();

            if (guessNumber == number) {
                guessPoint++;
                System.out.println("Congratulations! You guessed the number " + guessPoint + " times!");
                System.out.println("Do you want to play again(YES/NO)?");
                String play = scanner.next();
                if (play.equals("NO")) {
                    break;
                } else if (play.equals("YES")){
                    System.out.println("Play again!");
                    number = generator.nextInt(100);
                    guessPoint = 0;
                } else {
                    System.out.println("You didn't answer correct (YES/NO)! The game will stop.");
                    break;
                }

            } else if (guessNumber < number) {
                System.out.println("The number is too small. Try again: ");
                guessPoint++;
            } else {
                System.out.println("The number is too big. Try again: ");
                guessPoint++;
            }

        }

    }
}
