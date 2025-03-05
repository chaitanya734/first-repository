import java.lang.*;
import java.util.*;
class chaitanya
{
   
  public static void main(String args[])
{
    String s="ABABAB";
    String s1="ABAB";
    char arr[] =s.toCharArray();
    char arr1[]=s1.toCharArray();
    int min= Math.min(arr.length,arr1.length);
    char arr2[]=new char[min];
    char arr3[]=new char[min];
    String s2;
    for(int i=0;i<min;i++)
{
   if(arr[i]==arr1[i])
{                                                                        
    arr2[i]=arr[i];
    
 }
  }
   Arrays.sort(arr2);
   for(int k=0;k<arr2.length-1;k++)
{
      if(arr2[k]==arr2[k+1])
  {
     arr3[k]=arr2[k];
   } 
   }
   if (str1.contains(str2)) {
            s2=new String(arr3);
        } else {
            s2=new String(arr2);

        }


       System.out.println(s2);
     }
}