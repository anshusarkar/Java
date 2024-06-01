import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the limit (Don't give more than 48; the program would be printing negative numbers): ");
        int limit = scanner.nextInt();

        if (limit <= 0) {
            System.out.println("Limit must be greater than 0");
            return;
        }

        System.out.print("Fibonacci Series: ");

        long prevar = 0;
        long nextvar = 1;

        if (limit >= 1) {
            System.out.print(prevar);
        }
        if (limit >= 2) {
            System.out.print(", " + nextvar);
        }

        for (int i = 3; i <= limit; i++) {
            long fibnum = prevar + nextvar;
            if (fibnum < 0) {  // Check for overflow
                System.out.println("\nThis is the limit! After this, the program starts printing negative numbers!");
                System.out.println("The program stopped at " + (i - 1));
                break;
            }
            System.out.print(", " + fibnum);

            prevar = nextvar;
            nextvar = fibnum;
        }

        System.out.println("\nYeah! Now that's a golden ratio!");
        System.out.println("Cause any number of the sequence if divided by the previous number is 1.67 except for the first three numbers of the sequence!");
        System.out.println("FYI: Golden ratio is the Fibonacci sequence!");

        scanner.close();
    }
}
