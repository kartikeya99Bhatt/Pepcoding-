import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=scn.nextInt();
    }
    int val=scn.nextInt();
    int ceil=0;
    int floor=0;
    int lo=0;int hi=n-1;
    
    while(lo<=hi)
    {
      int mid=lo+(hi-lo)/2 ;
      if(a[mid]==val)
      {
          ceil=a[mid];
          floor=a[mid];
         break;    
      }
      else if(a[mid]<val)
      {
         floor=a[mid];
         lo=mid+1;
      }
      else if(a[mid]>val)
      {
         ceil=a[mid];
         hi=mid-1;
      }
      
    }
    System.out.println(ceil+"\n"+floor);
 }

}
