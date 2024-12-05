package Generics.Generics_in_class;

class  Generics_In_class<A,B,C> {

    A obj ;                 // Generics are more like assigning data types to structurs, in terms of C 
    B obj1;
    C obj2;

    Generics_In_class(A obj, B obj1, C obj2) {

        this.obj = obj;
        this.obj1 = obj1;
        this.obj2 = obj2;

    }

    void print(){
        System.out.println("The value of the obj is: "+ obj);
        System.out.println("The value of the obj1 is: "+ obj1);
        System.out.println("The value of the obj2 is: "+ obj2);
    }



    public static void main(String[] args) {

        Generics_In_class<Integer,Double,String> Obj = new Generics_In_class<Integer,Double,String>(1,12.21,"Hello, world!");

        Obj.print();

    }

    
}

// Doing this is equivalent to

// class Abc {
//     Integer a;
//     Double b;
//     String c;

//     Abc(int a, double b, String c){
//         this.a = a; 
//         this.b = b; 
//         this.c=c ;
//     }

//     void print(){
//         System.out.println("The value of a is : " + this.a);
//         System.out.println("The value of b is : " + this.b);
//         System.out.println("The value of c is : " + this.c);
//     }

//     public static void main(String[] args) {
//         Abc obj = new Abc(1,21.21,"Hello, world !");

//         obj.print();
//     }


// }


