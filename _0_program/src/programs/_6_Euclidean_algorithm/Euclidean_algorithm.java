package programs._6_Euclidean_algorithm;

import java.util.Scanner;

public class Euclidean_algorithm {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What are the numbers x and y? ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("The greatest common divisor is: " + NWD(x, y));
    }

    static int NWD(int x, int y) {
        do {
            if (x > y) {
                x = x -y;
            }
            else if (x < y) {
                y = y - x;
            }
            else {
                return x;
            }
        } while (x != y);
        return x;
    }
}
