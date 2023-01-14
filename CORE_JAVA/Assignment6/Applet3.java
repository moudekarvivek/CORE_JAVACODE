import java.awt.*;
import java.applet.*;
import java.util.*;
import java.text.*;
/*
<applet code="Applet3" width=400 height=500>
<param name=str value=Vivek>
</applet>
*/

public class Applet3 extends Applet
{	String str,vovelString="";
	public void paint(Graphics g)
	{
		str=getParameter("str");
		char[] strarr=str.toCharArray();
		g.drawString(str,20,20);
		for(char ch: strarr)
		{
			if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			vovelString+=ch+" ";
		}
		
		showStatus(vovelString);
		
	}
}
