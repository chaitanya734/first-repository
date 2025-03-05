package student.words.concat;
import java.util.Scanner;
public class cocat{
Scanner s = new Scanner(System.in);
String s1=s.nextLine();
String s2=s.nextLine();

  public cocat(){
  System.out.println("enter the strings");
     String s3=s1.concat(s2);
   System.out.println(s3);
   String s4= " chaitanya kumar reddy ";
   String s5 =s4.trim();
   String s7 = "chaitanya";
   String s6=s5.replaceAll(s7,"bharath");
System.out.println(s6);
  boolean b= s1.equals(s2);
 System.out.println(b);
 
 System.out.println(s2.compareTo(s1));
      }
}

       
     
