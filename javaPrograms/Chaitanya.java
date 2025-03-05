package inter.addition;
class bharath{
 public void add(){
  System.out.println("Bharath is small brother of chaitanya");
    }
 }
public class Chaitanya extends bharath {
  public void display(){
      super.add();
      System.out.println("Chaitanya is big brother of bharath");
      }
 }