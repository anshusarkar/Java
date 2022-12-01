package Thread;

public class thread extends Thread {
    public void A_method(){
        System.out.println("This method runs !");
    }
    public static void main(String[] args) {
        thread ob = new thread();
        ob.start();
    }
}
