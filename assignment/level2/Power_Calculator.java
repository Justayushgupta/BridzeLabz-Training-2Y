import java.util.Scanner;

public class Power_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get integer input for number and power
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the power (positive integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Please enter a positive integer for power.");
            return;
        }

        int result = 1;

        // Loop to compute power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Output the result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
