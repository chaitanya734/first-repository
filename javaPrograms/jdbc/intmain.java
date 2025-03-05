package datatypes;
class intex{
  public int a;
  public int b;
    public intex()
     {
    a=Integer.MIN_VALUE;
    b=Integer.MAX_VALUE; 
     }
}
public class intmain extends intex{
    public intmain()
   {
      intex obj = new intex();
    System.out.println("int min value= "+obj.a);
    System.out.println("int max value= "+obj.b);
   }
}
 