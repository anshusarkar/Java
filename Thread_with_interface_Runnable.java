class Thread_with_interface_Runnable implements Runnable{
    public void run (){
        System.out.println("This is a method of an interface ! \nmethod only executed cause the name of the method was run ! ");
    }
   
    public static void main(String[] args) {
        Thread_with_interface_Runnable obj = new Thread_with_interface_Runnable() ;
        Thread t = new Thread (obj);
        t.start();
    }

}