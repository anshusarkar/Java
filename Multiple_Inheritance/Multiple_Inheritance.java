package Multiple_Inheritance; //That is needed to be understood more clearly.........
                              //Only the main class 

interface a {
    default void A_Method(){
    System.out.println("This is a method in interface called block");
    }
}

interface b {
    default void A_Method(){
    System.out.println("This is a method in interface called ");
    }
}

class Multiple_Inheritance implements a, b {

    public void A_Method()
    {
        a.super.A_Method();
        b.super.A_Method();
    }
    public void A_methodof_interface_a(){
        a.super.A_Method();
    }
    public void A_Methodof_interface_b(){
        b.super.A_Method();
    }

    public static void main(String[] args) {
        Multiple_Inheritance obj = new Multiple_Inheritance();
        obj.A_Method();
        obj.A_methodof_interface_a();
        obj.A_methodof_interface_a();
    }

}



