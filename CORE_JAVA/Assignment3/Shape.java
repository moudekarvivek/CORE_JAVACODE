import java.io.*;
abstract class Shape
{
	abstract double cal_area();
	abstract double cal_volume();
	final double pi=3.14f;
}



class Sphere extends Shape
{
	double radius;
	
	Sphere()
	{

	}
	Sphere(double radius)
	{
		this.radius=radius;
	
	}
	double cal_area()
	{
		return 4*pi*this.radius*this.radius;

	}

	double cal_volume()
	{
		return 1.3333*pi*this.radius*this.radius*this.radius;
	
	}	

	void display()
	{
	
		System.out.println("The Area of Sphere is:"+cal_area());
		System.out.println("the volume of sphere is:"+cal_volume());
	}

}

class Cone extends Shape
{
	double radius,height;
	Cone()
	{
	}
	Cone(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
	}
	
	
	double cal_area()
	{
		double sq=this.height*this.height+this.radius*this.radius;
		return pi*this.radius*(this.radius+java.lang.Math.sqrt(sq));
	}	

	double cal_volume()
	{
		return pi*this.radius*this.radius*(this.height/3);
	}
	
	void display()
	{
		
		System.out.println("The Area of Cone is:"+cal_area());
	        System.out.println("the volume of Cone is:"+cal_volume());
	
	}
}

class Cylinder extends Shape
{	
	double radius,height;

	Cylinder()
	{
	}
	Cylinder(double radius,double height)
	{
		this.radius=radius;
		this.height=height;
		
	}
	
	double cal_area()
	{
		return ((2*pi*this.radius*this.height) +(2*pi*this.radius*this.radius));
	}
	
	double cal_volume()
	{
		return pi*this.radius*this.radius*this.height;
	}
	void display()
	{
		
		
		System.out.println("The Area of Cylinder is:"+cal_area());
	        System.out.println("the volume of Cylinder is:"+cal_volume());
	}
}

class Box extends Shape
{
	double length;
	double breadth;
	double height;
	Box()
	{
	}
	Box(double length,double breadth,double height)
	{
		this.length=length;
		this.breadth=breadth;
		this.height=height;
		
	}
	
	double cal_area()
	{
		return 2*((this.length*this.breadth)+(this.length*this.height)+(this.height*this.breadth));
	}
	
	double cal_volume()
	{
		return this.length*this.breadth*this.height;
	}
	
	void display()
	{
		
		
		System.out.println("The Area of Box is:"+cal_area());
	        System.out.println("the volume of Box is:"+cal_volume());
	}
}

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		double sradius,cradius,cheight,cyradius,cyheight,blength,bbreadth,bheight;
		
		while(true)
		{
 			System.out.println("Please Enter the Radius for Sphere Shape:");
		        sradius=Double.parseDouble(br.readLine());

		if(sradius>0)
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		}
		//System.out.println("Please Enter the Radius for Sphere Shape:");
		//double sradius=Double.parseDouble(br.readLine());
		Sphere s=new Sphere(sradius);//Calling Sphere class 
		s.display();
		
		while(true)
		{
 			System.out.println("Please Enter the Radius for Cone Shape:");
		        cradius=Double.parseDouble(br.readLine());
			
				
		if(cradius>0 )
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		
		}
		
		while(true)
		{
			System.out.println("Please Enter the height for Cone Shape:");
		        cheight=Double.parseDouble(br.readLine());
		
		if(cheight>0)
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		}	
		/*System.out.println("Please Enter the Radius for cone Shape:");
		double cradius=Double.parseDouble(br.readLine());
		System.out.println("Please Enter the height for cone Shape:");
		double cheight=Double.parseDouble(br.readLine());*/
		Cone c=new Cone(cradius,cheight);
		c.display();
	   
		while(true)
		{
 			System.out.println("Please Enter the Radius for Cylinder Shape:");
			cyradius=Double.parseDouble(br.readLine());
		
				
		if(cyradius>0)
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		
		}
		
		while(true)
		{
			System.out.println("Please Enter the height for Cylinder Shape:");
			cyheight=Double.parseDouble(br.readLine());
		if(cyheight>0)
			break;
		
		else
		{
			System.out.println("Enter valid input:");	
		}
		}
		/*
		System.out.println("Please Enter the Radius for Cylinder Shape:");
		double cyradius=Double.parseDouble(br.readLine());
		System.out.println("Please Enter the height for Cylinder Shape:");
		double cyheight=Double.parseDouble(br.readLine());*/		
		
		Cylinder cy=new Cylinder(cyradius,cyheight);
		cy.display();
	
		
		/*System.out.println("Please Enter the length for Box Shape:");
		double blength=Double.parseDouble(br.readLine());
		System.out.println("Please Enter the Breadth for Box Shape:");
		double bbreadth=Double.parseDouble(br.readLine());
		System.out.println("Please Enter the height for Box Shape:");
		double bheight=Double.parseDouble(br.readLine());*/
		while(true)
		{
 			System.out.println("Please Enter the length for Box Shape:");
			blength=Double.parseDouble(br.readLine());
		
				
		if(blength>0 )
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		
		}
		
		while(true)
		{
			System.out.println("Please Enter the Breadth for Box Shape:");
			bbreadth=Double.parseDouble(br.readLine());
		
		if(bbreadth>0)
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		}
		
		while(true)
		{
			System.out.println("Please Enter the height for Box Shape:");
			bheight=Double.parseDouble(br.readLine());
		if(bheight>0)
			break;
		else
		{
			System.out.println("Enter valid input:");
		}
		}
		Box b=new Box(blength,bbreadth,bheight);
		b.display();
		
	}
}
	
 
