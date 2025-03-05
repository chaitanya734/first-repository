package datatypes;
class byteex{
public byte min;
public byte max;
 public byteex(){
    min=Byte.MIN_VALUE;
     max=Byte.MAX_VALUE;
      }
  }
public class bytemain extends byteex{
  public bytemain(){
  byteex obj= new byteex();
System.out.println("byte min value= "+obj.min);
System.out.println("byte max value= "+obj.max);
  
}
 public int add()
{
  int x=100;
  int y=200;
  int c=x+y;
return c;
}

}