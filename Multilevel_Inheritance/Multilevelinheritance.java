package Multilevel_Inheritance;

public class Multilevelinheritance {
    void A_Method(){
        System.out.println("A_Method is a method of a class MultilevelInheritance  ! ");
    }
}
class block1 extends Multilevelinheritance {
    void A_Method(){
        System.out.println("A_Method is now redefined in another child class 'block1' through inheritance !");
    }
}
class block2 extends block1 {
    void A_Method(){
        System.out.println("A_method is now again redefined in another child class of 'block1' that is 'block2' ");
    }
}
