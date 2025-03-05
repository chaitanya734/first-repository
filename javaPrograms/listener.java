package listener;
import java.awt.event.*;
public class listener implements WindowListener
{
      public void windowActivated(WindowEvent e) {
	 System.exit(0);
		
	}
	public void windowClosed(WindowEvent e) {
		 System.exit(0);
	}
	public void windowClosing(WindowEvent e) {
		
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e) {
		
		 System.exit(0);
	}
	public void windowDeiconified(WindowEvent e) {
		System.exit(0);
		
	}
	public void windowIconified(WindowEvent e) {
		
		System.exit(0);
	}
	public void windowOpened(WindowEvent e) {
		 System.exit(0);
		
	}

  }