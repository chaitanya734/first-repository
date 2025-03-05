interface test{
  String empty(String s);
}
class testex
{
String s;
  public static void main(String args[]){

  test t = (String s)->{ 
        String y;
      if(s.empty()){y="empty";
         }
      else{
        y="notempty"; 
        }
          System.out.println(s); 
         return y;      
            };
   t.empty("chaitanya");
}
}