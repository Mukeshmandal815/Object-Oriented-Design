/**
 * Represents a simple Calculator responsible for basic arithmetic operations.
 */
class Calculator {
    /**
     * Adds two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the addition operation.
     */
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Subtracts one number from another.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the subtraction operation.
     */
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * Multiplies two numbers.
     *
     * @param num1 The first number.
     * @param num2 The second number.
     * @return The result of the multiplication operation.
     */
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    /**
     * Divides one number by another.
     *
     * @param num1 The dividend.
     * @param num2 The divisor (must be non-zero).
     * @return The result of the division operation.
     */
    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) num1 / num2;
    }
}

/**
 * A simple demonstration of the Calculator class.
 */
public class Sigle_Resposibility_Principle {
    public static void main(String[] args) {
        // Perform basic arithmetic operations
        int result1 = Calculator.add(5, 3);
        int result2 = Calculator.subtract(10, 7);
        int result3 = Calculator.multiply(4, 6);
        double result4 = Calculator.divide(20, 5);

        // Display results
        System.out.println("Addition result: " + result1);
        System.out.println("Subtraction result: " + result2);
        System.out.println("Multiplication result: " + result3);
        System.out.println("Division result: " + result4);
    }
}

/**
 * This example demonstrates the Single Responsibility Principle (SRP) by having the Calculator class
 * responsible solely for performing basic arithmetic operations. Each method in the Calculator class
 * has a single responsibility related to a specific arithmetic operation. This ensures that the
 * Calculator class is focused and easily maintainable, as each method is responsible for only one task.
 */
