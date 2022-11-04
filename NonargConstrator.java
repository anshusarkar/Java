class NonargConstrator{
        int i ;
    public NonargConstrator(){ //The acces specifer to this constructor can only be public and private cause static methods dosen't need an object 
        i = 5 ;
        System.out.println("This is a sucessfull Non argument constractor call");
    }
    public static void main(String[] args){
        NonargConstrator obj = new NonargConstrator();
        System.out.println("This is a value sroted in a varriable : " +obj.i);
    }
}