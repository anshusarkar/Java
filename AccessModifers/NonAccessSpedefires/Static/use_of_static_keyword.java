package AccessModifers.NonAccessSpedefires.Static;

public class use_of_static_keyword {
    static int var ;
    static double var2 ;

    static void method(){
        System.out.println("vale of var is :"+ var+"\nThe value of var2 is :"+ var2);
    }

    public static void main(String[] args){
        var = 1 ; // See ?? java isn't even a object oriented lang ... now obj requied to perform calls 
        var2 = 10.2 ;
        method();
    }

}
