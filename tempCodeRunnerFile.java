class ParamateriedConstractor {
    String names ;
    ParamateriedConstractor(String name){
        name = names ;
        System.out.println("This is a name : " + name);
    }
    public static void main(String[] args){
        ParamateriedConstractor PC = new ParamateriedConstractor("Anshu");
        ParamateriedConstractor PC1 = new ParamateriedConstractor("Leloch");
        
    }
}