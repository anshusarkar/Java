class NonargConstrator{
        int i ;
    private NonargConstrator(){
        i = 5 ;
        System.out.println("This is a sucessfull Non argument constractor call");
    }
    public static void main(String[] args){
        NonargConstrator obj = new NonargConstrator();
        System.out.println("This is a value sroted in a varriable : " +obj.i);
    }
}