interface An_interface {
     default void A_method(){    
    }
}


class Interface implements An_interface {
    public void A_method(){
        System.out.println("This is a method of an interface ! ");
    }
    public static void main(String[] args) {
        An_interface in ;
        Interface Inter = new Interface();
        in = Inter ;
        in.A_method();
    }
}
