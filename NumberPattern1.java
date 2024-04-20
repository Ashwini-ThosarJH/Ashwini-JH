public class NumberPattern1 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows
        int number = 1; // Initialize the starting number

        // Iterate over each row
        for (int i = 1; i <= rows; i++) {
            // Iterate over each column in the row
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " "); // Print the current number
                number++; // Increment the number for the next iteration
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
op
E:\Logical Que Java 20 Apr>java NumberPattern1
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15