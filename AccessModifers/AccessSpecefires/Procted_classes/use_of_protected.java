package AccessModifers.AccessSpecefires.Procted_classes;

class use_of_protected {
    // The code is accessible in the same package and subclasses as the access of the code is protected
    protected int var ;
    protected double var2 ;


    protected void use_of_procted(int var, float var2){
        this.var = var ;
        this.var2 = var2 ;
    }

    protected void method(){
        System.out.println("value of var is : "+ var + "\n value of var is : " + var2);
    }

    public static void main (String[] args){
        use_of_protected obj = new use_of_protected();
        obj.var = 1 ;
        obj.var2 = 10.2 ;
        obj.method();
    }

}
