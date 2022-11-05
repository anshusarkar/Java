class returnmethod2{ //Dosen't work 

   static int returnvalue(int c){
          int i = 1;
          int num = c ;
          while(num!=0){
            i=i*num--;
          }
          i=c;
          return c ;
    }
    public static void main(String[] args){
        returnvalue(100);
    }
}