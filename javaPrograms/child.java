package student;
class parent{
   public parent(){
    System.out.println("parents");
}
    public void add(int a,int b){
    System.out.println(a+b);
}
}
public class child extends parent{
   public child(){
    super();
    super.add(10,20);
    System.out.println("child class");
}
}
    