import java.util.Scanner;

    public class Calculator {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();
    
            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();
    
            System.out.println("Choose an operation: +, -, *, /,sin,cos,tan");
            String operation = scanner.next();

    
            double result = 0;
            switch (operation) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    result = divide(num1, num2);
                    break;
                case "sin":
                result = sine(num1);
                break;
                case "cos":
                result = cosine(num1);
                break;
                case "tan":
                result = tan(num1);
                break;
                default:
                    System.out.println("Invalid operation.");
                    return;
            }
    
            System.out.println("The result is: " + result);
        }
    
        public static double add(double a, double b) {
            return a + b;
        }
    
        public static double subtract(double a, double b) {
            return a - b;
        }
    
        public static double multiply(double a, double b) {
            return a * b;
        }
    
        public static double divide(double a, double b) {
            if (b == 0) {
                System.out.println("Error! Division by zero.");
                return 0;
            }else

            return a / b;
        }
        public static double sine(double a) {
            return Math.sin(Math.toRadians(a));
        }
    
        public static double cosine(double a) {
            return Math.cos(Math.toRadians(a));
        }
        public static double tan(double a) {
            return Math.tan(Math.toRadians(a));
        }
    }
    

