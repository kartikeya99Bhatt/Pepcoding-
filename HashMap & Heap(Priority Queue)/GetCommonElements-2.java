import java.io.*;

import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
	  //Write your code here
      Scanner scn=new Scanner(System.in);
      int n1=scn.nextInt();
      int []a=new int[n1];
      for(int i=0;i<a.length;i++)
      {
          a[i]=scn.nextInt();
      }
      int n2=scn.nextInt();
      int []b=new int[n2];
      for(int i=0;i<n2;i++)
      {
          b[i]=scn.nextInt();
      }
      GetCommonElement(a,b);
  }
 public static void GetCommonElement(int []a,int []b)
 {
     HashMap<Integer,Integer>f1map=new HashMap<>();
     HashMap<Integer,Integer>f2map=new HashMap<>();

     for(int i=0;i<a.length;i++)
     {
         f1map.put(a[i], f1map.getOrDefault(a[i],0)+1);
     }

     for(int i=0;i<b.length;i++)
     {
         f2map.put(b[i], f2map.getOrDefault(b[i],0)+1);
     }

    for(int val:b)
    {
        if(f1map.containsKey(val) && f1map.get(val)>0 && f2map.containsKey(val) && f2map.get(val)>0  )
        {
              System.out.println(val);
              f1map.put(val,f1map.get(val)-1);
              f2map.put(val,f2map.get(val)-1);
        }
        
    }


 }
}
