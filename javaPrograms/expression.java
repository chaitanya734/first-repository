
class expression {
public int a=0;
  expression(){
a++;
}
public static void main(String args[])
{
expression o = new expression();
expression o1 = new expression();
expression o2 = new expression();
System.out.println(o.a);
System.out.println(o1.a);
System.out.println(o2.a);


}
  }