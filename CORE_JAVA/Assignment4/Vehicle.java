import java.io.*;

class Vehicle
{
	String company;
	double price;

	void accept() throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("Enter the Company ");
	company=br.readLine();
	
	System.out.println("Enter price:");
	while(true)
	{
		price=Double.parseDouble(br.readLine());
		
		if(price>0)
		    break;
		    
		 else
		 {
		 	System.out.println("please Enter valid input:");
		 }
	}
	
	}
	
	void display()
	{	System.out.println("+--------------------------------------------+");
		System.out.println("Company:"+company+" Price:"+price);
		
	}
	
}


class LightMotorVehicle extends Vehicle
{	double mileage;
		
	void accept() throws IOException
	{	super.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Mileage:");
		while(true)
		{
			 mileage=Double.parseDouble(br.readLine());
			if(mileage>0)
			    break;
			else
			{
				System.out.println("Enter valid input:");
			}    
		}
		//System.out.println("MIleage:"+mileage);
	}

	
	
	void display()
	{
		super.display();
		System.out.println("Mileage:"+mileage);	
		System.out.println("+--------------------------------------------+");
	}
}

class HeavyMotorVehicle extends Vehicle
{	double capiton;
	
	void accept() throws IOException
	{	
		super.accept();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the capacity:");
		 while(true)
		 {
		 	capiton=Double.parseDouble(br.readLine());	
			if(capiton>0)
				break;
			else
				System.out.println("Enter valid input:");
		}
	
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity in tons is :"+capiton);
		System.out.println("+--------------------------------------------+");
	
	}
}

class Main
{

public static void main(String args[]) throws IOException
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	double mileage,capiton;
	
	/*System.out.println("Please Enter the Type of vehicle:");
	System.out.println("1.LightMotorVehicle:");
	System.out.println("2.HeavyMotorVehicle:");
	System.out.println("3.Exit:");*/
	
	int ch;
	
	do
	{
		System.out.println("Please Enter the Type of vehicle:");
		System.out.println("1.LightMotorVehicle:");
		System.out.println("2.HeavyMotorVehicle:");
		System.out.println("3.Exit:");
		ch=Integer.parseInt(br.readLine());
	switch(ch)
	{	
			case 1:
			System.out.println("Please Enter The Number of lightmotorVehicle:");
			int n=Integer.parseInt(br.readLine());
			
			LightMotorVehicle l[]=new LightMotorVehicle[n];	
			
			for(int i=0;i<n;i++)
			{	l[i]=new LightMotorVehicle();
				l[i].accept();
			}
			for(int i=0;i<n;i++)
			{
				l[i].display();
			}
			break;
			
		case 2:
			System.out.println("Please Enter The Number of HeavymotorVehicle:");
			int m=Integer.parseInt(br.readLine());
				
			HeavyMotorVehicle h[]=new HeavyMotorVehicle[m];
			
			for(int i=0;i<m;i++)
			{	
				h[i]=new HeavyMotorVehicle();
				h[i].accept();	
			}
			
			for(int i=0;i<m;i++)
			{
				h[i].display();	
			}
			break;
		
		
		case 3:
			System.out.println("Enter valid input:");
			break;
	
		}
	}while(ch!=3);
}				
		
}		


