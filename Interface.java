interface An_interface { 
     default void A_method(){   
        System.out.println("This method is from an interface !");
    }
}
class Interface implements An_interface {                                 
    
    public static void main(String[] args) {
        An_interface in ;
        Interface Inter = new Interface();
        in = Inter ;
        in.A_method();
    }
}

