interface Abc {

    void method1();
    void method2();

}

public class AnonymousClass {
    public static void main(String[] args) {

        // Insted of implementing the interface Abc in the class we would create an anonymous class to create the interface reference 

        Abc obj = new Abc(){

            @Override
            public void method1(){
                System.out.println("Hello, world!");
            }

            @Override
            public void method2() {
                System.out.println("Hello, world!");
            }
        };

        // Now using the obj reference the methods can be called 

        obj.method1();
        obj.method2();

        // Coclusion : insted of implementation of interfaces in classes we use Anonymous classes that's acutally an interface reference and overrideing of
        // methods present init to add definitions to them .
        
    }
}