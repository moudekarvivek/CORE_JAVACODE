import java.io.*;

class convert implements numberConversion
{
	public void convertToBinary(int decimal)
	{
		System.out.println("Binary " +Integer.toBinaryString(decimal));
		
	}
	public void convertToOctal(int decimal)
	{
		System.out.println("Octal " +Integer.toOctalString(decimal));
	}
	public void convertToHexadecimal(int decimal)
	{
		
		System.out.println("Hexadecimal " +Integer.toHexString(decimal));
	}
	
}
class convertmain
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Please Enter A Decimal Number:");
		int decimal=Integer.parseInt(br.readLine());
		
		convert c=new convert();
		c.convertToBinary(decimal);
		c.convertToOctal(decimal);
		c.convertToHexadecimal(decimal);
	}	
}
