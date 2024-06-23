public class SumSequential {

    // Sequential method to find the sum of integers from 1 to n
    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; // Add each number from 1 to n to the sum
        }
        return sum;
    }

    public static void main(String[] args) {
        int number = 10; // Example number to find the sum up to
        int result = sum(number); // Call the sequential method
        System.out.println("The sum of integers from 1 to " + number + " is: " + result);
    }
}