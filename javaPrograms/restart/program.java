import java.util.*;
 class chaitanya{
 public static void main(String args[])
{
  
   int a=434;
    int result=0;
    String s= String.valueOf(a);
  char arr[]=new char[s.length()];
   
    for(int i=0;i<s.length();i++)
    {
  arr[i] = s.charAt(i);
      result = result+ Character.getNumericValue(arr[i]);
   }
   System.out.println(result);
}
}
