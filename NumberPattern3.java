public class NumberPattern3 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows
        int number = 1; // Initialize the starting number

        // Iterate over each row
        for (int i = 1; i <= rows; i++) {
            int increment = i; // Increment value for each row
            
            // Print the numbers for the current row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " "); // Print the current number
                number += increment; // Update the number for the next iteration
                increment++; // Increment for the next number in the row
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
	}
	