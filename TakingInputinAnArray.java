import java.util.Scanner;
import java.util.*; //Imports whole set of methods in utill class
class TakingInputinAnArray {
    public static void main (String args []){
        Scanner inp = new Scanner(System.in);
        int [] arr  = new int[5];
        for (int i = 0; i<arr.length; i++){
             arr[i] = inp.nextInt();
        }
    }

}