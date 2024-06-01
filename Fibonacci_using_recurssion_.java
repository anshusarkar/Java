import java.util.Scanner;

public class Fibonacci_using_recurssion_ {

    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit (Don't give more than 48; the program would be printing negative numbers): ");
        int limit = scanner.nextInt();

        System.out.print("Fibonacci Series: ");

        for (int i = 0; i < limit; i++) {
            long fibnum = fibonacci(i);
            if (fibnum < 0) {
                System.out.println("\nThis is the limit! After this, the program starts printing negative numbers!");
                System.out.println("The program stopped at " + i);
                break;
            }
            System.out.print(fibnum);
            if (i < limit - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\nYeah! Now that's a golden ratio!");
        System.out.println("Cause any number of the sequence if divided by the previous number is 1.67 except for the first three numbers of the sequence!");
        System.out.println("FYI: Golden ratio is the Fibonacci sequence!");

        scanner.close();
    }
}
