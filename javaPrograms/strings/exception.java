import java.lang.*;
import java.util.*;
import java.io.*;   
class exception {
    public static void readFile() throws IOException {
    FileReader file = new FileReader("example.txt");
    file.read();
 }
    public static void main(String args[]){
    exception e = new exception();
   try{
    e.readFile();
      }
      catch(IOException ex){
           System.out.println(ex);
      }
     }  
}

  

   