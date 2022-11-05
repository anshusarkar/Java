class javaSwapprog{
    public static void main (String []args){
        int a = 10;
        int b = 20;
        System.out.println("The initial values are : " +a + " and " +b);
        int temp ;
        temp = a+b;
        a = temp-a;
        System.out.println("The value of a before swapping is : "+a);
        b = temp-a;
        System.out.println("The value of b before swapping is : "+b);
    }
}