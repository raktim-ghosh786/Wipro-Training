public class HolTri {
    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows here

        for (int i = 1; i <= rows; i++) {
            // Printing leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Printing stars and spaces
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == rows) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Moving to the next line
            System.out.println();
        }
    }
    
}
