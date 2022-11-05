class factorialinmainmethod {
    public static void main (String [] args ){
        int i=1 ; int num=10;
        while(num!=0){
            i=i*num--;
        }
        System.out.println(i);
    }
}