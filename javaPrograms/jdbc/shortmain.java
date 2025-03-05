package datatypes;
class shortex{
    public short a;
    public short b;
  public shortex(){
    a=Short.MIN_VALUE;
    b=Short.MAX_VALUE;
           }
}
public class shortmain extends shortex{
   public shortmain()
   {
  shortex obj = new shortex();
  System.out.println("short min value= "+obj.a);
  System.out.println("short max value= "+obj.b);
 }
}