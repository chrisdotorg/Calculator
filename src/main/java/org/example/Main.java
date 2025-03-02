
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural Log (ln x)");
            System.out.println("4. Power Function (x^b)");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.squareRoot(num1));
                    break;
                case 2:
                    System.out.print("Enter an integer: ");
                    int num2 = scanner.nextInt();
                    System.out.println("Result: " + Calculator.factorial(num2));
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double num3 = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.naturalLog(num3));
                    break;
                case 4:
                    System.out.print("Enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Calculator.power(base, exponent));
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        scanner.close();
        System.out.println("Calculator closed.");
    }
}
