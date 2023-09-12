package Constructors;
class Constructor_class {

    int value_to_be_passed_in_method1; // These are called class varriable which would latter get accessed by methods
    int value_to_be_passed_in_method2;

    Constructor_class(int value , int value2 ){    // This is a constroctor that holds the same name of it's class in java 
        this.value_to_be_passed_in_method1 = value;
        this.value_to_be_passed_in_method1 = value2;
    }
    
    public void show_value1(){
        System.out.println("The value passed is " + value_to_be_passed_in_method1);
    }
    public void show_value2(){
        System.out.println("The value is " + value_to_be_passed_in_method2);
    }
    
    public static void main (String[] args){
        
        Constructor_class a = new Constructor_class(1,2);
        
        a.show_value1();
        a.show_value2();
    }
    
}
