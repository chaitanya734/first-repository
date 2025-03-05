package datatypes;
class longex{
  public long a;
  public long b;
    public longex()
     {
    a=Long.MIN_VALUE;
    b=Long.MAX_VALUE; 
     }
}
public class longmain extends longex{
    public longmain()
   {
      longex obj = new longex();
    System.out.println("long min value= "+obj.a);
    System.out.println("long max value= "+obj.b);
   }
}
 