import java.util.Scanner;


class Stack {
	
	

	public int insert( int arr[]){
	 

	
		
	return 0 ;

	}

	public int display(int size,int arr[]){

	for (int i = 0; i < size; i++){
		System.out.println(arr[i]);
	}
	
	return 0 ;
	

	}

	public int delete(){
	
	
	return 0 ;
	}
	



	public static void main(String [] args){
	

	Stack S = new Stack();
	System.out.print("Initialize the size of the stack once : ");
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];

	int choice = 0 ;
	
	while (choice != 4) {
	


	System.out.println("Enter 1 for insertion");
	System.out.println("Enter 2 to display");
	System.out.println("Enter 3 for deletion");
	System.out.println("Enter 4 to exit");

	System.out.print("\nEnter the choice : ");
	
	choice = sc.nextInt();

	switch (choice){
		
		case 1:
			S.insert(arr);
			break;
		case 2:
			S.display(size,arr);
			break;
		case 3:
			S.delete();
			break;
		case 4:
			System.out.println("Bye !");
		defualt:
			System.out.println("Entered choice is worng !");
			break;

	
	}
	
	}
	
	
	}

}
