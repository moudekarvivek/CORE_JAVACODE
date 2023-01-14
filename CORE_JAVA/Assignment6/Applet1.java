import java.awt.*;
import java.applet.*;
/*
<applet code="Applet1" width=400 height=500>
</applet>
*/

public class Applet1 extends Applet
{
	String msg;
	String msg1=null;
	public void init()
	{
		msg="in init method";
	}
	public void start()
	{
		msg1="in start method";
	}
	
	public void paint(Graphics g)
	{
		setBackground(Color.blue);
		g.setColor(Color.yellow);
		//setForeground color yellow
		g.drawString(msg,20,20);
		g.drawString(msg1,20,50);
		g.drawString("In Paint Method",20,80);	
	}
}

