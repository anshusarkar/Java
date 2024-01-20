package BufferedReader;
import java.io.*;
class BufferReader {
    public static void main(String[] args)throws IOException{

    //reading file contexts through bufferedreader

    BufferedReader br = new BufferedReader(new FileReader("TEXT.text"));
	String ch = br.readLine();

	System.out.println(ch+"\n");

    int a = 0 ;

    //taking an integer as the input through buffered reader

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //Br is the object of two classes 1.BufferedReader , 2.InputStreamReader

    System.out.print("Enter a number for varriable 'a' : ");

    a = Integer.parseInt(bf.readLine()); 
    
    System.out.println(a);

    //taking an float value as the input for tthe buffered reader

    BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Enter float values for varriable 'b' : ");

    float x = Float.parseFloat(b.readLine());

    System.out.println(x);

	br.close();

    }
}
