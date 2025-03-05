import java.util.*;
class collection 
{
    String name;
    int id;
   collection(String n,int i)
{
   name=n;
   id=i;
  }
  public static void main(String a[])
{
  /*interface
      1)set
          i)HashSet<>
          2)linkedHashSet<>*/
  collection i = new collection("chaitanya",4);
  collection i1 = new collection("chaitanya",4);
  collection i2 = new collection("chaitanya",4);
  collection i3 = new collection("chaitanya",4);
  collection i4 = new collection("chaitanya",4);
  collection i5 = new collection("chaitanya",4);
 for(int j=0; j<5;j++)
{
   System.out.println(i[j].name);
  System.out.println(i[j].id);
}
   
}
}
