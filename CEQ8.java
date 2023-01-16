import java.io.*;
class arrayInput
{
    int n;
    int arr[];

    arrayInput()
    {}
    
    public void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter n :");
        n=Integer.parseInt(br.readLine());
        System.out.println("Enter n integers :");
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
    }
}

class printArray extends arrayInput
{
    int i=0;
    String display()
    {
        if(i==(n-1))
            return arr[n-1]+"";
        else    
            return arr[i++]+" "+(display());
    }
}
class CEQ8
{
    public static void main(String args[]) throws IOException
    {
        printArray p=new printArray();
        p.accept();
        System.out.println(p.display());
    }
}