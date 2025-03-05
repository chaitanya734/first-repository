import java.applet.*;
import java.awt.*;
 public class exapp extends Applet
{
   String mes=" ";
  public void init()
{
  mes =mes+"init------------->";
}
public void start()
{
mes =mes+"start------------->";

}

public void stop()
{
mes =mes+"stop------------->";

}

public void destroy()
{
mes =mes+"destroy------------->";

}

  public void paint(Graphics g)
   {
     g.drawString("chaitanya kumar reddy ",20000,50000);
   }
}