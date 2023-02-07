import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner (System.in);
    int n1=scn.nextInt();
    int []a=new int[n1];
    for(int i=0;i<n1;i++)
    a[i]=scn.nextInt();
    
    int n2=scn.nextInt();
    int []b=new int[n2];
    for(int i=0;i<n2;i++)
    b[i]=scn.nextInt();
    
    int c=0;int i= n1-1;int j= n2-1;int temp=1;
    int ans=0;
    while(j>=0||c>0||i>=0)
    {
       int ae=(i>=0)?a[i]:0;
       int be=(j>=0)?b[j]:0;
       int sum=ae+be+c;
       int rem=sum%10;
       c=sum/10;
       ans+=rem*temp;
       i--;
       j--;
       temp=temp*10;
      
    }
    // printing the ans
   StringBuilder sb=new StringBuilder(ans+"");
   for( i=0;i<sb.length();i++)
   System.out.println(sb.charAt(i));
    
 }

}
