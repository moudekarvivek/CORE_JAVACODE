import java.io.*;

class wordCount
{
	public static void main (String args[]) throws IOException{
	String filename=args[0];
	File f1=new File(filename);
	
	FileInputStream fs=new FileInputStream(f1);
	BufferedReader br=new BufferedReader(new InputStreamReader(fs));
	String line;
	int countchar=0,countword=0,countline=0;
	int checkedin=0;
	try
	{
		if(f1.exists())
		{
			while((line=br.readLine())!=null)
			{	//char Array[]=line.toCharArray();
				//countchar += Array.length;
				String words[]=line.split("\\s+");
				for(String s:words)
				{
					if(s.matches("[a-zA-Z0-9]+"))
					{
					 System.out.println(s);
					 countword++;
					}
				}
				String lines[]=line.split("\n");
				countline +=lines.length;
				countchar+=line.length();
			}
			System.out.println("Count char:"+(countchar + countline));
			System.out.println("Count Word:"+countword);
			System.out.println("Count Line:"+countline);
		}
	}
	catch(IOException IO)
	{
		System.out.println("Something went wrong");
	}
	finally
	{
		try
		{
		 fs.close();
		}
		catch(IOException io)
		{
			System.out.println(io);
		}
	}

		
}
}
				
