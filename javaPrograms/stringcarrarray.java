import java.lang.String;
class string{
   public static void main(String args[])
{
  String  st ="chaitanya";
  String st1 ="CHhitanya";
   char[] arr;
   arr=st.toCharArray();
     for(int i=0;i<st.length();i++)
{
int a = st.codePointAt(i);
  System.out.println(arr[i]+" = "+a);
   
}
int b= st.codePointBefore(3);
  System.out.println(b);
System.out.println("compar ="+ st.compareToIgnoreCase(st1));
  String str =String.copyValueOf(arr);
System.out.println(str);
}
}