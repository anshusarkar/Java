package Thread;
public class Thread_with_Thread_Class extends Thread {

    public void start(){
        System.out.println("This method works !");
    }

    public static void main(String[] args) {
        Thread_with_Thread_Class obj = new Thread_with_Thread_Class();
        obj.start();
    }
    
}
