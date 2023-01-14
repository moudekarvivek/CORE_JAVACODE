import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;
/*
<applet code="Applet2" width=400 height=500>
</applet>
*/

public class Applet2 extends Applet
{
	public void paint(Graphics g)
	{
		Calendar c= Calendar.getInstance();
		Date d=new Date();
		SimpleDateFormat f=new SimpleDateFormat("dd/MM/yyyy");
		String date=f.format(d);
		int hr=c.get(Calendar.HOUR_OF_DAY);
		int min=c.get(Calendar.MINUTE);
		int sec=c.get(Calendar.SECOND);
		g.drawString(date,20,60);
		//g.drawString(d.toString(),20,60);
		g.drawString(hr+" : "+min+" : "+sec,20,80);
		if(hr>=12 && hr<17)
			showStatus("Good Afternoon");
		else if(hr>=17 && hr<20)
			showStatus("Good Evening");
		else if(hr>=20 && hr<100)
			showStatus("Good Night");
		else
			showStatus("Good morning");
			
	}
}
