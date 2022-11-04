class ParamateriedConstractor {
    String names ; // Declearing a instance varriable
    ParamateriedConstractor(String name){ // Declearing a Paramateried Constractor with a same data type as the instance varriable as parameter
        names = name ; // Joning the instance varriable and Constracotr parameter
        System.out.println("This is a name : " + name);
    }
    public static void main(String[] args){
        ParamateriedConstractor PC = new ParamateriedConstractor("Anshu"); //Passing the value to the constructor
        ParamateriedConstractor PC1 = new ParamateriedConstractor("Leloch");
        
    }
}