import java.util.*;
import java.lang.*;
class student{
 String name;
 int age;
 float height;
  student(String name, int age, float height){
  this.name=name;
  this.age = age;
  this.height =height;
}
}
class teacher{
  public static void main(String args[]) 
{
 student s = new student("chaitanya",21,(float)5.4);
 student s1 = new student("kumar",21,(float)5.4);
 student s2 = new student("reddy",21,(float)5.4);
 student s3 = new student("bhimireddy",21,(float)5.4);
 student s4 = new student("chitu",21,(float)5.4);
 System.out.println(s.hashCode());
  student students[] = new student[5];
try{
System.out.println(students[0].hashCode());
}
catch(NullPointerException e)
{
 System.out.println("A NullPointerException is a runtime exception that occurs when a program attempts to use an object reference that has the null value. It is one of the most common errors in Java");
}
finally
{
   System.out.println("please allow up steps");
}
  for(int i=0;i<students.length;i++)
{
   
    student s5 = students[i];
   if(s5!=null)
   System.out.println(s5.name+" ="+s5.age+"="+s5.height);
}
}
}