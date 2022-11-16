interface A { // An interface is like a blueprint of a class it is introduced to support multiple inheritance in java which classes dosen't support
    void  A_method();
    
}

class x implements A {
    public void A_method(){
      System.out.println("This is a method from an interface !");
   }
   public static void main (String [] args)
   {
    x obj = new x();
    obj.A_method();
   }
}