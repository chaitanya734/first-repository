class pojo{
    private int a;
    private String name;
  public void seta(int a){
   System.out.println("this setter of integer value");
    this.a=a;
  }
   public int geta()
{
   return a;
}
  public  void setname(String name){
   System.out.println("this is setter name");
     this.name=name;
     
   }
    String getname(){
    return name;
   }
 
 }
class main{
   public static void main(String args[]){
   pojo obj = new pojo();
   obj.setname("chaitanya");
   obj.seta(507);
   int c=obj.geta();
  String n= obj.getname();
   System.out.println(c+" = "+n);
   }
  }