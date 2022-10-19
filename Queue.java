import java.util.Scanner;

public class Queue {
    int[] arr = new int[100];

    void insert() {
        System.out.print("Specify the size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the data : ");
            System.out.print(">>");
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        System.out.println("Enter the number of the elements to be displayed : ");
        Scanner ze = new Scanner(System.in);
        int n = ze.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("Enter 1 for insertion , ");
        System.out.println("Enter 2 for display");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a choice :");
        int choice = sc.nextInt();

    
    }
}

