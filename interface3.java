interface inter {
    default void A_method(){

    }
    default void Another_method(){

    }
}

public class interface3 implements inter  {

    public void A_method(){
        System.out.println("This is a method on an interface called inter !");
    }
    public void Another_method(){
        System.out.println("This is anoyher method of a the same interface ! ");
    }

    public static void main(String[] args) {
        inter i;
        inter j;
        interface3 obj =new interface3() ;
        interface3 obj2 =new interface3() ;
        i=obj;
        j=obj2;
        i.A_method();
        j.Another_method();
    }
    
}
