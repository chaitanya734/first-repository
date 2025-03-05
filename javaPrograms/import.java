import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    Scanner s = new Scanner(System.in);
    int arr[]=new int[5];
    int sum[]=new int[5];
    int temp=0;
    Result()
    {
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
    }
    void add(){
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                    sum[i]=sum[i]+arr[j];
                }
            }
        }
        for(int i=0;i<sum.length-1;i++)
        {
            for(int j=0;j<sum.length-1;j++)
            {
                if(sum[j+1]>sum[i])
                {
                    temp=sum[i];
                    sum[i]=sum[i+1];
                    sum[i+1]=temp;
                }
            }
        }
        System.out.println(sum[sum.length-1]+" "+sum[0]);
        
        
    }
}
 class Solution {
    public static void main(String[] args) {
      
      Result obj = new Result();
       obj.add();
    }
}
