import java.io.*;
/*public class CEQ10
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter array size:");
		int size=Integer.parseInt(br.readLine());
		String arr[]=new String[size];
		System.out.println("Enter strings :");
		for(int i=0;i<size;i++)
		{
			arr[i]=br.readLine();
		}
		System.out.println("String elements are :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("String elements after sorting :");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}

	}
}*/
public class CEQ10
{
	static String[] arr;
	static void sort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENter array size:");
		int size=Integer.parseInt(br.readLine());
		arr=new String[size];
		System.out.println("Enter strings :");
		for(int i=0;i<size;i++)
		{
			arr[i]=br.readLine();
		}
		sort();
		System.out.println("after sorting");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}