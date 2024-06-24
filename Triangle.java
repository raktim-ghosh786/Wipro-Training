public class Triangle {
    public static void main(String[] args) {
        int rows = 4; // You can change the number of rows here

        for (int i = 1; i <= rows; i++) {
            // Printing leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Moving to the next line
            System.out.println();
        }
    }
    
}
