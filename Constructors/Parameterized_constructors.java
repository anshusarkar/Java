package Constructors;

public class Parameterized_constructors {

    int value; 
    float value2;

    Parameterized_constructors(int value , float value2){
       this.value = value;
       this.value2 = value2;
    }

    void show(){
        System.out.println("The value that is passed is " + this.value + ", " + this.value2 + ".");
    }

    public static void main(String[] args) {
        Parameterized_constructors params = new Parameterized_constructors(1,2); // this constructor is called parameterized constructor
        params.show();
    }
}
