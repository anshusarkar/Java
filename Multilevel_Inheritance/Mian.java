package Multilevel_Inheritance;

public class Mian {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------------------");
        Multilevelinheritance obj1 = new Multilevelinheritance();
        obj1.A_Method();
        System.out.println("--------------------------------------------------------");
        block1 obj2 = new block1();
        obj2.A_Method();
        System.out.println("--------------------------------------------------------");
        block2 obj3 = new block2();
        obj3.A_Method();
        System.out.println("--------------------------------------------------------");
    }
}
