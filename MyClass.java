class MyClass {
    int x ;
    int y = 100 ;
    public static void main (String args[])
    {
        MyClass myobj = new MyClass(); //Created a object of my class in main method , now instance varriable x, y can be used in the main function
        System.out.println(myobj.x);
        System.out.println(myobj.y);
    }
}