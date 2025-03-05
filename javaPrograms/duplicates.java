import java.util.*;
import java.lang.*;
class duplicates{
   String names;
   int age;
   double height;
 
   duplicates(String names,int age,double height){
       this.names=names;
       this.age=age;
       this.height=height;
   }
 public static void main(String args[])
{
    duplicates obj= new duplicates("chaitanya",21,6.9);
    duplicates obj1= new duplicates("bharath",20,5.6);
    duplicates obj2= new duplicates("kumar",11,5.7);
    duplicates obj3= new duplicates("reddy",5,6.0);
    duplicates obj4= new duplicates("bhanu",23,6.6);
    duplicates obj5= new duplicates("gani",91,4.6);
    duplicates obj6= new duplicates("mani",24,5.3);
    duplicates obj7= new duplicates("bharath",20,5.6);
    duplicates obj8= new duplicates("kumar",11,5.7);
    duplicates obj9= new duplicates("reddy",5,6.0);
    duplicates obj10= new duplicates("bhanu",23,6.6);
    duplicates obj11= new duplicates("kumar",11,5.7);
    duplicates obj12= new duplicates("reddy",5,6.0);
    duplicates obj13= new duplicates("bhanu",23,6.6);
    duplicates obj14= new duplicates("gani",91,4.6);
    duplicates obj15= new duplicates("mani",24,5.3);
    duplicates obj16= new duplicates("bharath",20,5.6);
Vector<duplicates> ll=new Vector<duplicates>(6,3);
  System.out.println("inital capicaty"+ll.capacity());
    ll.add(obj);
    ll.add(0,obj3);
    ll.add(1,obj4);
    ll.add(2,obj5);
    ll.add(obj6);
    ll.add(obj7);
    ll.add(4,obj8);
    ll.add(obj9);
    ll.add(obj10);
    ll.add(obj11);
    ll.add(obj12);
    ll.add(obj13);
    ll.add(obj14);
    ll.add(obj15);
    ll.add(obj16);
    System.out.println("last capicaty"+ll.capacity());

    System.out.println(ll.size());
   for(duplicates s :ll)
{
    System.out.println(s.names);

}

    }
}