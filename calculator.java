public class calculator {
    

    // function with parameters and a return value
    public int add(int num1, int num2) {
        return num1 + num2;
    }
    // function with parameters and a return value
    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        calculator calculator = new calculator();
        
        // Call the add function with parameters and store the return value
        int result = calculator.add(10, 20);
        // Call the sub function with parameters and store the return value
        int result1 = calculator.sub(10, 20);
        
        
        // Print the result
        System.out.println("The sum of 10 and 20 is: " + result);
        System.out.println("The sub of 10 and 20 is: " + result1);
    }
    }
