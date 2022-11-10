class SumUsinginstanceVariable {
    int i=20; int j =70 ;
    void add()
    {
        System.out.print("sum = "+(this.i+this.j));
    }
    public static void main(String[] args)
    {
        SumUsinginstanceVariable sum = new SumUsinginstanceVariable();
        sum.add();
        
    }
}