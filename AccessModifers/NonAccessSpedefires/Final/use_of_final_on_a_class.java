package AccessModifers.NonAccessSpedefires.Final;

final class use_of_final_on_a_class {
   final boolean var = true;
   
   final void method(){
    System.out.println("Hello, word! ");
   }

}

class A extends use_of_final_on_a_class { // will show an error

    @Override
    
    void method(){ // Can't override because of final keyword

        System.out.println("Hello, world !");
    }

public static void main(String[] args) {

    A a = new A();

    a.var = false ; // will show an error

    a.method(); // will show an error
    
    }

}