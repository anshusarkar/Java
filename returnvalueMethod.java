class returnvalueMethod {
    static int returnvalueTimes2(int c){
        int a = c*2 ;
        c=a;
        return c ;
    }
    public static void main(String [] args){
        System.out.println(returnvalueTimes2(5));
    }
    
}