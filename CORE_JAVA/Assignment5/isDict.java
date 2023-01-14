
import java.io.*;

class isDict
{
	public static void main(String args[])
	{
		File fname=new File(args[0]);
		String extension=".txt";
		
		if(fname.isDirectory())
		{
			FilenameFilter filt=new extFilter(extension);
		
			String[] file_list=fname.list();
			String[] txt_file=fname.list(filt);
		
			System.out.println("Total files present in directory:"+file_list.length);
		
			System.out.println("\n Content of the given directory:");
			for(String f : file_list)
			{
				System.out.println(f);
			}
		
			System.out.println("\n Files in the given directory ending with .txt:");
			for(String f : txt_file)
			{
				System.out.println(f);
			}
		
		}
		else
		{
			System.out.println("\n-------------File Details---------------------\n");
			System.out.println("File name:"+fname.getName());
			System.out.println("length of File:"+fname.length());
			System.out.println("Relative path:"+fname.getPath());
			System.out.println("Absolute path:"+fname.getAbsolutePath());
			System.out.println("Parent:"+fname.getParent());
			System.out.println("Readable:"+fname.canRead());
			System.out.println("Writeable:"+fname.canWrite());
			
			
		}
	}
}
