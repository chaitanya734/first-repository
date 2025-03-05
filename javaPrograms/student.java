package student;
class parent{
   public parent(){
    System.out.println("parents");
}
    public void add(int a,int b){
    System.out.println(a+b);
}
}
class child extends parent{
   public child(){
    int p=10;
    int c=20;
    super.add(p,c);
System.out.println("child class");
}
}
    