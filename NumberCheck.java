import java.util.Scanner;
public class NumberCheck {
    // Create the number check method
    public static void main(String[] args) {
        // Create a new scanner object
        Scanner sc = new Scanner(System.in);
        // Enter the number to check
        System.out.print("Enter a number: ");
        double number = sc.nextDouble();
        // Checking if the number is positive or negative
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

