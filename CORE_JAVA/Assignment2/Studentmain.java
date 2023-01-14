import MscCAI.*;
import MscCAII.*;
import java.io.*;
public class Studentmain
{
	int rollnumber;
	String name;
	//MscCAI
	 MscCAI ms=new MscCAI();
	//MscCAII 
	MscCAII ms1=new MscCAII();

	Studentmain()
	{

	}
	Studentmain(int rno,String name,int y1s1,int y1s2,int y2s1,int y2s2)
	{
	this.rollnumber=rno;
	this.name=name;
	this.MscCAI.setsumtotal(this.y1s1,this.y1s1);
	this.MscCAII.setsumtotal(this.y2s1,this.y2s2);
	}

	static int addmark(MscCAI ca1,MscCAII ca2)
	{
	return ca1.gettotal() + ca2.gettotal();
	}	

	public static void main(String args[])
	throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Please Enter The Number of student u want to enter:");
		int n=Integer.parseInt(reader.readLine());

		Studentmain[] st=new Studentmain[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the Roll number:");
			int rollnumber=Integer.parseInt(reader.readLine());
	
			System.out.println("Enter the name of student:");
			String name=reader.readLine();
	
			System.out.println("Enter the yearI Sem I marks:");
			int y1s1=Integer.parseInt(reader.readLine());
	
			System.out.println("Enter the yearI Sem II marks:");
			int y1s2=Integer.parseInt(reader.readLine());
	
			System.out.println("Enter the yearII Sem I marks:");
			int y2s1=Integer.parseInt(reader.readLine());
	         	
	         	System.out.println("Enter the yearII Sem II marks:");
			int y2s2=Integer.parseInt(reader.readLine());
			
			st[i]=new Studentmain(rollnumber,name,y1s1,y1s2,y2s1,y2s2); 
		}
		
		//public String toString()
		for(i=0;i<n;i++)
		{
		 System.out.println(st[i].rollnumber+" "+st[i].name+" "+st[i].y1s1+" "+st[i].y1s2+" "+st[i].y2s1+" "+st[i].y2s2);
		}
		
		int total=addmark(s.MscCAI,s.MscCAII);
		System.out.println("total is:"+total);
		//if(total>=70);
	
	}
}		
