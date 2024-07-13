package AccessModifers.AccessSpecefires.Public;

public class use_of_public_in_methods {
    public void method(){
        System.out.println("This method is public meaning it's public to class within any package\n meaning another class from a diffrent package can inherit it  ");
    }

}

class A extends use_of_public_in_methods {
    public static void main(String[] args) {
        A obj = new A();
        obj.method();
    }
}