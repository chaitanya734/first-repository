package datatypes.floating;
class floatex{
  public float a;
  public float b;
    public floatex()
     {
    a=Float.MIN_VALUE;
    b=Float.MAX_VALUE; 
     }
}
public class floatmain extends floatex{
    public floatmain()
   {
      floatex obj = new floatex();
    System.out.println("float min value= "+obj.a);
    System.out.println("float max value= "+obj.b);
   }
}
 