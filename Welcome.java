import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*
<applet code="Welcome" width=400 height=500>
</applet>
*/
public class Welcome extends Applet implements ActionListener
{
Label heading,mainLabel,lowerLabel,upperLabel,italicLabel,boldLabel;
Button lowerCase,upperCase,bold,italic;

public void init()
{
	heading=new Label("String:",Label.CENTER);
	
	lowerCase=new Button("Lower Case");
	lowerCase.addActionListener(this);
	
	upperCase=new Button("Upper Case");
	upperCase.addActionListener(this);
	
	bold=new Button("Bold");
	bold.addActionListener(this);
	
	italic=new Button("Italic");
	italic.addActionListener(this);
	
	mainLabel=new Label("Welcome",Label.CENTER);
	lowerLabel=new Label();
	upperLabel=new Label();
	italicLabel=new Label();
	boldLabel=new Label();
	
	setLayout(new GridLayout(5,2));
	setVisible(true);
	
	add(heading);
	add(mainLabel);
	
	add(lowerCase);
	add(lowerLabel);
	
	add(upperCase);
	add(upperLabel);
	
	add(italic);
	add(italicLabel);
	
	add(bold);
	add(boldLabel);
	
}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==lowerCase)
		{
			String temp=mainLabel.getText();
			lowerLabel.setText(temp.toLowerCase());
			Font myFont=new Font("Courier",Font.PLAIN,20);
			lowerLabel.setFont(myFont);
			lowerLabel.setAlignment(Label.CENTER);
		}
		else if(ae.getSource()==upperCase)
		{
			String temp=mainLabel.getText();
			upperLabel.setText(temp.toUpperCase());
			Font myFont=new Font("Courier",Font.PLAIN,20);
			upperLabel.setFont(myFont);
			upperLabel.setAlignment(Label.CENTER);
		}
		else if(ae.getSource()==italic)
		{
			italicLabel.setText("Welcome");
			Font myFont=new Font("Courier",Font.ITALIC,20);
			italicLabel.setFont(myFont);
			italicLabel.setAlignment(Label.CENTER);
		}
		else
		{
			boldLabel.setText("Welcome");
			Font myFont=new Font("Courier",Font.BOLD,20);
			boldLabel.setFont(myFont);
			boldLabel.setAlignment(Label.CENTER);
		}
	}
}
