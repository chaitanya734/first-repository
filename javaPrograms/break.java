class chaitanya{
public static void main(String args[])
{ 
  for(int i=0;i<10;i++)
{
   for(int j=0;j<10;j++)
  {
    if(j==5)
      {
          System.out.println(" second loop "+j);
          break;
       }
  }
      if(i==3){
    System.out.println("first loop ="+i);
    break;
}
}
}
}
