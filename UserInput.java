import java.util.*;
class UserInput {
    public static void main(String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String name = inp.nextLine();
        System.out.println("This is the entered name : "+name);
    }
}