import java.awt.*;
import java.applet.*;

/*
<applet code="labels" width=400 height=200>
</applet>
*/

public class labels extends Applet 
{

public void init()
{
Label l1=new Label("Mouse X");
Label l2=new Label("Mouse X Coordinate");
Label l3=new Label("Mouse Y");
Label l4=new Label("Mouse Y coordinate");

setLayout(new GridLayout(3,2));
add(l1);
add(l2);
add(l3);
add(l4);
}
}
