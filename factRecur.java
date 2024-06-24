import java.util.Scanner;

public class factRecur {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer to find its factorial: ");
        int num = sc.nextInt();

        int result = factorial(num);
        System.out.println("The factorial of " + num + " is: " + result);
        

        sc.close();
    }
}

