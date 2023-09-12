package Constructors;

public class Defualt_constructor {

    int value = 100 ;

     void method(){
        System.out.println("Hello Constroctors !");
    }

    public static void main(String[] args) {      
        Defualt_constructor DC = new Defualt_constructor(); //This is a defualt constructor, Whic is just a reference of the class
        System.out.println(DC.value);
        DC.method();
    }
}
