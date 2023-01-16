import java.applet.*;
import java.util.Random;
import java.awt.*;
import java.awt.event.*;

/*
<applet code=Q7 width=500 height=200>
</applet>
*/
public class Q7 extends Applet implements ActionListener
{
	Label number1,number2,symbol;
	TextField t;
	Button b;
	int actualResult;
	
	public void paint(Graphics g)
	{
		Random r=new Random();
		int random_integer1=r.nextInt(10-1)+1;
		System.out.println("random_integer1"+random_integer1);
		int random_integer2=r.nextInt(20-11)+11;
		System.out.println("random_integer2"+random_integer2);
		
		actualResult=random_integer1+random_integer2;
		System.out.println("actualresult"+actualResult);
		
		number1=new Label(String.valueOf(random_integer1));
		number1.setBounds(30,30,20,30);
		symbol=new Label("+");
		symbol.setBounds(50,30,30,30);
		
		number2=new Label(String.valueOf(random_integer2));
		number2.setBounds(80,30,20,30);
		
		t=new TextField(20);
		t.setBounds(150,30,100,30);
		
		b=new Button("check");
		b.addActionListener(this);
		b.setBounds(100,90,50,30);
		
		add(number1);
		add(symbol);
		add(number2);
		add(t);
		add(b);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		int result=Integer.valueOf(t.getText());
		if(result==actualResult)
			showStatus("Correct answer");
		else
			showStatus("incorrect answer");
			
	}

}
