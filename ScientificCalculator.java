import java.util.Scanner;
import java.util.InputMismatchException; // Needed for handling non-numeric input
public class ScientificCalculator {
    // You might declare constants here, like PI or E
    public static void main(String[] args) {
// Create Scanner object
        Scanner inputScanner = new Scanner(System.in);
        boolean flag = true;
// Loop for continuous calculator operation (while loop)
        while (flag) {
            // Display menu (call displayMenu() method)
            displayMenu();
            System.out.print("Enter your choice (1-8 or 0 to exit): ");
            try {
                int choice = inputScanner.nextInt();
                switch (choice) {
                    case 0:
                        flag = false;
                        break;
                    case 1:
                        performAddition(inputScanner);
                        break;
                    case 2:
                        performSubtraction(inputScanner);
                        break;
                    case 3:
                        performMultiplication(inputScanner);
                        break;
                    case 4:
                        performDivision(inputScanner);
                        break;
                    case 5:
                        performSquareRoot(inputScanner);
                        break;
                    case 6:
                        performPower(inputScanner);
                        break;
                    case 7:
                        performSine(inputScanner);
                        break;
                    case 8:
                        performCosine(inputScanner);
                        break;
                    case 9:
                        performTangent(inputScanner);
                        break;
                    case 10:
                        performNaturalLogarithm(inputScanner);
                        break;
                    case 11:
                        performBase10Logarithm(inputScanner);
                        break;
                    case 12:
                        performAbsoluteValue(inputScanner);
                        break;
                    case 13:
                        performRound(inputScanner);
                        break;
                    case 14:
                        performCeil(inputScanner);
                        break;
                    case 15:
                        performFloor(inputScanner);
                        break;
                    case 16:
                        performMix(inputScanner);
                        break;
                    case 17:
                        performMax(inputScanner);
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                inputScanner.next();
            }

        }
        inputScanner.close();

    }
    // --- Menu Display Method ---
    public static void displayMenu() {
// Print all calculator options
        System.out.println("\n--- Scientific Calculator Menu ---");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent (in degrees)");
        System.out.println("10.  Natural Logarithm (ln)");
        System.out.println("11.  Logarithm Base 10 (log10)");
        System.out.println("12.  Absolute Value");
        System.out.println("13.  Round");
        System.out.println("14.  Ceiling");
        System.out.println("15.  Floor");
        System.out.println("16.  Minimum of Two Numbers");
        System.out.println("17.  Maximum of Two Numbers");
        System.out.println("0. Exit");
    }
    // --- Basic Arithmetic Methods ---
    public static double add(double num1, double num2) {
        double addResult = num1 + num2;
        return addResult; // Placeholder
    }
    public static double subtract(double num1, double num2) {
        double subResult = num1 + num2;
        return subResult;
    }
    public static double multiply(double num1, double num2) {
        double multiResult = num1 * num2;
        return multiResult;
    }
    public static double divide(double num1, double num2) {
        double divideResult = num1 / num2;
        return divideResult;
    }
// --- Scientific Math Methods ---
    public static double calculateSquareRoot(double num) {
        return Math.sqrt(num);
    }
    public static double calculatePower(double num, double power) {
        return Math.pow(num, power);
    }
    public static double calculateSine(double value) {
        return Math.sin(value);
    }
    public static double calculateCosine(double value) {
        return Math.cos(value);
    }
    public static double calculateTangent(double value) {
        return Math.tan(value);
    }
    public static double calculateNaturalLogarithm(double value) {
        return Math.log(value);
    }
    public static double calculateBase10Logarithm(double value) {
        return Math.log10(value);
    }
    public static double calculateAbsoluteValue(double value) {
        return Math.abs(value);
    }
    public static double calculateRound(double value) {
        return Math.round(value);
    }
    public static double calculateCeil(double value) {
        return Math.ceil(value);
    }
    public static double calculateFloor(double value) {
        return Math.floor(value);
    }
    public static double findMin(double num1, double num2) {
        return Math.min(num1, num2);
    }
    public static double findMax(double num1, double num2) {
        return Math.max(num1, num2);
    }

// ... and so on for all required functions
// --- Helper Methods for User Interaction (calling from main's switch-case) ---
// These methods will get input from the user specifically for each operation
    private static void performAddition(Scanner scanner) {
        try {
            // Prompt for first number
            double num1 = scanner.nextDouble();
// Prompt for second number
            double num2 = scanner.nextDouble();
// Call add() method
            double result =add(num1, num2);
// Print result
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }// Implement try-catch for InputMismatchException here!
    }
    private static void performSubtraction(Scanner scanner) {
        try {
            // Prompt for first number
            double num1 = scanner.nextDouble();
// Prompt for second number
            double num2 = scanner.nextDouble();
// Call add() method
            double result =subtract(num1, num2);
// Print result
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performMultiplication(Scanner scanner) {
        try {
            // Prompt for first number
            double num1 = scanner.nextDouble();
// Prompt for second number
            double num2 = scanner.nextDouble();
// Call add() method
            double result =multiply(num1, num2);
// Print result
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performDivision(Scanner scanner) {
        try {
            // Prompt for first number
            double num1 = scanner.nextDouble();
// Prompt for second number
            double num2 = scanner.nextDouble();
// Call add() method
            double result =divide(num1, num2);
// Print result
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }catch (ArithmeticException e) {
            System.out.println(e.getMessage());
    }}
    private static void performSquareRoot(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = Math.sqrt(num1);
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performPower(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result= calculatePower(num1, num2);
            System.out.println(result);
        }catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performSine(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateSine(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performCosine(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateCosine(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performTangent(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateTangent(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performNaturalLogarithm(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateNaturalLogarithm(num1);
            System.out.println(result);

        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performBase10Logarithm(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateBase10Logarithm(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performAbsoluteValue(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateAbsoluteValue(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performRound(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateRound(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performCeil(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateCeil(num1);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performFloor(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double result = calculateFloor(num1);
            System.out.println(result);

        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performMix(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result= findMin(num1, num2);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
    private static void performMax(Scanner scanner) {
        try {
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();
            double result= findMax(num1, num2);
            System.out.println(result);
        }
        catch (InputMismatchException e) {
            System.out.println("Try again");
        }
    }
// ... and so on for all required functions
}