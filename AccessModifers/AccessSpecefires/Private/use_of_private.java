package AccessModifers.AccessSpecefires.Private;

public class use_of_private {

    private int var = 10 ;
    private double var2 = 10.2 ;

    private void method () {
        System.out.println("value of var is " + var + "\nvalue of var2 is :" + var2);
    }

    public static void main(String[] args) {
        use_of_private u = new use_of_private();
        u.method();
    }   
}

class A extends use_of_private {
    public static void main(String[] args) {
        A obj = new A();
        obj.method(); // This will give compile error

        use_of_private u = new use_of_private();
        u.method();  // This will give compile error
    }
}