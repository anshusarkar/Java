interface Abc {
    int add(int a, int b); // First make a call of your function in an interface with the parameters
}

public class Lambda {
    public static void main(String[] args) { // Lambda's in java really suck.., No u suck { Me to my self ....}

        Abc LamdbaObj = (x, y) -> x + y ; //Then make a interface referenceing obj i.e. lamdba object and refine the return using -> 

        System.out.println(LamdbaObj.add(100,9000)); // then make a call of the lamdba method through lamdba object reference

        // Where in python use lamdba keyword then fun name , parameters and return value ... simple ...
    }
    
}
