class returnmethod2{ 

   static int returnvalue(int c){
          int i = 1;
          int num = c ;
          while(num!=0){
            i=i*num--;
          }
          c=i;
          return c ;
    }
    public static void main(String[] args){
        System.out.println(returnvalue(10));
    }
}