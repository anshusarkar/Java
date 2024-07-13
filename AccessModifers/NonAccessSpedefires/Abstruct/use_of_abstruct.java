package AccessModifers.NonAccessSpedefires.Abstruct;


abstract class A {
    abstract void sayhello();
}

class B extends A {
    void sayHello()
    {
        System.out.println("Hello, World ! ");
    }  
    
}

abstract interface thread {
    abstract void sayOhio();
}

class Thread implements thread {
    public void sayOhio(){
        System.out.println("Ohio, World !");
    }
}




class use_of_abstruct {
    public static void main(String[] args) {
        
        B b = new B();
        b.sayHello();

        Thread T = new Thread();
        T.sayOhio();
    
    }
}