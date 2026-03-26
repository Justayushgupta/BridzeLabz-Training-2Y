import java.util.Scanner;

public class Calculator_SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input variables
        System.out.print("Enter first number: ");
        double first = sc.nextDouble();

        System.out.print("Enter second number: ");
        double second = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        String op = sc.next();

        System.out.print("Enter number of operations: ");
        int number = sc.nextInt();

        // Loop for number of operations
        for (int i = 1; i < number; i++) {
            double result;
            switch (op) {
                case "+":
                    result = first + second;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = first - second;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = first * second;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    if (second != 0) {
                        result = first / second;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Division by zero error.");
                    }
                    break;
                default:
                    System.out.println("Invalid Operator");
            }
        }
        
    }
}
