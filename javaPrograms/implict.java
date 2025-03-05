class implict{
 public static void main(String args[])
{
 String  st ="31234";
try{
 long a = Long.parseLong(st);

System.out.println(a);
}
catch(Exception e)
{
System.out.println(e);
}
}
}