package numoperation;
 
public class armstrong
{
 	public void armstrongno(int number)
 	{
 	 int r;
 	 int x=number,sum=0,digit=0;
 	 int y=x;
 	 if(number<0)
           System.out.println("\nNegative number cant be armstrong:");
           
           else
           {
           	while(y>0)
           	{
           		y=y/10;
           		digit=digit+1;
           	}
           	
                while(x>0)
                {
                	int mul=1;
                	r=x%10;
                	for(int i=0;i<digit;i++)
                	{
                		mul=mul*r;
                		//mul=r;
                	}
                	//r=r^digit;
                	sum=sum+mul;
                	x=x/10;
                }
                System.out.println("sum="+sum);
                if(sum==number)
                	System.out.println("\nEntered Number is Armstrong:");
                else
                  System.out.println("\nEntered Number is Not Armstrong:");
            }
         
}   
}               
