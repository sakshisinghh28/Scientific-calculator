import java.util.Scanner;

class ScientificCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            showMenu();
            int n = sc.nextInt();
            if (n == 0) break;

            if (n >= 1 && n <= 5) {
                System.out.println("Enter the 1st number:");
                double x = sc.nextDouble();
                System.out.println("Enter the 2nd number:");
                double y = sc.nextDouble();

                switch (n) {
                    case 1:
                        System.out.println("Result: " + addition(x, y));
                        System.out.println();
                        break;
                    case 2:
                        System.out.println("Result: " + subtraction(x, y));
                        System.out.println();
                        break;
                    case 3:
                        System.out.println("Result: " + multiplication(x, y));
                        System.out.println();
                        break;
                    case 4:
                        System.out.println("Result: " + division(x, y));
                        System.out.println();
                        break;
                    case 5:
                        System.out.println("Result: " + remainder(x, y));
                        System.out.println();
                        break;
                }
            } else {
                System.out.println("Enter the number:");
                double x = sc.nextDouble();

                switch (n) {
                    case 6:
                        System.out.println("Result: " + Math.sin(Math.toRadians(x)));
                        System.out.println();
                        break;
                    case 7:
                        System.out.println("Result: " + Math.cos(Math.toRadians(x)));
                        System.out.println();
                        break;
                    case 8:
                        System.out.println("Result: " + Math.tan(Math.toRadians(x)));
                        System.out.println();
                        break;
                    case 9:
                        System.out.println("Result: " + Math.log(x));
                        System.out.println();
                        break;
                    case 10:
                        System.out.println("Result: " + Math.log10(x));
                        System.out.println();
                        break;
                    case 11:
                        System.out.println("Enter the power:");
                        double y = sc.nextDouble();
                        System.out.println("Result: " + Math.pow(x, y));
                        System.out.println();
                        break;
                    case 12:
                        System.out.println("Result: " + Math.sqrt(x));
                        System.out.println();
                        break;
                    case 13:
                        System.out.println("Result: " + factorial((int) x));
                        System.out.println();
                        break;
                }
            }
        }
        sc.close();
    }

    static void showMenu() {
        System.out.println("Select operation that you want to do:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Remainder");
        System.out.println("6. Sine");
        System.out.println("7. Cosine");
        System.out.println("8. Tangent");
        System.out.println("9. Natural Logarithm (ln)");
        System.out.println("10. Base-10 Logarithm (log)");
        System.out.println("11. Power");
        System.out.println("12. Square Root");
        System.out.println("13. Factorial");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    static double addition(double x, double y) {
        return x + y;
    }

    static double subtraction(double x, double y) {
        return x - y;
    }

    static double multiplication(double x, double y) {
        return x * y;
    }

    static double division(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return x / y;
    }

    static double remainder(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
        return x % y;
    }

    static int factorial(int x) {
        if (x < 0) {
            System.out.println("Error: Factorial of a negative number doesn't exist.");
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }
}
