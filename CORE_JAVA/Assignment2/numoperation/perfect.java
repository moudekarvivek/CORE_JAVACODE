package numoperation;
public class perfect
{

	public void perfectno(int number)
	{
	 if(number<=0)
	 System.out.println("\nNegative number or zero cant be perfect:");
	 
	 else
	 {
	 	int sum=0;
	 	for(int i=1;i<number;i++)
	 	{
	 		if(number%i==0)
	 		{
	 			sum=sum+i;
	 		}
	 	}
	 	if(sum==number)
	 	{
	 		System.out.println("\nEntered number is perfect:");
	 	}
	 	else
	 	{
	 		System.out.println("\nEntered number is not perfect:");
	 		
	 	}
	 }
	
	}
	
} 
