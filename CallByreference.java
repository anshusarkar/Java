class CallByreference {
    int data = 50 ;
    void change(CallByreference self )
    {
        self.data = self.data + 100;
    }
    public static void main(String[] args)
    {
        CallByreference cr = new CallByreference();
        
        System.out.println("Before change "+ cr.data);
        cr.change(cr);
        System.out.println("After change "+ cr.data);
    }
}