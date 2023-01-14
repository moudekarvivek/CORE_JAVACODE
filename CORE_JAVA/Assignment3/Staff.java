import java.io.*;
abstract class Staff
{
	String name,address;
	Staff(String name,String address)
	{
		this.name=name;
		this.address=address;
		
	}

}

class FullTimeStaff extends Staff
{   String department;
	double salary;
	
	FullTimeStaff(String name,String address,String department,double salary)
	{	super(name,address);
	
		this.department=department;
		this.salary=salary;
	}
	
	void display()
	{	System.out.println("The nameis:"+name);
		System.out.println("The Department is:"+department);
		System.out.println("The Salary is:"+salary);
		
	}
	
}

class PartTimeStaff extends Staff
{	double hours,rate;
	

	PartTimeStaff(String name,String address,double hours,double rate)
	{	super(name,address);
		this.hours=hours;
		this.rate=rate;
	}
	
	void display()
	{
		System.out.println("The staff work for this is:"+hours);
		System.out.println("The rate per hour is:"+rate);
		
		
	}
}

class Sa2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int ch,n,i,j;
		double salary,hours,rate;
		do
		{
			
			System.out.println("Please Enter the option:1:Fulltime staff/2:parttimestaff:");
			 ch=Integer.parseInt(br.readLine());
			
			switch(ch)
			{
				case 1:
					System.out.println("Please Enter the Number of Employees u want to enter:");
					 n=Integer.parseInt(br.readLine());
					FullTimeStaff fs[]=new FullTimeStaff[n];
					
					
					for(i=0;i<n;i++)
					{
					
						System.out.println("Please Enter the Employee name:");
						String name=br.readLine();
			
						System.out.println("Enter address of employee:");
						String address=br.readLine();
			
						System.out.println("Enter department :");
						String department=br.readLine();
			
						while(true)
						{
				 			System.out.println("Please Enter the salary:");
							salary=Double.parseDouble(br.readLine());

						if(salary>0)
							break;
						else
						{
							System.out.println("Enter valid input:");
						}
									
						}
						fs[i]=new FullTimeStaff(name,address,department,salary);
					
					}
						
						
						for(i=0;i<n;i++)
						{
							fs[i].display();
						}
						break;
						
					
					
				
				case 2:
					System.out.println("Please Enter the Number of Employees u want to enter:");
					 n=Integer.parseInt(br.readLine());
					
					PartTimeStaff ps[]=new PartTimeStaff[n];
					
					for(j=0;j<n;j++)
					{
				
				
						System.out.println("Please Enter the Employee name:");
						String name=br.readLine();
		
						System.out.println("Enter address of employee:");
						String address=br.readLine();
				
					while(true)
					{
							System.out.println("Enter hours :");
							 hours=Double.parseDouble(br.readLine());
						
						if(hours>0)
					 	break;
					
						else
						{
							System.out.println("Enter valid input:");
						}
					}
					while(true)
					{
						System.out.println("Enter the Rate:");
						rate=Double.parseDouble(br.readLine());	
						if(rate>0)
						break;
						
						else
						{
							System.out.println("enter valid input:");
						}
					}
						ps[j]=new PartTimeStaff(name,address,hours,rate);
					
					}
					
					for(j=0;j<n;j++)
					{
						ps[j].display();
					}
					break;
					
				
				case 3:	
					System.exit(0);
				default:
					System.out.println("Invalid input:");
					
			}
		}while(ch!=3);
	}		
}											
		
