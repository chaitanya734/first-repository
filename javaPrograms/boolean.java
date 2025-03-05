import java.awt.*;
import java.awt.event.*;
import  listener.listener;
class data {
public static void main(String args[])
{
    Frame obj = new Frame("chaitanya");
         obj.setSize(400,400);
         obj.setVisible(true);
     obj.addWindowListener(new listener());
   }
}