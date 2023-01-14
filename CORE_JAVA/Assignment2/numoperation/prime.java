package numoperation;
public class prime
{

	public static void primeno(int number)
	{
	 int flag=0;
	 
	 if(number<0)
	 	number=number*(-1);
	  
	 if(number==0||number==1)
	    {
	    System.out.println("\nEntered Number is neither prime nor composite:");
	    flag=1;
            }	  
	  else
	  {
	   for(int i=2;i<number;i++)
	   {
	   	if(number%i==0)
	   	{
	   		flag=1;
	   		System.out.println("\nEntered number is not prime number:");
	   		break;
	   	}
	   }
	   
	  }
	 if(flag==0)
	 System.out.println("\nEntered Number is Prime Number:");
	 
	 }
	 
}
	  
