import java.io.*;
class MyNumber
{
	private int Number;

	MyNumber()
	{
		Number=0;
	}

	MyNumber(int Number)
	{
		this.Number=Number;
	}

	void check()
	{
		//check for zero,Positive And Negative.
		if(Number==0)
		{
			System.out.println("Number is Zero:");
		}
		else
		{
			 if(Number>0)
			{
				System.out.println("Number is Positive:");
			}
			else
			{
				System.out.println("Number is Negative:");
			}
			//check for Even or Odd
			if(Number % 2==0)
			{
				System.out.println("Number is Even:");
			}

			else 
			{
				System.out.println("Number is ODD:");
			}

		}
	}
}
class Numbermain
{
	public static void main(String args[]) 
	{
	if(args.length>0)
	{
		MyNumber n=new MyNumber(Integer.parseInt(args[0]));
		n.check();
	}
	else
	{
		System.out.println("Please pass the number as command line arguments:");
	}
	
	}
}

