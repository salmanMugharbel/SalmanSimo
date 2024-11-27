import java.util.Scanner;

public class RemainderCalculator {
    public static void main(String[] args) {
        // Get input numbers
        int[] numbers = getInput();

        // Calculate and display the remainder
        calculateAndDisplayRemainder(numbers[0], numbers[1]);
    }

    // Method to get input from the user
    public static int[] getInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        return new int[] { dividend, divisor };
    }

    // Method to calculate and display the remainder
    public static void calculateAndDisplayRemainder(int dividend, int divisor) {
        int remainder = dividend % divisor;
        System.out.println("The remainder when " + dividend + " is divided by " + divisor + " is: " + remainder);
    }
}
