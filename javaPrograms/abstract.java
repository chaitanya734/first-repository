interface test{
String add(String s);
}  
class chaitanya
{
    
  public static void main(String args[])
{
  String a="chaitanya";
   test t= (String s)->{return s;};
   t.add(a);}
}