interface inter {
    default void A_Method(){ //Methods in an interface can only be static or defualt 
        
    }
}
class interface2 implements inter {
    public void A_Method(){
     System.out.println("This is a method of an interface ! ");
    }

    public static void main (String[] args){
        inter in ;
        interface2 obj = new interface2();
        in=obj;
        in.A_Method();

    }
}  

