class This_To_invoke_Current_Method {
     void m() {
        System.out.println("hello m");
    }

     void n() {
        System.out.println("hello n");
       this.m(); // same as this.m()
             // this.m();
    }
    public static void main(String[] args)
    {
       This_To_invoke_Current_Method ob = new This_To_invoke_Current_Method();
       ob.n();
    }
}
