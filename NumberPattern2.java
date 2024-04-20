public class NumberPattern2 {
    public static void main(String[] args) {
        int rows = 5; // Define the number of rows

        // Iterate over each row
        for (int i = 1; i <= rows; i++) {
            // Iterate over each column in the row
            for (int j = 1; j <= i; j++) {
                // Print 1 if the column number is odd, otherwise print 0
                System.out.print(j % 2 == 1 ? "1" : "0");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
op

E:\Logical Que Java 20 Apr>java NumberPattern2
1
10
101
1010
10101