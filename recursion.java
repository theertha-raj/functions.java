public class Factorial {

    // Recursive method 
    public static int factorial(int n) {
        // Base case
        if (n == 0) {
            return 1;
        }
        // Recursive case
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 6; // Example number to find the factorial
        int result = factorial(number); // Call the recursive method
        System.out.println("The factorial of " + number + " is: " + result);
        }
}