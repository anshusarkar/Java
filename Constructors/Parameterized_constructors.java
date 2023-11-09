package Constructors;

public class Parameterized_constructors {

    int value_to_be_used_by_methods; 
    float value2_to_be_used_by_methods;

    Parameterized_constructors(int value , float value2){
       this.value_to_be_used_by_methods = value;
       this.value2_to_be_used_by_methods = value2; 
    }

    void show(){
        System.out.println("The value that is passed is " + this.value_to_be_used_by_methods + ", " + this.value2_to_be_used_by_methods + ".");
    }

    public static void main(String[] args) {
        Parameterized_constructors params = new Parameterized_constructors(1,2); // this constructor is called parameterized constructor
        params.show();
    }
}
