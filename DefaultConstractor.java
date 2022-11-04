class DefaultConstractor {
    int i = 100;      
    boolean j = true ;
    boolean k = false ;
    public static void main(String[] args){
        DefaultConstractor DC = new DefaultConstractor();//As no Constractor is initialized java creats default constructor
        System.out.println("The value of i : "+DC.i);
        System.out.println("The value of j : "+DC.j);
        System.out.println("The value of k : "+DC.k);
        
    }
}