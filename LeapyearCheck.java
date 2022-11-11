import java.util.*;
class LeapyearCheck {
    public static void main (String [] args){
        try (Scanner inp = new Scanner(System.in)) { //Had to use try statement other wise it was showing a memeory leak error
            System.out.print("Enter a year : ");
            int year = inp.nextInt();
            if(year%400==0||year%100!=0||year%4==0){
                System.out.println("Entered year is leap year");
            }
            else{
                System.out.println("Entered year is not a leap year");
            }
        }


    }
}