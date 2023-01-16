import java.io.*;

abstract class figure
{
	abstract void area();
	abstract void volume();
	
}
class square extends figure
{
	float side;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter side:");
		while(true)
		{
		
			side=Float.parseFloat(br.readLine());
			if(side>0)
			 break;
			else
				System.out.println("Invalid side Input,Please Re-enter side:");
		}
	}
	
	void area()
	{
		System.out.println("Area of Square"+(side*side));
		
	}
	void volume()
	{
		System.out.println("Square is 2D figure,volume not applicable");
		
	}
}
class triangle extends figure
{
	float height,base;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter height:");
		while(true)
		{
		
			height=Float.parseFloat(br.readLine());
			if(height>0)
			 break;
			else
				System.out.println("Invalid height Input,Please Re-enter side:");
		}
		System.out.println("Enter Base:");
		while(true)
		{
		
			base=Float.parseFloat(br.readLine());
			if(base>0)
			 break;
			else
				System.out.println("Invalid Base Input,Please Re-enter side:");
		}
	}
	
	
	
	void area()
	{
		System.out.println("Area of triangle"+(0.5*height*base));
		
	}
	void volume()
	{
		System.out.println("Square is 2D figure,volume not applicable");
		
	}
}

class rectangle extends figure
{
	float length,breadth;
	void input() throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length:");
		while(true)
		{
		
			length=Float.parseFloat(br.readLine());
			if(length>0)
			 break;
			else
				System.out.println("Invalid length Input,Please Re-enter side:");
		}
		System.out.println("Enter Breadth:");
		while(true)
		{
		
			breadth=Float.parseFloat(br.readLine());
			if(breadth>0)
			 break;
			else
				System.out.println("Invalid Breadth Input,Please Re-enter side:");
		}
	}
	
	
	
	void area()
	{
		System.out.println("Area of rectangle"+(length*breadth));
		
	}
	void volume()
	{
		System.out.println("Rectangle is 2D figure,volume not applicable");
		
	}
}
class Q6
{
	public static void main(String args[]) throws IOException
	{
		System.out.println("\nSquare");
		square s=new square();
		s.input();
		s.area();
		s.volume();
	
		System.out.println("\ntriangle");
		triangle t=new triangle();
		t.input();
		t.area();
		t.volume();
		
		System.out.println("\nRectangle");
		rectangle r=new rectangle();
		r.input();
		r.area();
		r.volume();
	}
}




