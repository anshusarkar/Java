class factorialprog {
    static void factorial(){
        int i=1 ; int num=10 ;
        while(num != 0){
            i=i*num--;
            
        }
        System.out.println(i);
    }
    public static void main (String [] args){
        factorial();
    }
}