class MethodOloading{
    public static void main(String[] args){
        MethodOverloading obj = new MethodOverloading(); //Creating a Defualt Constroctor
            System.out.println(add(1,2));
    }
    static double add (int i , int j){
        System.out.println("Sum is done in between two integers");
        return (i+j);
    }
}