package datatypes.floating;
class doubleex{
  public double a;
  public double b;
    public doubleex()
     {
    a=Double.MIN_VALUE;
    b=Double.MAX_VALUE; 
     }
}
public class doublemain extends doubleex{
    public doublemain()
   {
      doubleex obj = new doubleex();
    System.out.println("double min value= "+obj.a);
    System.out.println("double max value= "+obj.b);
   }
}
 