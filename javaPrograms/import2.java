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
int app;
int org;
int count=0;
int temp=0;
   chaitanya(){
   for(int c=0;c<apple.length;c++)
{
    apple[c]=s1.nextInt();
}
for(int d=0;d<orang.length;d++)
{
    orang[d]=s1.nextInt();
}

  //apple loop
   for(int i=0;i<apple.length;i++){
      app=a+apple[i];
          if(app>=s && app<=t)
                {
                   count++;
                   app=0;
               }
        }
           for(int j=0;j<orang.length;j++){
      org=b+orang[j];
          if(org>=s && org<=t)
                {
                   temp++;
org=0;
               }
}
          System.out.println(count);
          System.out.println(temp);

        }
        
   }
class bharath {
public static void main(String args[])
{
  chaitanya obj = new chaitanya();
  
}
}


  