import java.awt.*;
import javax.swing.*;

/*<applet code="prog1" width=400 height=400>
</applet>
*/

public class prog1 extends JApplet
{

	JLabel l1,l2,l3,l4,l22,l33,l44;
	JTextField t1;
	JButton b1,b2;
	
	public void init()
	{
	
		setLayout(new GridLayout(5,2));
		l1=new JLabel("Decimal");
		t1=new JTextField(10);
		l2=new JLabel("Binary");
		l22=new JLabel("Result in binary");
		l3=new JLabel("Octal");
		l33=new JLabel("Result in Octal");
		l4=new JLabel("Hexadecimal");
		l44=new JLabel("Result in Hexadecimal");
		b1=new JButton("Convert");
		b2=new JButton("Exit");
		
		t1.setEditable(false);
		
		add(l1);
		add(t1);
		add(l2);
		add(l22);
		add(l3);
		add(l33);
		add(l4);
		add(l44);
		add(b1);
		add(b2);
	}
}
