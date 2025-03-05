import java.util.Scanner;
class chaitanya{
  Scanner s1 = new Scanner(System.in);
//starting and ending point of the house
 int s =s1.nextInt();
 int t=s1.nextInt();
 //apple tree and orange tree position
 int a=s1.nextInt();
 int b=s1.nextInt();
//no of apples and no of oranges size
 int m=s1.nextInt();
 int n =s1.nextInt();
//no.of apples and no of oranges
int apple[] = new int[m];
int orang[] = new int[n];
//duplicates apples and oranges 
int app[] = new int[m];
int org[] = new int[n];
int count=0;
int temp=0;
   chaitanya(){
  //apple loop
   for(int i=0;i<apple.length;i++){
      app[i]=a+apple[i];
          if(app[i]>=s && app[i]<=t)
                {
                   count++;
               }
        }
           for(int j=0;i<orang.length;j++){
      org[j]=b+org[i];
          if(org[i]>=s && org[i]<=t)
                {
                   temp++;
               }
        }

   }
}
class bharath {
public static void main(String args[])
{
  chaitanya obj = new chaitanya();
}
}


  