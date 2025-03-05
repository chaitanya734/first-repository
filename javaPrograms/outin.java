package student.inout;
import java.util.Scanner;
public class outin{
Scanner s = new Scanner(System.in);
 public int size =s.nextInt();
  int result=0;
 public int arr[]=new int[size];
 public outin(){
System.out.println("enter the array numbers");
     for(int i=0;i<arr.length;i++)
    {
       arr[i]=s.nextInt();
    result += arr[i];
    }

  System.out.println("reslult="+result);
 }
}
 