package day1;
import java.io.*;
public class Addition {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("Enter the values:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		a=Integer.parseInt(br.readLine());
		b=Integer.parseInt(br.readLine());
		c=a+b;
		System.out.println("Addition of a= "+a+" and b="+b+"is" +c);

	}

}
