package Polymorphisim;

public class MethodOverloading { // Method Overloading is a compiletime polymorphisim

    private int sum (int X , int Y,int Z){
        return X+Y+Z;
    }

    private int sum (int W ,int X , int Y , int Z ){
        return W+X+Y+Z;
    }
    public static void main(String[] args) {

        MethodOverloading M = new MethodOverloading();

        System.out.println(M.sum(12,32,43,54));
        System.out.println(M.sum(12,32,43));
    }
}
