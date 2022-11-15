import java.util.*;
 class factorialfromanotherclass2 {
    public static  void main (String[] args)
    { 
      main fr = new main();
      fr.factorial ();
    }

}
class main{
    static int i;
    static int x ;
   public void factorial ()
   {
    System.out.print("Enter a number : ");
    Scanner inp = new Scanner(System.in);
    x = inp.nextInt();
    int i = 1;
    while(x!=0)
    {
        i=i*x--;
    }
    System.out.println(i);
   } 
    
}