package test.java;

public class RemainderCalculatorTest {
    public static void main(String[] args) {
        testCalculateAndDisplayRemainder(10, 3, 1);

        testCalculateAndDisplayRemainder(10, 1, 0);

        testCalculateAndDisplayRemainder(0, 5, 0);

        testCalculateAndDisplayRemainder(3, 5, 3);

        // Test case 5: Negative dividend
        testCalculateAndDisplayRemainder(-10, 3, -1);

        // Test case 6: Negative divisor
        testCalculateAndDisplayRemainder(10, -3, 1);

        // Test case 7: Both negative
        testCalculateAndDisplayRemainder(-10, -3, -1);
    }

    // Method to test calculateAndDisplayRemainder
    public static void testCalculateAndDisplayRemainder(int dividend, int divisor, int expectedRemainder) {
        int actualRemainder = dividend % divisor;
        if (actualRemainder == expectedRemainder) {
            System.out.println("Test passed for dividend: " + dividend + ", divisor: " + divisor);
        } else {
            System.out.println("Test failed for dividend: " + dividend + ", divisor: " + divisor +
                    ". Expected: " + expectedRemainder + ", but got: " + actualRemainder);
        }
    }
}
