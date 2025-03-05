abstract class india{
   int a;
   int b;
int c;
  void add(int a,int b)
    {
   this.a=a;
   this.b=b;
   this.c=a+b;
   System.out.println("abstract class add method="+ c);
    }
abstract void strick();
}
class ap extends india{
     ap(int a,int b){
       super.add(a,b);
             }
void strick(){
      System.out.println("ther is no strick in ap");
            }
  
   }
class teg extends india{
    teg(int a,int b)
{ 
     super.add(a,b);
    }
}
class mainclass {
public static void main(String args[])
{
  ap obj = new ap(4,5);
  teg obj1 = new teg(10,30);
obj1.strick();
}
}
