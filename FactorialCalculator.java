import java.util.Scanner;

public class FactorialCalculator {
    
    // Method to get user input
    public static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        // Validate user input
        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
        
        return number;
    }
    
    // Method to calculate factorial
    public static long calculateFactorial(int number) {
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        // Get user input
        int number = getUserInput();
        
        // Calculate factorial
        long result = calculateFactorial(number);
        
        // Display result
        System.out.println("The factorial of " + number + " is: " + result);
    }
}
