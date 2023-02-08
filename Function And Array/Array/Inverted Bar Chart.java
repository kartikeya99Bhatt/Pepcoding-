import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int []a=new int[n];
    for(int i=0;i<n;i++)
    a[i]=scn.nextInt();
    
    int ser=scn.nextInt();
    
    int lo=firstIndex(a,ser);
    int hi=lastIndex(a,ser);
    System.out.println(lo +"\n"+ hi);
 }
public static int firstIndex(int []a,int ser)
{
    int ans=-1;
  int lo=0;int hi=a.length-1;
  while(lo<=hi)
  {
      int mid=lo+(hi-lo)/2;
      if(a[mid]==ser)
      {
        ans=mid;
        hi=mid-1;
      }
      else if(a[mid]<ser)
      {
        lo=mid+1;
      }
      else if(a[mid]>ser)
      {
         hi=mid-1; 
      }
  }
  return ans;
}

public static int lastIndex(int []a,int ser)
{
    
    int ans=-1;
  int lo=0;int hi=a.length-1;
  while(lo<=hi)
  {
      int mid=lo+(hi-lo)/2;
      if(a[mid]==ser)
      {
        ans=mid;
        lo=mid+1;
      }
      else if(a[mid]<ser)
      {
        lo=mid+1;
      }
      else if(a[mid]>ser)
      {
         hi=mid-1; 
      }
  }
  return ans;
}

}
