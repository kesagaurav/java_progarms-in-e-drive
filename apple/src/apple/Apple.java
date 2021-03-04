package apple;
import java.awt.*;
import java.applet.*;

public class Apple {
	public class applet2 extends Applet
	{
	public void paint(Graphics g)
	{
	String name;
	int age;
	name=getParameter("name");
	age=Integer.parseInt(getParameter("age"));
	if(age>18)
	g.drawString("you are eligible for vote",800,900);
	else
	g.drawString("you are not elgible for vote",800,900);
	g.drawString("name="+name,800,900);
	g.drawString("age="+age,800,900);
	}
	}

}
