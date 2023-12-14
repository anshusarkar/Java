package Diamod_problem; // Java dosen't have diamond problem

interface a {
    public default void method(){
        System.out.println("This a method !");
    }
}

interface x extends a {
    @Override
    public default void  method(){
        System.out.println("Hello!");
    }
    
}

interface y extends a {
    @Override
    public default void  method(){
        System.out.println("Hello world !");
    }
}

class Main implements x,y{

    public void y_method() // the interfaces after getting inheritad must be called into a method cause thats how interfaces works ...
    {
        y.super.method();
    }

    public void x_method(){
        x.super.method();
    }



     public static void main(String[] args) {
        
        Main m = new Main();

        m.y_method();
        m.x_method();
       
    }
}




