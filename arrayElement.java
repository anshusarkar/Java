import java.io.*;
import java.util.Scanner;
class arrayElement {
    public static void main(String[] args) throws NumberFormatException, IOException{ 
		
		// Above Exceptions are thrown for Buffered reader to work // else the job can be done with Scanner tooo.

	//Declaring an array
	//That can be done in two ways
	//1. 
	int[] a = new int [5]; //declaring the array with it's size , though I don't understand why the size is needed to be initilized by new	key word... ?
	//2. 
	float b[]  = new float[5];
	//To alocate memory ither the array get's initiliazed by size or get's assinged with elements

	//Taking input in an an array

	System.out.println("\nTaking integer type input in the 'a' array : \n");

	//Intitializeing the buffer class fro integer input

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	for(int i = 0 ; i<a.length ; i++){
		
			System.out.print(">> ");
			a[i] =  Integer.parseInt(bf.readLine());
		
	}

	System.out.print(" The elements in the 'a' array are : [\t");
        for(int i=0 ;i<a.length ;i++){
            System.out.print(a[i]+"\t");
        }
        System.out.print("]\n");

	System.out.println("\nTaking float type input in the 'b' array : \n");

	Scanner sc = new Scanner(System.in);

	for(int i=0; i<b.length ; i++) {
		System.out.print(">> ");
		b[i] = sc.nextFloat();
	}
	System.out.print(" \nThe elements in the 'b' array are : [\t");
        for(int i=0 ;i<a.length ;i++){
            System.out.print(b[i]+"\t");
        }
        System.out.print("]\n");



	int[] array = new int[5];
        int[] arr ={1,2,3,4,5,6,7,8,9,10};
        System.out.print(" \nThe already initialized elements in the 'arr' array are : [\t");
        for(int i=0 ;i<arr.length ;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("]\n");
    }
}
