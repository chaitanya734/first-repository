class parent{
     void display(){
     System.out.println("parent class");
    }
}
class child extends parent{
    void display(){
    System.out.println("child class");
}
}
class chaitanya{
public static void main(String args[]){
  parent p = new child();
  p.display();
}
}