import java.io.*;
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
*/
class Student
{
    static int roll_number=0;
    String name;
    double percentage;
    int r;
Student()
{

}

	Student(String name,double percentage)
	{
		roll_number=roll_number+1;
		r=roll_number;
		this.name=name;
		this.percentage=percentage;
	}

	public double getpercent()
	{
		return this.percentage;
	}

	public static void sortStudent(Student[] s,int n)
	{
		for(int i=0;i<n-1;i++)
		{
	 		for(int j=0;j<n-i-1;j++)
	 		{
	  			if(s[j].getpercent()<s[j+1].getpercent())
				{
		 			Student temp=s[j];
		 			s[j]=s[j+1];
		 			s[j+1]=temp;
				}

	 		}
		}	
	}

	public String toString()
	{
		return this.r+" "+this.name+" "+this.percentage+"\n";
	}	
}


class student1
{
	public static void main(String[] args)  

	throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
           	
           	double percentage;
           	String name;
		
		System.out.println("Enter Number of student u want to Enter:");
		int n=Integer.parseInt(reader.readLine());

		Student[] Students=new Student[n];

		for(int i=0;i<n;i++)
		{
			System.out.println(" The Roll number:"+(Student.roll_number+1));
			
			System.out.println("Enter the name of the student:");
			name=reader.readLine();

			System.out.println("Enter the Percentage:");
			while(true)
			{
 				//System.out.println("Enter the Percentage:");
 				 percentage=Double.parseDouble(reader.readLine());

			if(percentage>0)
			break;
			
			else
				System.out.println("Invalid Percentage:");
			}
			

			Students[i]=new Student(name,percentage);
		}
		Student.sortStudent(Students,Students.length);

		for(int i=0;i<Students.length;i++)
		{
		System.out.println("\n"+Students[i]);

		}
	}
}

