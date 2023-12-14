package Thread;
class therad2 extends Thread {
    public void run(){
        System.out.println("This is a thread run !");  
    }
    public static void main(String[] args) {
        therad2 t = new therad2();
        t.start();
    }
}