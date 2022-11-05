import java.util.*;
class LeapyearCheck {
    public static void main (String [] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year = inp.nextInt();
        if(year%400==0||year%100!=0||year%4==0){
            System.out.println("Entered year is leap year");
        }
        else{
            System.out.println("Entered year is npt a leap year");
        }


    }
}