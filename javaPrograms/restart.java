import java.lang.*;
import java.util.Scanner;
class restart {
public static StringBuffer o = new StringBuffer();
  public static void main(String args[])
 {

Scanner s = new Scanner(System.in);
 String name= s.nextLine();
   String[] spli = name.split(" ");
      System.out.println(spli[2]);
    

   for(String n : spli)
{
  o.append(n).append(" ");
}
  System.out.println(o);
    }
}