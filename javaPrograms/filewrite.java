import java.io.*;
import java.lang.*;
class filewrite{

 public static void main(String args[]) throws Exception
{
  File f1 = new File("C:\\Users\\HP\\OneDrive\\Desktop\\WhatsApp.jpg");
   FileInputStream f = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\WhatsApp Image 2023-11-23 at 10.09.12_43feb5b4.jpg");
  BufferedInputStream bi = new BufferedInputStream(f);
    FileOutputStream fo = new FileOutputStream("C:\\Users\\HP\\OneDrive\\Desktop\\Whapp.jpg");
   BufferedOutputStream bo = new BufferedOutputStream(fo);
   File f2 = new File(fo);
    int ch;
   while((ch=bi.read())!=-1)
   {
    bo.write(ch);
   }
  String s1 = f.getAbsoluteFile();
 f1.delete();
f2.delete();
f.close();
 fo.close();
   
    
 }
}