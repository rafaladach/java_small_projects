import java.util.Scanner;

public class bmi_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your height in meters?");
        double height = scanner.nextDouble();
        System.out.println("What is your weight in kilograms?");
        double weight = scanner.nextDouble();
        double BMI = calculate(height, weight);
        System.out.format("Your BMI index is: %-10.2f%n", BMI);

    }

    static double calculate(double height, double weight) {
        return weight / (height * height);
    }
}
