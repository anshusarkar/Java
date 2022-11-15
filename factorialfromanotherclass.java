import java.util.*;
class factorialfromanotherclass {
    public static void main(String[] args)
    {
        Main m = new Main();
        m.method();
    }
}
class Main{
    public void method ()
    {
        System.out.print("Enter a value : ");
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        int i=1 ; 
        while(num!=0){
            i=i*num--;
        }
        System.out.println(i);
    }
}
