import java.awt.*;
import java.awt.event.*;
 class frames  {
	public void paint(Graphics g)
	{
		g.drawLine(0, 1, 250, 350);
	}
	frames(){
	
		Frame f = new Frame();
		f.setSize(2000, 2000);
		f.setVisible(true);
		
	}	
		
	
}
 class frame1  {
	public void paint(Graphics g)
	{
		g.drawString("CHAITANYA", 80, 100);
	}
	frame1() {
Frame ob = new Frame();
	ob.setSize(2000, 2000);
	ob.setVisible(true);

	}
}
 class mainclass {
	public static void main(String args[])
	{ 
		
		frames f1= new frames();
		frame1 f2 = new frame1();
	}

}

