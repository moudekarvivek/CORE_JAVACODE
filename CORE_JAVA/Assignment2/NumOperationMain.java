import numoperation.*;
import java.io.*;
class NumOperationMain
{

	public static void main(String args[])
	throws IOException
	{
		InputStreamReader in=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(in);
		
		System.out.println("\nEnter a number:");
		int n=Integer.parseInt(br.readLine());
		
		armstrong obj1=new armstrong();
		obj1.armstrongno(n);
		
		perfect obj2=new perfect();
		obj2.perfectno(n);
		
		prime obj3=new prime();
		obj3.primeno(n);
	}
}
