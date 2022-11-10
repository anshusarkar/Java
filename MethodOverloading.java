class MethodOverloading{ 
    public static void main(String[] args){
         
            System.out.println(add(1,2 ,3));
    }
    static double add (int i , int j){
        System.out.println("Sum is done in between two integers");  //Some how that is returing an double as output
        return (i+j);                                              
    }
    static double add (int i , int j , int k){
        System.out.println("Sum is done between Three integers"); 
        return (i+j+k) ;
    }
    
    //Conclusion as here same method is getting loaded with multiple data types the process is called method over loading 

}