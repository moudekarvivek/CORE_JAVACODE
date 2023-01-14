import MscCAI.*;
import MscCAII.*;
import java.io.*;

public class Student
{
	static int rollnumber=1;
	int r,CAI,CAII,total;
	String name,Grade;
	
	
Student(String name,int CAI,int CAII)
	{
		this.name=name;
		this.CAI=CAI;
		this.CAII=CAII;
		r=rollnumber;
		rollnumber++;
		
	}
	
	void calcgrade()
	{
		total=CAI+CAII;
		float per=(total*100)/400;
		if(per>=70)
		{
			Grade="A";
		}
		else if(per>=60)
		{
			Grade="B";
		}
		else if(per>=50)
		{
			Grade="C";
		}
		else if(per>=40)
		{
			Grade="Pass";
		}
		else
		{
			 Grade="fail";
		}
	}
public String toString()
	{
	return  "rollnumber:"+r+"  name:"+name+"  CAI:"+CAI+"  CAII:"+CAII+" Grade"+Grade;

	}
}
class student1
{
	public static void main(String args[]) throws IOException
	{int m1,m2,m3,m4;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter How many student u want:");
		int n=Integer.parseInt(reader.readLine());
		
		Student[] st=new Student[n];
		MscCAI[] obj1=new MscCAI[n];
		MscCAII[] obj2=new MscCAII[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("rollnumber:"+Student.rollnumber);
			
			System.out.println("Enter name:");
			String name=reader.readLine();
			
			System.out.println("Enter the yearI Sem I marks:");
		        while(true)
		        {       m1=Integer.parseInt(reader.readLine());	
		        	if(m1>=0 && m1<=100)
		        	{
				  
			         break; 		
				}
				else
				{
				System.out.println("Please Enter the Valid Input:");
				}
			}		
			
			System.out.println("Enter the yearI Sem II marks:");//marks m2 Entry
			 while(true)
		         {       m2=Integer.parseInt(reader.readLine());	
		        	if(m2>=0 && m2<=100)
		        	{
				  
			         break; 		
				}
				else
				{
				System.out.println("Please Enter the Valid Input:");
				}
			 }		
			
		
	
			System.out.println("Enter the yearII Sem I marks:");
			 while(true)
		         {       m3=Integer.parseInt(reader.readLine());	
		        	if(m3>=0 && m3<=100)
		        	{
				  
			         break; 		
				}
				else
				{
				System.out.println("Please Enter the Valid Input:");
				}
			 } 		
			
	         	
	         	System.out.println("Enter the yearII Sem II marks:");
			 while(true)
		         {       m4=Integer.parseInt(reader.readLine());	
		        	if(m4>=0 && m4<=100)
		        	{
				  
			         break; 		
				}
				else
				{
				System.out.println("Please Enter the Valid Input :");
				}
			 }		
				
		
			obj1[i]=new MscCAI(m1,m2);
			int CAI=obj1[i].gettotal();
			
			obj2[i]=new MscCAII(m3,m4);
			int CAII=obj2[i].gettotal();
					
			st[i]=new Student(name,CAI,CAII);
			st[i].calcgrade();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(st[i]);
		}
	}
	
}


