package Generics.Generics_in_methods;

public class Generics_in_methods {

    static <A,B,C> void func (A var, B var1, C var2){

        System.out.println(var);
        System.out.println(var1);
        System.out.println(var2);
        // Use var.getClass().getName() to check the actual class reference of the data class, which would be 
        // the class of the data that would get assinged to the varriable 
        // Example with var
        System.out.println("The data class of var is : " + var.getClass().getName());
        
    }
    
    public static void main(String[] args) {

        func(11,1.41,"Hello, world!");
        
    }
}
