package AccessSpecifier.Constructors;
class This_To_invoke_Current_Constroctor_{
    
     This_To_invoke_Current_Constroctor_(){ //Calling no argument constructor from parameterized constructor
        System.out.println("This is from the non parametarized constructor");     
    }
    This_To_invoke_Current_Constroctor_(int x){//Without this() only the old defination of the construcor would get executed 
        this();
        System.out.println(x);
    }

    public static void main(String[] args) {
        This_To_invoke_Current_Constroctor_ ob = new This_To_invoke_Current_Constroctor_(10);
        
    }
}