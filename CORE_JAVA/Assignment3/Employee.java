import java.io.*;

class Employee
{	static int eid;
	private int id;
	private String name,department;
	protected double salary;

	Employee()
	{

	}


	Employee(String name,String department,double salary)
	{	eid++;
		id=eid;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}
	void display()
	{	System.out.println("------------------------------------");
		System.out.println("ID:"+id);
		System.out.println("The name is:"+name);
		System.out.println("The department is:"+department);
		System.out.println("The salary is:"+salary);
		System.out.println("------------------------------------");
	}


}
class Manager extends Employee
{
	private double Bonus;
	double total=0;
	
	Manager(String name,String department,double salary,double Bonus)
	{
		super(name,department,salary);
		total=super.salary+Bonus;
	}
	
	void display()
	{//will display salary after adding Bonus;
		super.display();	
		System.out.println("Total Salary is :"+total);
	
	}
	private double findmax(Manager m[])
	{
		double max=m[0].total;
		for(int i=0;i<m.length;i++)
		{
			if(max<m[i].total)
			max=m[i].total;
		}
		return max;
	}
			
			
	
	
	void displaymax(Manager m[])
	{
		System.out.println("-----------------------------------:");
		System.out.println("Manager with max salary:");
		double maxsal=findmax(m);
		{
			for(int i=0;i<m.length;i++)
			{
				if(maxsal==m[i].total)
				m[i].display();
			}
		}
		

	}
}

class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
		double Bonus,salary;
		
		System.out.println("Please Enter The Employee U want to Enter:");
		int n=Integer.parseInt(br.readLine());
		Manager m[]=new Manager[n];
		for(int i=0;i<n;i++)
		{	
			System.out.println("------------------------------------");
			System.out.println("Enter the name of Employee:");
			String name=br.readLine();
			
			System.out.println("Enter the department of Employee:");
			String department=br.readLine();
			while(true)
			{
				System.out.println("Enter the salary of Employee:");
				 salary=Double.parseDouble(br.readLine());
			
			if(salary>0)
			break;
			
			else
			{
				System.out.println("Enter Valid Input:");
			}
			
			}
		
			
			while(true)
			{	
				 System.out.println("Enter Bonus:");
				 Bonus=Double.parseDouble(br.readLine());
			if(Bonus>0)
			break;
			
			else
			{
				System.out.println("Enter valid Bonus:");
			}
			}
			m[i]=new Manager(name,department,salary,Bonus);
		}
		for(int i=0;i<n;i++)
		{
			m[i].display();
		}
		m[0].displaymax(m);
		
		/*double max=m[0].total;
		int maxo=0;
		for(int i=1;i<n;i++)
		{
			if(max<m[i].total)
			{
				max=m[i].total;
				maxo=i;
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++:");
		System.out.println("The Maximum salary of Employee is:");
		m[maxo].display();
		*/
	}
}	
