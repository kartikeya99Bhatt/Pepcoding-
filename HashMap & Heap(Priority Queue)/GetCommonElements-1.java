import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int []a=new int[n1];
    for(int i=0;i<n1;i++)
    {
        a[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    int []b=new int[n2];
    for(int i=0;i<n2;i++)
    {
       b[i]=scn.nextInt();
    }
    GetCommonElement (a,b);
 }


 public static void  GetCommonElement (int []a,int []b)
 {
     HashMap<Integer,Integer>fmap=new HashMap<>();
   

     for(int i=0;i<a.length;i++)
     {
         fmap.put(a[i],fmap.getOrDefault(a[i],0)+1);
     }

   
     for(int i=0;i<b.length;i++)
    {
        if(fmap.containsKey(b[i]))
        {
            System.out.println(b[i]);
            fmap.remove(b[i]);
        }
    }

 }

}
