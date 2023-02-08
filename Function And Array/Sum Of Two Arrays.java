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
   
    int m=scn.nextInt();
    int []b=new int[n];
    for(int i=0;i<m;j++)
    b[i]=scn.nextInt();
    
    int k=Math,max(n,m)-1;
    int []c=new int[k];
    int ca=0;
    int i=n-1,int j=m-1;
    while(k>=0)
    {
        int x=(i>=0)?a[i]:0;
        int y=(j>=0)?b[j]:0;
        
        int sum=x+y+ca;
        c[k]=sum%10;
        ca=sum/10;
        i--;j--;k--;
    }
    if(ca>0)
    System.out.println(ca);
    for(int val:ans)
    System.out.println(val);
 }

}
