import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="labels" width=400 height=200>
</applet>
*/

public class labels extends Applet implements MouseMotionListener 
{
	Label l2,l4;
	public void init()
	{
		Label l1=new Label("Mouse X");
		l2=new Label();
		l2.addMouseMotionListener(this);
		Label l3=new Label("Mouse Y");
		l4=new Label();
		l4.addMouseMotionListener(this);
		
		setLayout(new GridLayout(3,2));
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	}
	public void mouseMoved(MouseEvent me)
	{
		l2.setText(String.valueOf(me.getX()));
		l4.setText(String.valueOf(me.getY()));
	}
	public void mouseDragged(MouseEvent me)
	{}
}
