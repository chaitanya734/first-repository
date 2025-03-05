import java.lang.*;
class chaitanya
{
   public static void main(String a[])
{
  //string concat(string s);
  String s="CHAITANYA KUMAR REDDY";
  String s2="chaitanya kumar reddy"; 
  String s3="bharath kumar reddy";
  String s1=s.concat(" chaitanya kumar reddy");
  System.out.println(" "+s1);
  //char charAt(int i)
   char x = s.charAt(5);
    char x1 = s.charAt(15);
     char x2 = s.charAt(10);
    System.out.println(" "+x+""+x1+""+x2);
     int i=s.length();
    System.out.println(""+i);
  boolean b=s3.equals(s2);
   System.out.println(""+b);
  String u=s2.toUpperCase();
 System.out.println(""+u);
  String l=s.toLowerCase();
 System.out.println(""+l);
  boolean st=s2.startsWith("chaitanya");
   boolean e=s2.endsWith("reddy");
 System.out.println("starts="+st+"  \nends="+e);
   int in = s.indexOf("ch");
   System.out.println(""+in);
}
} 