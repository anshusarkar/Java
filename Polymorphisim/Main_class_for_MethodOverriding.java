package Polymorphisim;

public class Main_class_for_MethodOverriding extends MethodOverriding {

    @Override
    public void method(){ // for method overriding the retun type have to be same as super class's method
        System.out.println("The method has been overridden");
    }

    public static void main(String[] args) {

        Main_class_for_MethodOverriding main_method = new Main_class_for_MethodOverriding();

        MethodOverriding methodOverriding= new MethodOverriding();

        methodOverriding.method();
        main_method.method();
        
    }
    
}
