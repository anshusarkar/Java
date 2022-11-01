class CallByreference {
    int data = 50 ;
    void change(CallByreference cr ) // had to pass the value in the method one is the Class name other is the object of the class  
    {
        cr.data = cr.data + 100;
    }
    public static void main(String[] args)
    {
        CallByreference cr = new CallByreference(); //cr is the object of the class CallByreference 
        
        System.out.println("Before change "+ cr.data);
        cr.change(cr);                              //Had to pass the object of the class in the method as a parameter                  
        System.out.println("After change "+ cr.data);
    }
}