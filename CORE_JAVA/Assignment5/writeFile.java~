import java.io.*;

public class writeFile
{

	public static void main(String args[]) throws IOException
	{
		//InputStream f=new FileInputStream(args[0]);
		FileInputStream fs=new FileInputStream(args[0]);
		BufferedReader br=new BufferedReader(new InputStreamReader(fs));
		
		FileOutputStream even=new FileOutputStream("./even.txt");
		FileOutputStream odd=new FileOutputStream("./odd.txt");
		int linecount=0;
		String line;
		char linearr[];
		//int size=f.available();
		
		try
		{
			while((line=br.readLine())!=null)
			{
				System.out.println(line);
				linecount+=1;
				linearr=line.toCharArray();
				
				if(linecount%2!=0)
				{	for(char ch:linearr)
					    odd.write(ch);
					odd.write('\n');
				}
				else
				{	for(char ch:linearr)
					   even.write(ch);
					even.write('\n');
				}
			}
			
		}
		
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		
		try
		{
			fs.close();
			odd.close();
			even.close();
		}catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}
}		
