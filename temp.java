
import java.util.Scanner;

class helloworld {
    static void print (){
        System.out.println("Hello World ! ");
    }

    static void takeinput () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        System.out.println("Hello " + name);
    }

    public static void main(String[] args) {
        takeinput();
        /*print();*/
    }
}