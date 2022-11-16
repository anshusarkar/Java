package AccessSpecifier ; // packages are just a container like folder lol
class A {
    protected void  method (){
          System.out.print("This is a procted method call \nI am visible to the package and all subclasses"); 
    }
}
class B {
    private void method1 (){
        System.out.println("You cann't see me ! ");//Private methods cann't be seen by another class...
    }
}
class C {
    static void method2(){
        System.out.println("This is a static method call \nHowerever ststic isn't an accessspecifier though");
    }
}


class AccessSpecifier {
    public static void main(String[] args){
       //------------
       A a = new A();
       a.method();
       //------------
       B b = new B();
       /*b.method1();*/
       //------------
       C.method2();
    }
}