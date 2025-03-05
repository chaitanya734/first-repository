import java.util.*;
class linked{
  String name;
  int age;
  double height;
     linked(String name,int age,double height){
     this.name=name;
     this.age=age;
     this.height=height;
       }
}
 class list{
   public static void main(String args[])
{
   linked obj = new linked("chaitanya",10,5.5);
   linked obj1 = new linked("bharath",10,5.5);
   linked obj2 = new linked("kumar",10,5.5);
   linked obj3= new linked("chaitanya",10,5.5);
   linked obj4= new linked("chaitanya",10,5.5);
   linked obj5= new linked("chaitanya",10,5.5);
   linked obj6= new linked("chaitanya",10,5.5);
LinkedList<linked>  ob = new LinkedList<linked>();
    ob.add(obj);
    ob.addFirst(obj1);
    ob.addLast(obj2);
    ob.add(obj4);
    ob.add(obj5);
    ob.add(obj6);
 for(linked l1:ob)
{
  System.out.println(l1.name);
}
        System.out.println(ob);
}
}
   
         