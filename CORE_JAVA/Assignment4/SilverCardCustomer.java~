import java.io.*;

class SilverCardCustomer implements CreditCardInterface
{	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	String name;
	String cardnumber;
	int creditamount=0;
	 int creditlimit=50000;
	static int count;
	
	SilverCardCustomer(String name,String cardnumber)
	{
		this.name=name;
		this.cardnumber=cardnumber;
		
	}
	
	public void viewCreditAmount()
	{
		System.out.println("Your credit amount is:"+creditamount);
	}
	
	public void usecard(int creditamount)
	{
		if(this.creditamount+creditamount>creditlimit)
		{
		
			System.out.println("Transaction fail you cannot use greater than limit:");
		}
		else
		{
			this.creditamount=this.creditamount+creditamount;
			System.out.println("Transaction successfull:");
		}
	}
	
	public void paycredit(int amount)
	{
		if(amount<=creditamount && amount>0)
		{
			creditamount=creditamount-amount;
			System.out.println("transaction successfull:");
		}
		
		else
		  System.out.println("Transaction fail you cannot pay amount greater than credit AMOUNT:");
	}
	
	public void increaselimit()
	{
		System.out.println("increase limit facility is not applicable for silver card:");
	}
	
}

class GoldCardCustomer extends SilverCardCustomer
{

int count=0;

	GoldCardCustomer(String name,String acc)
	{
		super(name,acc);
		creditlimit=100000;
	}
	public void increaselimit()
	{	if(count<3)
		{
			creditlimit+=5000;
			System.out.println("Transaction Successfull your limit increased");
			count++;
		}
		else	
		  System.out.println("transaction failed u have used all the limit :");
	}
	
}

class  creditmain
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the customer type \n1.Silvercard \n2.GoldCard \n3.Exit \nEnter type of customer:");
		int op=Integer.parseInt(br.readLine());

if(op==1)
{
	System.out.println("you are silver card customer:");
	System.out.println("Enter name");
	String name=br.readLine();
	System.out.println("Enter account number:");
	String acc;
	while(true)
	{
		acc=br.readLine();
		if(acc.length() ==16 && acc.matches("[0-9]+") )
		break;
		
		else
			System.out.println("please enter 16 digit account number:");
	}
	
	SilverCardCustomer s=new SilverCardCustomer(name,acc);
	int ch;
	
	do
	{
		System.out.println("\n1.View credit amount\n2.use credit\n3.pay credit\n4.increase limit \n5.exit\nEnter your choice:");
		ch=Integer.parseInt(br.readLine());
		
		switch(ch)
		{
			case 1:
				s.viewCreditAmount();
				break;
				
			case 2:
				System.out.println("Enter amount to use:");
				int amount=Integer.parseInt(br.readLine());
				s.usecard(amount);
				s.viewCreditAmount();
				break;
			
			case 3:
				System.out.println("Enter amount to pay");
				int a=Integer.parseInt(br.readLine());
				s.paycredit(a);
				s.viewCreditAmount();
				break;
				
			case 4:
				s.increaselimit();
				break;
			case 5:
			        break;
			default:System.out.println("invalid:");
		}
	}while(ch!=5);
}

else if(op==2)
{
	System.out.println("gold card user");
	System.out.println("Enter your name");
	String name=br.readLine();
	System.out.println("Enter account number:");
	String acc;
	while(true)
	{
		acc=br.readLine();
		if(acc.length()==16 && acc.matches("[0-9]+"))
		break;
		
		else
			System.out.println("please enter valid 16 digit card number");
	}
	GoldCardCustomer s=new GoldCardCustomer(name,acc);
	int ch;
	do
	{
		System.out.println("\n1.View credit amount\n2.use credit\n3.pay credit\n4.increase limit \n5.exit\n6.Enter your choice:");
		ch=Integer.parseInt(br.readLine());
		
		switch(ch)
		{
			case 1:
				s.viewCreditAmount();
				break;
				
			case 2:
				System.out.println("Enter amount to use:");
				int amount=Integer.parseInt(br.readLine());
				s.usecard(amount);
				s.viewCreditAmount();
				break;
			
			case 3:
				System.out.println("Enter amount to pay");
				int a=Integer.parseInt(br.readLine());
				s.paycredit(a);
				s.viewCreditAmount();
				break;
				
			case 4:
				s.increaselimit();
				break;
			case 5:
			        break;
			default:System.out.println("invalid:");
		}
	}while(ch!=5);

}
else if(op==3)
{
	System.out.println("Enter valid input:");
}	
}
}
